/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrosfabricas.Pecas;

/**
 *
 * @author emanoel
 */
public class Bateria extends Peca {
     private final String tipo;

    public Bateria(String tipo) {
        this.tipo = tipo;
    }
    
     @Override
    public double getValorAgregado() {
        return switch (tipo) {
            case "A"-> 500;
            case "B" -> 300;
            default ->throw new IllegalArgumentException("Tipo de Suspensao invalido");
        };
    } 
}
