package quartaquestao;

public class Boleto extends PaymentMethod {

  @Override
  public void pagar() {
    System.out.println("Efetuando pagamento com boleto...");
  }
  
}
