import operacoes.Operacao;

public class CalcOne extends Calculadora {
  
  public CalcOne(Operacao operacao) {
    this.setOperacao(operacao);
  }

  @Override
  public double Calcular() {
    return super.Calcular();
  }

  @Override
  public void setPreco1(double preco1) {
    super.setPreco1(preco1);
  }

  @Override
  public void setPreco2(double preco2) {
    super.setPreco2(preco2);
  }

}
