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
public class Loja_De_Notebooks implements Observador{
    
    private List<Observador> clientes = new ArrayList<>();

    public void adicionarCliente(Observador cliente) {
        clientes.add(cliente);
    }

    public void notificarPromocao(Notebook notebook) {
        System.out.println("Nova promocao: " + notebook.getDescricao());
        for (Observador observer : clientes) {
            observer.notificar("Nova promocao: " + notebook.getDescricao());
        }
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificacao para Loja: " + mensagem);
    }
    
}
