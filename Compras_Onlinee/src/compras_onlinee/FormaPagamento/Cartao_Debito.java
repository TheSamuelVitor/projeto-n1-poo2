/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_onlinee.FormaPagamento;

import compras_onlinee.Observador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanoel
 */
//Estrategica Concreta
public class Cartao_Debito implements Estrategia_Pagamento {
    private List<Observador> observadores = new ArrayList<>();

    private double saldo = 1500.0; // valor disponivel na conta

//    public Cartao_Debito() {
//
//    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void pagar(double valor) {
        // double valor = 0.0;

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Pagamento via Cartao de Debito realizado com sucesso!");
            System.out.println("Valor: " + valor);
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento!");
        }
    }

//     @Override
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
