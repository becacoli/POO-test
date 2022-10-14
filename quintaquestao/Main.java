package quintaquestao;

public class Main {
  public static void main(String[] args) {

    UFALBluetooth bluetooth = new PackageBluetoothFormat();
    bluetooth.openConnection();
    bluetooth.processData();
    bluetooth.closeConnection();

    System.out.println("--------------------------------");

    UFALBluetooth bluetooth2 = new SerialBluetoothFormat();
    bluetooth2.openConnection();
    bluetooth2.processData();
    bluetooth2.closeConnection();
  }
}
