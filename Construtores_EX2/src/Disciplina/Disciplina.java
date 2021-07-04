/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Disciplina;

import Aluno.Aluno;
import Professo.Professor;

/**
 *
 * @author roberto.leite
 */
public class Disciplina {
    
    private String nome;
    private String ememnta;
    private int codigo, cargaHoriaria;
    private Professor professor;
    private Aluno aluno;

    public Disciplina(String nome, int cargaHoriaria, Professor professor) {
        this.nome = nome;
        this.cargaHoriaria = cargaHoriaria;
        this.professor = professor;
    }
    
    public void exibeCargaHoraria(){
        
    }
    
    public void exibeEmenta(){
        
        
    }
    
    
    
    
            
    
}
