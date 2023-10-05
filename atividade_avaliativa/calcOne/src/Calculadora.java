import operacoes.Operacao;

public class Calculadora {

  private double preco1;
  private double preco2;
  private Operacao operacao;

  public void setPreco1(double preco1) {
    this.preco1 = preco1;
  }

  public void setPreco2(double preco2) {
    this.preco2 = preco2;
  }

  public double Calcular() {
    return operacao.operacao(preco1, preco2);
  }

  public void setOperacao(Operacao operacao) {
    this.operacao = operacao;
  }

}
