package operacoes;

public class Soma implements Operacao {
  @Override
  public double operacao(double valor1, double valor2) {
    return valor1 + valor2;
  }
}
