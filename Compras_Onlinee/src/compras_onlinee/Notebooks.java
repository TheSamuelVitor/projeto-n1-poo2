/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package compras_onlinee;

/**
 *
 * @author EMANOEL SILVA
 */
public interface Notebooks {

    double calcularTotal();

    void adicionarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificarObservadores(String mensagem);
}
