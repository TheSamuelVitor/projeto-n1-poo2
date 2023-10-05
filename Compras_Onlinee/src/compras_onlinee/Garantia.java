/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_onlinee;

/**
 *
 * @author EMANOEL SILVA
 */
class Garantia extends DecoradorDeProduto {

    private double preco;

    public Garantia(Notebooks notebook, double preco) {
        super(notebook);
        this.preco = preco;
        notebook.notificarObservadores("Garantia adicionada ao notebook");
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() + preco;
    }

}
