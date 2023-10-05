/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrosfabricas.Pecas;

/**
 *
 * @author emanoel
 */
public class SistemaDeFreios extends Peca {
    private final String tipo;

    public SistemaDeFreios(String tipo) {
        this.tipo = tipo;
        }
    

    @Override
    public double getValorAgregado() {
        return switch (tipo) {
            case "A"-> 12000;
            case "B" -> 800;
            default ->throw new IllegalArgumentException("Tipo de motor invalido");
                     };
      
                }
}
