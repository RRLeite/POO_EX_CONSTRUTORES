/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Professo;

/**
 *
 * @author roberto.leite
 */
public class Professor {
    
    private String nome;
    private String titulacao;
    private String areaPesquisa;
    private int matricula;
    private int cpf;

    public Professor(String nome, String titulacao, String areaPesquisa, int cpf) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.areaPesquisa = areaPesquisa;
        this.cpf = cpf;
    }
    
    
    
}
