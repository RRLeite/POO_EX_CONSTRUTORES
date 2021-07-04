/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turma;

import Aluno.Aluno;
import Disciplina.Disciplina;

/**
 *
 * @author roberto.leite
 */
public class Turma {
    
    private int numeroTurma;
    private int numAlunos;
    private Aluno aluno[];
    private Disciplina disciplina[];

    public Turma(int numAlunos, Aluno[] aluno, Disciplina[] disciplina) {
        this.numAlunos = numAlunos;
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    public void exibeHistorico (Aluno aluno){
        
    }
    
    public void media(Aluno aluno, Disciplina disciplina){
        
    
    }
    
}
