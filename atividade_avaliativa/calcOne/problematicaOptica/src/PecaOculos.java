public class PecaOculos extends Componente {

  private Componente componente;

  public PecaOculos(Componente componente) {
    this.componente = componente;
  }

  public Componente getComponente() {
    return componente;
  }

  @Override
  public String getNome() {
    return componente.getNome() + "\n" + this.nome;
  }

  @Override
  public double getValor() {
    return componente.getValor() + this.valor;
  }
}
