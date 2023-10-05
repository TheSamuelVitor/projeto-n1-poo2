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
// Classe concreta para representar a fabrica de carros classe A
public class FabricaCarrosClasseA extends FabricaCarros {

    @Override
    public Carros criarCarro(String nome) {
        return new CarroClasseA(nome);
    }

    @Override
    public Peca criarPeca(String tipo) {
        
        switch (tipo) {
            case "Motor" -> {
                return new Motor("A");
            }
            case "Caixa de Cambio" -> {
                return new CaixaDeCambio("A");
            }
                case "Bateria" -> {
                return new Bateria("A");
         }
            case "Suspensao"->{
                return new Suspensao("A");
            }
            case "Sistema de freios"->{
                return new SistemaDeFreios("A");
            }
             case "Filtro de ar"->{
                return new FiltroDeAr("A");
            }
             case "Pneus"->{
                return new Pneus("A");
            }
            
            default -> throw new IllegalArgumentException("Tipo de peca invalido");
        }

            }

}

