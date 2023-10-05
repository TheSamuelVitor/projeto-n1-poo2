public class App {
    public static void main(String[] args) throws Exception {
        Oculos oculos = new Oculos();

        PecaOculos peca = new Antirreflexo(oculos);
        peca = new Grau(peca);
        peca = new Transition(peca);
        peca = new Lente(peca, "Multifocal");

        System.out.println("\n" + peca.getNome());
        System.out.println("Valor: "+ peca.getValor());
    }
}
