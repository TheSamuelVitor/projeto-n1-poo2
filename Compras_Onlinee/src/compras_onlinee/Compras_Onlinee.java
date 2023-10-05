/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compras_onlinee;

import compras_onlinee.FormaPagamento.Cartao_Credito;
import compras_onlinee.FormaPagamento.Cartao_Debito;

/**
 *
 * @author EMANOEL SILVA
 */
public class Compras_Onlinee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Notebook 1 \n");
        // Inicializa um notebook de compras base
        Notebooks notebook = new NotebookBase();
        // criando o cliente
        Observador cliente = new Cliente("ZeBedeu@gmail.com");

        notebook.adicionarObservador(cliente);

        // Adiciona produtos ao carrinho
        // implementacao decorator
        notebook = new Garantia(notebook, 20.0);
        
        
        notebook.adicionarObservador(cliente);
        notebook = new MemoriaRAM(notebook, 30.0);

        System.out.println("");
        //notebook.adicionarObservador(cliente);

        // Calcula o total do carrinho
        double total = notebook.calcularTotal();
        System.out.println("Valor final do notebook: R$" + total);

        //Pagamentos
        Forma_Pagamento pagamento = new Forma_Pagamento();
        Cartao_Credito cartaoDeCredito = new Cartao_Credito(4);
        Cartao_Debito cartaoDebito = new Cartao_Debito();

        //Forma de pagamentos
        pagamento.setFormaDePagamento(cartaoDeCredito);
        pagamento.realizarPagamento(total);
        System.out.println("");

        pagamento.setFormaDePagamento(cartaoDebito);
        pagamento.realizarPagamento(total);
        
        
        

    }

}
