package segundaquestao;

import java.util.ArrayList;

public class Parking {

  // instanciando pelo array por meio da classe Carro
  private ArrayList<Car> cars = new ArrayList<>();

  void AddCar(Car car) {
    cars.add(car);
  }

  int getTotalPersonQuantity() {
    int total = 0;
    for (Car car : cars){
      // getQuantidadeDePessoas é um método de Carro, a gente instaciou por composição
      total += car.getPersonQuantity();
    }
    return total;
  }

  public void AllCars() {
    for (Car car : cars){
      System.out.println(car);
    }
  }
}
