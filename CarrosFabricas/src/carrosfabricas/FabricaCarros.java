/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrosfabricas;

import carrosfabricas.Pecas.Peca;

/**
 *
 * @author emanoel
 */
// Classe abstrata para representar uma fábrica de carros
public abstract class FabricaCarros {

    // Retorna um objeto da classe Carro
    public abstract Carros criarCarro(String nome);
    // Retorna um objeto da classe Peca
    public abstract Peca criarPeca(String tipo);

}
