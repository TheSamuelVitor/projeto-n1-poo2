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

public class PlacaDeVideo extends DecoradorDeNotebook{

    public PlacaDeVideo(Notebook decoradorNotebook) {
        super(decoradorNotebook);
    }
    
    
    @Override
    public String getDescricao() {
        return super.getDescricao()+ ", Placa de video";
    }

    @Override
    public double getValor() {
        return super.getValor() + 200.0; //Atribuito valores
        
    }
}
