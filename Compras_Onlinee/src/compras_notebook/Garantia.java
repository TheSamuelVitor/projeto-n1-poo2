/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook;

/**
 *
 * @author EMANOEL SILVA
 */
// Componentes concretos que podem ser adicionados ao Notebook

class Garantia extends DecoradorDeNotebook {
        //private double preco;
    
    public Garantia(Notebook decoradorNotebook) {
        super(decoradorNotebook);
    }
    
     
    @Override
    public String getDescricao() {
        return super.getDescricao()+ ", Garantia estendida";
    }

    @Override
    public double getValor() {
        return super.getValor() + 100.0; //Atribuito valores
        
    }
    

}
