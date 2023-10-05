/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package botao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EMANOEL SILVA
 */
public class Button {
    private List<AcaoDoClique> acoesDoClique = new ArrayList<>();

    // Método para adicionar uma ação de clique ao botão
    public void adicionarAcaoDeClique(AcaoDoClique acao) {
        acoesDoClique.add(acao);
    }

    // Método para simular o clique do botão e executar todas as ações configuradas
    public void clicar() {
        System.out.println("Botao clicado.");
        for (AcaoDoClique acao : acoesDoClique) {
            acao.executar();
        }
    }

}
