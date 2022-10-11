package quartaquestao;

public class Payment {
  private PaymentMethod paymentMethod;

  public Payment(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void setPaymentMethod(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public void pagar(){
    paymentMethod.pagar();
  }
}
