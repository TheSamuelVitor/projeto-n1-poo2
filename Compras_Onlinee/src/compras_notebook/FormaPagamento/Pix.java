/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook.FormaPagamento;
//
//import compras_online.Observador;
//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author EMANOEL SILVA
 */
//Estrategica Concreta
public class Pix implements Estrategia_Pagamento {

    private double saldo = 3000;

    public double getValor() {
        return saldo;
    }

    public void setValor(double valor) {
        this.saldo = valor;
    }

    @Override
    public void pagar(double valor) {
       

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("");
            System.out.println("Pagamento via PIX!");
            System.out.println("Valor: " + valor);
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento!");
        }
    }
}
