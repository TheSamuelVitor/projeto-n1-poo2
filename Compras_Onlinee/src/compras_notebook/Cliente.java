/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook;

/**
 *
 * @author EMANOEL SILVA
 */
public class Cliente implements Observador {

    private String email;

    public Cliente(String email) {
        this.email = email;
    }

    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificacao para " + email + ": " + mensagem);

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

}



