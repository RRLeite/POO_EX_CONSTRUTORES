/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oficina;

/**
 *
 * @author roberto.leite
 */
public class Carro {
    
    private String modelo, fabricante,anoFabricacao, defeito, reparosAnteriores, mecanicoResponsavel, dataReparo;

    public Carro(String modelo, String fabricante, String anoFabricacao, String defeito, String reparosAnteriores, String mecanicoResponsavel, String dataReparo) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.defeito = defeito;
        this.reparosAnteriores = reparosAnteriores;
        this.mecanicoResponsavel = mecanicoResponsavel;
        this.dataReparo = dataReparo;
    }
    
  
    
}
