package segundaquestao;

import java.util.ArrayList;

public class Estacionamento {

  // instanciando pelo array por meio da classe Carro
  private ArrayList<Carro> carros = new ArrayList<>();

  void estacionarCarro(Carro carro) {
    carros.add(carro);
  }

  int getTotalDePessoasNoEstacionamento() {
    int totalDePessoas = 0;
    for (Carro carro : carros){
      // getQuantidadeDePessoas é um método de Carro, a gente instaciou por composição
      totalDePessoas += carro.getQuantidadeDePessoas();
    }
    return totalDePessoas;
  }

  public void listarCarros() {
    for (Carro carro : carros){
      System.out.println(carro);
    }
  }
}
