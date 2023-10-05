/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_onlinee.FormaPagamento;

//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author EMANOEL SILVA
 */
//Estrategica Concreta
public class Cartao_Credito implements Estrategia_Pagamento{
    //private List<Observador> observadores = new ArrayList<>();
     private double valor;
     private int parcelar;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getParcelar() {
        return parcelar;
    }

    public void setParcelar(int parcelar) {
        this.parcelar = parcelar;
    }
      
    public Cartao_Credito(int parcelas) {        
        this.parcelar = parcelas;
    }    
    @Override
    public void pagar(double valor) {
        int parcela = this.parcelar;
        System.out.println("Pagamento via Cartao de Credito realizado com sucesso!");
        System.out.println("Parcelado em: "+parcela+" Vezes");
        System.out.println("Valor: R$ " + valor/parcela);
    }

//    @Override
//    public void adicionarObservador(Observador observador) {
//        observadores.add(observador);
//    }
//
//    @Override
//    public void removerObservador(Observador observador) {
//        observadores.remove(observador);
//    }
//
//    @Override
//    public void notificarClientes(String mensagem) {
//        for (Observador observador : observadores) {
//            observador.notificar(mensagem);
//        }
//    }
}
    

