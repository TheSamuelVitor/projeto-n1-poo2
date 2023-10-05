public class Lente extends PecaOculos {
  public Lente(Componente componente, String tipo) {
    super(componente);

    if (tipo == "Multifocal") {
      nome = "- Multifocal";
      valor = 100;
    } else if (tipo == "Monofocal") {
      nome = "- Monofocal";
      valor = 100;
    }
  }
}
