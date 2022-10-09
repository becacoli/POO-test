package primeiraquestao;

import java.util.ArrayList;

public class Compra {
  private ArrayList<Produto> shoppingBag = new ArrayList<>();
  
  void AddProduct(Produto produto) {
    shoppingBag.add(produto);
  }
  
  double total(){
    double total = 0;
    
    for (Produto produto : shoppingBag){
      total += produto.getTotal();	
    }
    return total;
  }

  /**
   * 
   */
  void AllProducts(){
    for (Produto produto : shoppingBag) System.out.println(produto);
  }
}