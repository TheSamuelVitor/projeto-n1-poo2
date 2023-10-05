/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrosfabricas.Pecas;

/**
 *
 * @author emanoel
 */
public class CaixaDeCambio extends Peca {
        private final String tipo;

    public CaixaDeCambio(String tipo) {
        this.tipo = tipo;
    }
       @Override
    public double getValorAgregado() {
          return switch (tipo) {
            case "A"-> 3500;
            case "B" -> 2000;
            default ->throw new IllegalArgumentException("Tipo de Caixa de cambio invalido");
        };
    }
}
