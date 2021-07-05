/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DETRAN;

/**
 *
 * @author roberto.leite
 */
public class Carro {
    //
    private String modelo, fabricante, anoFabricacao, cor, ultimaVistoria, nomeMotorista;
    private int chassi, cnhMotorista, numDocumento;
    private boolean licenciado;

    public Carro(String modelo, String fabricante, String anoFabricacao, String cor, String nomeMotorista, int chassi, int cnhMotorista) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.nomeMotorista = nomeMotorista;
        this.chassi = chassi;
        this.cnhMotorista = cnhMotorista;
    }
    
    
    public void vistoria(boolean opVistoria){
        
    }
    
    public void licenciamento(boolean isLicenciado){
    
    }
    
    public void transferenciaPropriedade(String nomeMotorista, int chassi, int cnhMotorista, int numDocumento){
        
    }
    
}