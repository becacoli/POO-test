package segundaquestao;

public class Program {
  public static void main(String[] args) {
    Estacionamento estacionamento = new Estacionamento();
    estacionamento.estacionarCarro(new Carro("Uno", 5, 2));
    estacionamento.estacionarCarro(new Carro("Civic", 5, 1));

    estacionamento.listarCarros();

    System.out.printf("\n O estacionamento possui %d pessoas", estacionamento.getTotalDePessoasNoEstacionamento());

    estacionamento.estacionarCarro(new Carro("Gol", 4, 5));

  }
}
