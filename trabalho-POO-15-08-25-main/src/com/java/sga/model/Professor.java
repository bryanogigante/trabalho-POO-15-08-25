package com.java.sga.model;

// Classe Professor que herda da classe abstrata Pessoa
public class Professor extends Pessoa {

    // Atributo que representa a disciplina que o professor é responsavel
    private String disciplina;

    // Atributo que representa a lista de turmas associadas ao professor
    private String listaTurmas;

    // Construtor que inicializa os atributos da superclasse (nome, matrícula) e os próprios (disciplina, listaTurmas)
    public Professor(String nome, String matricula, String disciplina, String listaTurmas) {
        super(nome, matricula); // Chamada ao construtor da superclasse Pessoa
        this.disciplina = disciplina;
        this.listaTurmas = listaTurmas;
    }

    // Getter para obter a disciplina do professor
    public String getDisciplina() {
        return disciplina;
    }

    // Getter para obter a lista de turmas do professor
    public String getListaTurmas() {
        return listaTurmas;
    }

    // Setter para alterar a disciplina do professor
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Setter para alterar a lista de turmas do professor
    public void setListaTurmas(String listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
}



