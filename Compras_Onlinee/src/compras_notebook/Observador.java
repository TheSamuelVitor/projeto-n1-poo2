/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package compras_notebook;

/**
 *
 * @author EMANOEL SILVA
 */

// Observer para notificar clientes sobre adições ao carrinho

public interface Observador {
    void notificar(String mensagem);
}
