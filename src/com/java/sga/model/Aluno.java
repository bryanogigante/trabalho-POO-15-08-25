package com.java.sga.model;

public class Aluno extends Pessoa {
    private String listaNotas;
    private String turma;

//Construtor
 public Aluno() {
        super(); // Chama o construtor padrão da classe mãe (Pessoa)
    }

   

    public Aluno(String nome, String matricula, String listaNotas, String turma) {
        // A primeira linha DEVE ser a chamada ao construtor da classe mãe
        super(nome, matricula); 
        
        this.listaNotas = listaNotas;
        this.turma = turma;
    }

    //Getters e Setters
    
    public String getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(String listaNotas) {
        this.listaNotas = listaNotas;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}

