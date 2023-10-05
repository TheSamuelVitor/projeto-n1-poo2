/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrosfabricas.Pecas;

/**
 *
 * @author emanoel
 */
public class Motor extends Peca {
    private final String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double getValorAgregado() {
        return switch (tipo) {
            case "A"-> 5000;
            case "B" -> 3000;
            default ->throw new IllegalArgumentException("Tipo de motor invalido");
        };
    }
}
