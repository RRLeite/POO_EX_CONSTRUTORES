/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora;

/**
 *
 * @author roberto.leite
 */
public class Carro {
    
    private String modelo, fabricante;
    private int chassi, tempoLocacao, codigo, tempo;
    private float precoLocacao;
    private boolean alugado;
    
    
    public Carro(String modelo, String fabricante, int chassi, int tempoLocacao, int codigo, float precoLocacao){
        
        this.modelo = modelo;
        this.fabricante=fabricante;
        this.chassi=chassi;
        this.tempoLocacao=tempoLocacao;
        this.codigo=codigo;
        this.precoLocacao=precoLocacao;
                  
    }
    
    public void locacao(int tempo){
        
    }
    
    public void alteraPreco(float precoLocacao){
        
    }
    
    public void devolveLocacao(boolean alugado){
        
    }
    
    
    
    
    
    
    
}
