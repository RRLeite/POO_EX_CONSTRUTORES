/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aluno;



/**
 *
 * @author roberto.leite
 */
public class Aluno {
    
    private String nome, sobrenome, endereço, anoIngresso;
    private int cpf, matricula;
    private float cr;
    private float nota;
    
    

    public Aluno(String nome, String sobrenome, String endereço, int cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereço = endereço;
        this.cpf = cpf;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
    public float calculaCr(){
        
        return cr;
        
    }
    
    
    
}

