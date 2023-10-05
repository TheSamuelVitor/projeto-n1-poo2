/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_onlinee;

/**
 *
 * @author EMANOEL SILVA
 */
public class MemoriaRAM extends DecoradorDeProduto {

    private double preco;

    public MemoriaRAM(Notebooks carrinho, double d) {
        super(carrinho);
        this.preco = d;
        carrinho.notificarObservadores("MemoriaRAM adicionado ao notebook");
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() + preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
