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
public class CarroClasseB implements Carros{
private final String nome;
    private final List<Peca> pecas;

    public CarroClasseB(String nome) {
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
   
     // Adiciona uma peça ao carro
@Override
    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }
    
    @Override
    public String toString() {
        return "Carro " + nome + " (classe B) - valor: R$" + getValor();
    }    
}
