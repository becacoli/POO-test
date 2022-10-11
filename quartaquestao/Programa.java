package quartaquestao;

public class Programa {
  public static void main(String[] args){
    Pix pix = new Pix();
    Payment pagamento = new Payment(pix);
    pagamento.pagar();

    Boleto boleto = new Boleto();
    pagamento.setPaymentMethod(boleto);
    pagamento.pagar();
  }
}
