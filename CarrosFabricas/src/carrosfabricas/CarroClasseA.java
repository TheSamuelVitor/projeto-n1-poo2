/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrosfabricas;

import carrosfabricas.Pecas.Peca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emanoel
 */
// Classe concreta para representar um carro classe A
public class CarroClasseA implements Carros {

    private final String nome;
    private final List<Peca> pecas;

    public CarroClasseA(String nome) {
        this.nome = nome;
        this.pecas = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return nome;
        }

    @Override
    public double getValor() {
          // Calcula o valor do carro somando o valor das peças
        double valor = 0;
        for (Peca peca : pecas) {
            valor += peca.getValorAgregado();
        }
        return valor;
    }
    
     // Adiciona uma peca ao carro
    @Override
    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }
    
//    @Override
//    public String toString() {
//        System.out.println("");
//        return "Carro " + nome + " (classe A) - valor: R$" + getValor();
//    }
}
