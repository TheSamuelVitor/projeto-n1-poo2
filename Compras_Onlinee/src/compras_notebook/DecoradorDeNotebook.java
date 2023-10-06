/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook;



/**
 *
 * @author EMANOEL SILVA
 */
// Decorator abstrato para adicionar componentes ao Notebook
public abstract class DecoradorDeNotebook implements Notebook {
    protected Notebook decoradorNotebook;

    public DecoradorDeNotebook(Notebook decoradorNotebook) {
        this.decoradorNotebook = decoradorNotebook;
    }
    
    
    @Override
    public String getDescricao() {
        return decoradorNotebook.getDescricao();
    }

    @Override
    public double getValor() {
        return decoradorNotebook.getValor();
        
    }

}
