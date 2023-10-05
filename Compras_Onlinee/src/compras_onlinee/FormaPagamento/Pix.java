/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_onlinee.FormaPagamento;
//
//import compras_online.Observador;
//import java.util.ArrayList;
//import java.util.List;
/**
 *
 * @author EMANOEL SILVA
 */
//Estrategica Concreta
public class Pix implements Estrategia_Pagamento{
    //private List<Observador> observadores = new ArrayList<>();
    private double valor;

    //public Pix(double valor) {
    public Pix() {
//        this.chave = chave;
//        this.descricao = descricao;
        //this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
   
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Valor no PIX: " + valor);
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