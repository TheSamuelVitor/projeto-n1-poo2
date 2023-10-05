/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_onlinee;

import java.util.List;

/**
 *
 * @author emanoel
 */
public class Cliente implements Observador {
    private List<Cliente> clientes;

    private String email;

    public Cliente(String email) {
        this.email = email;
        Cliente cliente = new Cliente(email);
        clientes.add(cliente);
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notficacao  para " + email + ":  " + mensagem);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void notifica_Clintes(List<NotebookBase> notebooks) {

        for (Cliente cliente : clientes) {
            for (NotebookBase notebook: notebooks) {
                cliente.notificar(notebook.toString());
            }
        }

    }

    /*
     * public void notifica_Clientes(List<NotebookBase> notebooks, String mensagem)
     * {
     * for (Cliente cliente : clientes) {
     * cliente.notificar("Mensagem sobre notebooks: " + mensagem);
     * }
     * }
     * 
     * 
     * 
     * Cliente cliente1 = new Cliente("cliente1@email.com");
     * Cliente cliente2 = new Cliente("cliente2@email.com");
     * 
     * List<Cliente> listaDeClientes = new ArrayList<>();
     * listaDeClientes.add(cliente1);
     * listaDeClientes.add(cliente2);
     * 
     * String mensagem = "Novos notebooks estão disponíveis!";
     * cliente1.notifica_Clientes(listaDeNotebooks, mensagem);
     * 
     * 
     * 
     * 
     */

    /*
     * 
     * import java.util.List;
     * 
     * public class Cliente implements Observador {
     * private String email;
     * 
     * public Cliente(String email) {
     * this.email = email;
     * }
     * 
     * @Override
     * public void notificar(String mensagem) {
     * System.out.println("Notificação para " + email + ": " + mensagem);
     * }
     * 
     * public String getEmail() {
     * return email;
     * }
     * 
     * public void setEmail(String email) {
     * this.email = email;
     * }
     * 
     * public void notifica_Clientes(List<NotebookBase> notebooks) {
     * for (NotebookBase notebook : notebooks) {
     * String mensagem = "Novo notebook disponível: " + notebook.getModelo();
     * notificar(mensagem);
     * }
     * }
     * }
     * 
     * 
     */

}
