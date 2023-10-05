/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrosfabricas;

/**
 *
 * @author emanoel
 */
public class CarrosFabricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Cria a fábrica de carros classe B
        FabricaCarros fabricaCarrosClasseB = new FabricaCarrosClasseB();
        // Cria o carro Santa Fe
        Carros carroSantaFe = fabricaCarrosClasseB.criarCarro("Santa Fe");
        // Adiciona as pecas ao carro
        carroSantaFe.adicionarPeca(fabricaCarrosClasseB.criarPeca("Motor"));
        carroSantaFe.adicionarPeca(fabricaCarrosClasseB.criarPeca("Caixa de Cambio"));        
        carroSantaFe.adicionarPeca(fabricaCarrosClasseB.criarPeca("Suspensao"));
        carroSantaFe.adicionarPeca(fabricaCarrosClasseB.criarPeca("Bateria"));
        carroSantaFe.adicionarPeca(fabricaCarrosClasseB.criarPeca("Sistema de freios"));
        carroSantaFe.adicionarPeca(fabricaCarrosClasseB.criarPeca("Filtro de ar"));
        carroSantaFe.adicionarPeca(fabricaCarrosClasseB.criarPeca("Pneus"));

        // Calcula o custo final do carro
         System.out.println("Nome: "+ carroSantaFe.getNome());
         
         //com os acrescimos
        double custoFinal = carroSantaFe.getValor() + (carroSantaFe.getValor() * 0.65);
        
        //sem os 0,65 de acrescimo
        System.out.println("Custo Final da classe B: " + custoFinal);
  
        //System.out.println(carroSantaFe.toString());
          
         // Cria a fabrica de carros classe A
        FabricaCarros fabricaCarrosClasseA = new FabricaCarrosClasseA();
        // Cria o carro HB20
        Carros carroHB20 = fabricaCarrosClasseA.criarCarro("HB20");

        // Adiciona as peças ao carro
        carroHB20.adicionarPeca(fabricaCarrosClasseA.criarPeca("Motor"));
        carroHB20.adicionarPeca(fabricaCarrosClasseA.criarPeca("Caixa de Cambio"));
        carroHB20.adicionarPeca(fabricaCarrosClasseA.criarPeca("Suspensao"));
        carroHB20.adicionarPeca(fabricaCarrosClasseA.criarPeca("Bateria"));
        carroHB20.adicionarPeca(fabricaCarrosClasseA.criarPeca("Sistema de freios"));
        carroHB20.adicionarPeca(fabricaCarrosClasseA.criarPeca("Filtro de ar"));
        carroHB20.adicionarPeca(fabricaCarrosClasseA.criarPeca("Pneus"));

        // Calcula o custo final do carro
        double custoFinal2 = carroHB20.getValor() + (carroHB20.getValor() * 0.65);
        System.out.println("");
        System.out.println("Nome: "+ carroHB20.getNome());
        System.out.println("Custo Final da classe A: " + custoFinal2);
            
            //sem os 0,65 de acrescimo
            //System.out.println(carroHB20.toString());
        
       
 
    }

}
