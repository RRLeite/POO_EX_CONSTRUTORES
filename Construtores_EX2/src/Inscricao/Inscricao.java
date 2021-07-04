/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inscricao;

import Aluno.Aluno;
import Disciplina.Disciplina;

/**
 *
 * @author roberto.leite
 */
public class Inscricao {
    
    private int idInscricao;
    private Aluno aluno;
    private Disciplina disciplina;

    public Inscricao(Aluno aluno, Disciplina disciplina) {
        this.aluno = aluno;
        this.disciplina = disciplina;
    }
    
    
    
}
