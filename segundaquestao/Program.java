package segundaquestao;

public class Program {
  public static void main(String[] args) {
    Parking estacionamento = new Parking();
    estacionamento.AddCar(new Car("Uno", 5, 2));
    estacionamento.AddCar(new Car("Civic", 5, 1));

    estacionamento.AllCars();

    System.out.printf("\n There %d people in the parking", estacionamento.getTotalPersonQuantity());

    estacionamento.AddCar(new Car("Gol", 4, 5));

  }
}
