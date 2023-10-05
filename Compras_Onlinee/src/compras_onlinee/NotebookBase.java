/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_onlinee;

import compras_onlinee.FormaPagamento.Estrategia_Pagamento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EMANOEL SILVA
 */
public class NotebookBase implements Notebooks {

    // adicionando estrategica de pagamento
    private Estrategia_Pagamento formaDePagamento;

    // Adicionando os Observadores
    private final List<Observador> observadores = new ArrayList<>();

    @Override
    public double calcularTotal() {
        return 500.0; // Notebooks inicialmente
    }

    public Estrategia_Pagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(Estrategia_Pagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void realizarPagamento(double valor) {
        formaDePagamento.pagar(valor);
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.notificar(mensagem);
        }
    }
}
