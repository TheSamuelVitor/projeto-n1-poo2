/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook.FormaPagamento;



/**
 *
 * @author EMANOEL SILVA
 */
//Estrategica Concreta
public class Cartao_Debito implements Estrategia_Pagamento {

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
            System.out.println("");
            this.saldo -= valor;
            System.out.println("Pagamento via Cartao de Debito!");
            System.out.println("Valor: " + valor);
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento!");
        }
    }

}
