/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras_notebook;

/**
 *
 * @author EMANOEL SILVA
 */
public class NotebookBase implements Notebook {

    @Override
    public String getDescricao() {

        return "Notebook Padrao";

    }

    @Override
    public double getValor() {
        return 1000.0;
    }

}
