package quartaquestao;

public class Programa {
  public static void main(String[] args){
    Pix pix = new Pix();
    Payment pagamento = new Payment(pix);
    pagamento.pagar();

    BillPayment boleto = new BillPayment();
    pagamento.setPaymentMethod(boleto);
    pagamento.pagar();
  }
}
