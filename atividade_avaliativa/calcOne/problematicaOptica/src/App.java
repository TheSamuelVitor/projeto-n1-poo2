public class App {
    public static void main(String[] args) throws Exception {
        Oculos oculos = new Oculos();

        PecaOculos peca = new Antirreflexo(oculos);
        peca = new Grau(peca);
        peca = new Transition(peca);

        System.out.println(peca.getNome());
        System.out.println(peca.getValor());
    }
}
