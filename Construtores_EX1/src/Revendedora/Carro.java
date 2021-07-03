/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Revendedora;

/**
 *
 * @author roberto.leite
 */
public class Carro {
    
    private String modelo, fabricante,cor,anoFabricacao;
    private int chassi, codigo, qtdEstoque;
    private float preco;
    
    
    public Carro(String modelo, String fabricante, String cor, String anoFabricacao, int chassi, int codigo, float preco){
        this.modelo=modelo;
        this.fabricante=fabricante;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.chassi=chassi;
        this.codigo=codigo;
        this.preco=preco;
        
    }
    
    public void vendeCarro(Carro carro, int qtd){
        
    }
    public void compraCarro(Carro carro, int qtd){
        
    }
    
    public void anunciaVenda(Carro carro){
        
    }
    
    
    
    
}
