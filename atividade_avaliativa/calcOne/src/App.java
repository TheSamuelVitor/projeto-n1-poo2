import operacoes.Soma;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(Soma);
        calculadora.setPreco1(2);
        calculadora.setPreco2(4);
        calculadora.setOperacao(Soma);
    }
}
