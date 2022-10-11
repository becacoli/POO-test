package quintaquestao;

public abstract class UFALBluetooth {
   public void estabelecerConnection(){
    System.out.println("Estabelecendo conexão");
   }

   public abstract void processarDados();

   public void fecharConnection(){
    System.out.println("Fechando conexão");
   }
}
