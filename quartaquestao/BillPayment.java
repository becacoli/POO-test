package quartaquestao;

public class BillPayment extends PaymentMethod {

  @Override
  public void pay() {
    System.out.println("Efetuando pagamento com boleto...");
  }
  
}
