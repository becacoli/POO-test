package primeiraquestao;

import java.util.ArrayList;

public class Program {
  public static void main(String[] args) {
    Purchase purchase = new Purchase();

    ArrayList<Item> flavorsPizza = new ArrayList<>();
    
    flavorsPizza.add(new Item("Carne seca", 24));
    flavorsPizza.add(new Item("4 queijos", 20));
    purchase.AddProduct(new Product("Pizza", flavorsPizza));

    purchase.AllProducts();
    System.out.println("Total Value: " + purchase.total());
  }
}
