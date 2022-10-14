package segundaquestao;

public class Car{
  private String model;
  private int maxCapacity;
  private int personQuantity;

  
  public Car(String model, int maxCapacity, int personQuantity) {
    
    if (personQuantity > maxCapacity){
      System.out.printf("\n The model %s doesn't hold more than %d people", model, maxCapacity);
      System.exit(1);
    }
    this.model = model;
    this.maxCapacity = maxCapacity;
    this.personQuantity = personQuantity;
  }
  
  public String getModel() {
    return model;
  }

  public int getMaxCapacity() {
    return maxCapacity;
  }

  public int getPersonQuantity() {
    return personQuantity;
  }
  
  //  representação string de um objeto
  @Override
  public String toString() {
    return String.format("\n Model: %s \n Maximum capacity: %d\n Number of people in the car: %d", model, maxCapacity, personQuantity);
  }
}