import operacoes.Operacao;

public class Calculadora {

  private double preco1;
  private double preco2;
  private Operacao operacao;

  public double getPreco1() {
    return preco1;
  }

  public void setPreco1(double preco1) {
    this.preco1 = preco1;
  }

  public double getPreco2() {
    return preco2;
  }

  public void setPreco2(double preco2) {
    this.preco2 = preco2;
  }

  public double Calcular() {
    return 0;
  }

  public Operacao getOperacao() {
    return operacao;
  }

  public void setOperacao(Operacao operacao) {
    this.operacao = operacao;
  }

  public double fazerOperacao() {
    return operacao.operacao(preco1, preco2);
  }

}
