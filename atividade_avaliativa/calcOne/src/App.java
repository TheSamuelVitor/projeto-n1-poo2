import operacoes.Soma;

public class App {
    public static void main(String[] args) throws Exception {
        CalcOne calculadora = new CalcOne(new Soma());
        calculadora.setPreco1(2);
        calculadora.setPreco2(4);
        System.out.println(calculadora.Calcular());
    }
}
