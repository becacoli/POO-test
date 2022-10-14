package quintaquestao;

public abstract class UFALBluetooth {
   public void openConnection(){
    System.out.println("Opening connection");
   }

   public abstract void processData();

   public void closeConnection(){
    System.out.println("Closing connection");
   }
}
