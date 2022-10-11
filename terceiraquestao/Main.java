package terceiraquestao;

public class Main {
  public static void main(String[] args) {

    Forms forms = new Forms();
    App app = new App(forms);
    app.logar();

    iCloud icloud = new iCloud();
    app.setLogin(icloud);
    app.logar();
  }
}
