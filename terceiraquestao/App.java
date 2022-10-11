package terceiraquestao;

public class App {
  private Login login;

  public void logar() {
    login.logar();
  }

  public void setLogin(Login login) {
    this.login = login;
  }

  public App(Login login){
    this.login = login;
  }
}
