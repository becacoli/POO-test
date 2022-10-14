package primeiraquestao;

import java.util.ArrayList;

public class Purchase {
  private ArrayList<Product> shoppingBag = new ArrayList<>();
  
  void AddProduct(Product product) {
    shoppingBag.add(product);
  }
  
  double total(){
    double total = 0;
    
    for (Product produto : shoppingBag){
      total += produto.getTotal();	
    }
    return total;
  }

  /**
   * 
   */
  void AllProducts(){
    for (Product produto : shoppingBag) System.out.println(produto);
  }
}