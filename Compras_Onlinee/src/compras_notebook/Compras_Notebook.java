/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compras_notebook;

import compras_notebook.FormaPagamento.Forma_Pagamento;
import compras_notebook.FormaPagamento.Cartao_Credito;
import compras_notebook.FormaPagamento.Cartao_Debito;
import compras_notebook.FormaPagamento.Pix;

/**
 *
 * @author EMANOEL SILVA
 */
public class Compras_Notebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loja_De_Notebooks loja = new Loja_De_Notebooks();
        
        
        // Inicializa um notebook de compras base
        Notebook notebook = new NotebookBase();
        notebook = new Garantia(notebook);
        notebook = new MemoriaRAM(notebook);
        notebook = new PlacaDeVideo(notebook);
        
        CarrinhoDeNotebook carrinho = new CarrinhoDeNotebook();
        
        Cliente cliente = new Cliente("ZeBedeu@gmail.com");
        Cliente cliente1 = new Cliente("FulanoGomes@gmail.com");
        Cliente cliente2 = new Cliente("Latrel@gmail.com");
        Cliente cliente3 = new Cliente("Bibi@gmail.com");
        Cliente cliente4 = new Cliente("bigbig@gmail.com");
        Cliente cliente5 = new Cliente("rosachoque@gmail.com");
        
        loja.adicionarCliente(cliente);
        loja.adicionarCliente(cliente1);
        loja.adicionarCliente(cliente2);
        loja.adicionarCliente(cliente3);
        loja.adicionarCliente(cliente4);
        loja.adicionarCliente(cliente5);
        
        carrinho.addObserver(loja);
        
        System.out.println("Notebook 1 \n");
        carrinho.adicionarNotebook(notebook);
        
        loja.notificarPromocao(notebook);

        System.out.println("");
        //notebook.adicionarObservador(cliente);

        // Calcula o total do carrinho
        double total = notebook.getValor();
        System.out.println("Valor final do notebook: R$" + total);

        //Pagamentos
        Forma_Pagamento pagamento = new Forma_Pagamento();
        Cartao_Credito cartaoDeCredito = new Cartao_Credito(4);
        Cartao_Debito cartaoDebito = new Cartao_Debito();
        Pix pix = new Pix();

        //Forma de pagamentos
        pagamento.setFormaDePagamento(cartaoDeCredito);
        pagamento.realizarPagamento(total);

        pagamento.setFormaDePagamento(cartaoDebito);
        pagamento.realizarPagamento(total);
        
        pagamento.setFormaDePagamento(pix);
        pagamento.realizarPagamento(total);
        
        
        System.out.println("");
        
        
        System.out.println("Notebook 2\n");
        
        //CarrinhoDeNotebook carrinho = new CarrinhoDeNotebook();

        //carrinho.addObserver(cliente1);
        Notebook notebook2 = new NotebookBase();

        notebook2 = new Garantia(notebook2);
        notebook2 = new MemoriaRAM(notebook2);
        notebook2 = new PlacaDeVideo(notebook2);
        carrinho.adicionarNotebook(notebook2);
        
        Forma_Pagamento pagamento2 = new Forma_Pagamento();
        double total2 = notebook2.getValor();
        System.out.println("Valor final do notebook: R$" + total2);

        Cartao_Credito cartaoDeCredito2 = new Cartao_Credito(4);
        Cartao_Debito cartaoDebito2 = new Cartao_Debito();
        Pix pix2 = new Pix();

        //Forma de pagamentos
        pagamento2.setFormaDePagamento(cartaoDeCredito2);
        pagamento2.realizarPagamento(total2);

        pagamento2.setFormaDePagamento(cartaoDebito2);
        pagamento2.realizarPagamento(total2);

        pagamento2.setFormaDePagamento(pix2);
        
        pagamento2.realizarPagamento(total2);
        //carrinho2.finalizarCompra(pix2);
        
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Valor total do carrinho");
        
        double totalNoCarrinho = carrinho.calcularPrecoTotal();
        
        System.out.println("Total: "+totalNoCarrinho);
        
        
        
        
        
    }
    
}
