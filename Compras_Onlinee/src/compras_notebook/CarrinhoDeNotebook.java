/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EMANOEL SILVA
 */
// Carrinho de Compras como um Observable

public class CarrinhoDeNotebook implements Observador{
    private List<Observador> observers = new ArrayList<>();
    private List<Notebook> notebooks = new ArrayList<>();

    public void adicionarNotebook(Notebook notebook) {
        notebooks.add(notebook);
        
    }
    

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificacao para Carrinho: " + mensagem);

    }
    
    public void addObserver(Observador observer) {
        observers.add(observer);
    }


    
    // Notificador de promoção de notebook
    private void notificarPromocao(Notebook notebook) {
        
        System.out.println("Promocao de Notebook: "+ notebook.getDescricao());
        
        for(Observador observer: observers){
            if(observer instanceof Cliente cliente){
                cliente.notificar("Promocao de notebook para" + cliente.getEmail());
            
            
            }
        
        
        }

    } 
    
    public double calcularPrecoTotal() {
        double total = 0.0;
        for (Notebook notebook : notebooks) {
            total += notebook.getValor();
        }
        return total;
    }
    
}
