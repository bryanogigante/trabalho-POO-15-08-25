package com.java.sga.model;

public class Professor extends Pessoa {
    private String disciplina;
    private String listaTurmas;

    // Construtor
    public Professor(String nome, String matricula, String disciplina, String listaTurmas) {
        super(nome, matricula);
        this.disciplina = disciplina;
        this.listaTurmas = listaTurmas;
    }

    // Getters 
    public String getDisciplina() { return disciplina; }
    public String getListaTurmas() { return listaTurmas; }

    
    // Setters para permitir a alteração dos dados
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setListaTurmas(String listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
}



