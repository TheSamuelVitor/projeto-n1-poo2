/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package carrosfabricas;

import carrosfabricas.Pecas.Peca;

/**
 *
 * @author emanoel
 */
// Interface para representar um carro
public interface Carros {
    // Retorna o nome do carro (verificar se vai ficar sendo privado)
    String getNome();
    // Retorna o valor do carro (verificar se vai ficar sendo privado)
    double getValor();
    //criar pecas
    public void adicionarPeca(Peca criarPeca);
}
