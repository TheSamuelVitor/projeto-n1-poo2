/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook.FormaPagamento;


/**
 *
 * @author EMANOEL SILVA
 */
public class Forma_Pagamento {

    private Estrategia_Pagamento formaDePagamento;

    public Estrategia_Pagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(Estrategia_Pagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void realizarPagamento(double valor) {
        formaDePagamento.pagar(valor);
    }
}
