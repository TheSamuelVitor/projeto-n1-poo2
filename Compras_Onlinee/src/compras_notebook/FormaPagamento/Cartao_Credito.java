/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook.FormaPagamento;

//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author EMANOEL SILVA
 */
//Estrategica Concreta
public class Cartao_Credito implements Estrategia_Pagamento{
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
        System.out.println("");
        System.out.println("Pagamento via Cartao de Credito!");
        System.out.println("Parcelado em: "+parcela+" Vezes");
        System.out.println("Valor: R$ " + valor/parcela);
    }

}
    

