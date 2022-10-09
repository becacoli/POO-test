package primeiraquestao;

import java.util.ArrayList;

public class Program {
  public static void main(String[] args) {
    Compra compra = new Compra();

    ArrayList<Item> saboresPizza = new ArrayList<>();
    
    saboresPizza.add(new Item("Carne seca", 24));
    saboresPizza.add(new Item("4 queijos", 20));
    compra.AddProduct(new Produto("Pizza", saboresPizza));

    compra.AllProducts();
    System.out.println("Valor total: " + compra.total());
  }
}
