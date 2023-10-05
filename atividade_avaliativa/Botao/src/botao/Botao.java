/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package botao;

/**
 *
 * @author EMANOEL SILVA
 */

// 3 questao
public class Botao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Criando uma instância do botão
        Button botao = new Button();

        // Configurando ações de clique
        botao.adicionarAcaoDeClique(() -> {
            System.out.println("Acao 1 executada.");
        });

        botao.adicionarAcaoDeClique(() -> {
            System.out.println("Acao 2 executada.");
        });

        // Simulando o clique do botão
        botao.clicar();

    }
}
