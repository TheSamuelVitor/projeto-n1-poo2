/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrosfabricas;

import carrosfabricas.Pecas.SistemaDeFreios;
import carrosfabricas.Pecas.Suspensao;
import carrosfabricas.Pecas.Pneus;
import carrosfabricas.Pecas.Peca;
import carrosfabricas.Pecas.Motor;
import carrosfabricas.Pecas.FiltroDeAr;
import carrosfabricas.Pecas.CaixaDeCambio;
import carrosfabricas.Pecas.Bateria;

/**
 *
 * @author emanoel
 */
// Classe concreta para representar a fábrica de carros classe B
public class FabricaCarrosClasseB extends FabricaCarros {

    @Override
    public Carros criarCarro(String nome) {
        return new CarroClasseB(nome);
    }

    @Override
    public Peca criarPeca(String tipo) {
        switch (tipo) {
            case "Motor" -> {
                return  new Motor("B");
            }
            case "Caixa de Cambio" -> {
                return new CaixaDeCambio("B");
            }
             case "Bateria" -> {
                return new Bateria("B");
         }
             case "Suspensao"->{
                return new Suspensao("B");
            }
             case "Sistema de freios"->{
                return new SistemaDeFreios("B");
            }
             case "Filtro de ar"->{
                return new FiltroDeAr("B");
            }
             case "Pneus"->{
                return new Pneus("B");
            }
               
            default -> throw new IllegalArgumentException("Tipo de peca invalida");
                     }
            }

}
