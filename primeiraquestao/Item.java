package primeiraquestao;

public class Item {

  private String name;
  private double value;

  Item(String name, double value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public double getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.format("Item name: %s\n\t - Item Value: %.2f", name, value);
  }

}
