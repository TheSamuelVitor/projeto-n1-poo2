/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_onlinee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EMANOEL SILVA
 */
public class DecoradorDeProduto implements Notebooks {
    private List<Observador> observadores = new ArrayList<>();
    protected Notebooks carrinho;

    public DecoradorDeProduto(Notebooks carrinho) {
        this.carrinho = carrinho;
    }

    @Override
    public double calcularTotal() {
        return carrinho.calcularTotal();
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
