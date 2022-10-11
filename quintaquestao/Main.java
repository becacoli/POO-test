package quintaquestao;

public class Main {
  public static void main(String[] args) {

    UFALBluetooth bluetooth = new BluetoothEmPacotes();
    bluetooth.estabelecerConnection();
    bluetooth.processarDados();
    bluetooth.fecharConnection();

    System.out.println("--------------------------------");

    UFALBluetooth bluetooth2 = new BluetoothSerial();
    bluetooth2.estabelecerConnection();
    bluetooth2.processarDados();
    bluetooth2.fecharConnection();
  }
}
