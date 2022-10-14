package primeiraquestao;

import java.util.ArrayList;

public class Product {

  private String name;
  private ArrayList<Item> itens;

  public Product(String name, ArrayList<Item> itens) {
    this.name = name;
    this.itens = itens;
  }

  public String getName() {
    return name;
  }

  public ArrayList<Item> getItens() {
    return itens;
  }

  public double getTotal() {
    double valor = 0;
    for (Item item : itens)
      valor += item.getValue();
    return valor;
  }

  public double getValue() {
    double valor = 0;
    for (Item item : itens)
      valor += item.getValue();
    return valor;
  }

  @Override
  public String toString() {
    String itens = "";
    for (Item item : this.itens)
      itens += String.format("%s\n\n", item);

    return String.format("Nome do produto: %s\nValor: %.2f\nItens:\n%s\n", name,
        getValue(), itens);
  }

}
