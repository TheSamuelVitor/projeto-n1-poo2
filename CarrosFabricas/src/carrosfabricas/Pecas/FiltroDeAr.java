/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrosfabricas.Pecas;

/**
 *
 * @author emanoel
 */
public class FiltroDeAr extends Peca {
     private final String tipo;
    public FiltroDeAr(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double getValorAgregado() {
        return switch (tipo) {
            case "A"-> 100;
            case "B" -> 50;
            default ->throw new IllegalArgumentException("Tipo de Suspensao invalido");
        };
    }
    
}
