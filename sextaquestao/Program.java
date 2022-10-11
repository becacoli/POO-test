package sextaquestao;

import java.util.ArrayList;

public class Program {
  public static void main(String[] args) {
    ArrayList<ContaCorrente> contas = new ArrayList<>();

    Cliente cliente = new Cliente("Thiago", contas);

    contas.add(new ContaCorrente(350));
    contas.add(new ContaEspecial(500, 100));

    System.out.println("O cliente " + cliente.getNome() + " possui saldo de $ " + cliente.getContas().get(0) + " reais na Conta Corrente e $"+ cliente.getContas().get(1)+ " reais na Conta Especial.");
  }
}
