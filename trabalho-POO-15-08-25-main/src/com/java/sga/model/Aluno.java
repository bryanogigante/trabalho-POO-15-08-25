package com.java.sga.model; // Define o pacote onde a classe está localizada

// A classe Aluno herda da classe Pessoa
public class Aluno extends Pessoa {

    // Atributo que armazena as notas do aluno como uma string (poderia ser uma lista em vez de String, dependendo do uso)
    private String listaNotas;

    // Atributo que representa a turma do aluno
    private String turma;

    // Construtor padrão (sem parâmetros)
    public Aluno() {
        super(); // Chama o construtor padrão da superclasse Pessoa
    }

    // Construtor com parâmetros,o super pega nome e matricula da pessoa já que aluno é uma classe filha
    public Aluno(String nome, String matricula, String listaNotas, String turma) {
        super(nome, matricula); // Chama o construtor da superclasse com nome e matrícula de Pessoa
        this.listaNotas = listaNotas; // Inicializa a lista de notas
        this.turma = turma; // Inicializa a turma
    }

    // Getter para listaNotas
    public String getListaNotas() {
        return listaNotas;
    }

    // Setter para listaNotas
    public void setListaNotas(String listaNotas) {
        this.listaNotas = listaNotas;
    }

    // Getter para turma
    public String getTurma() {
        return turma;
    }

    // Setter para turma
    public void setTurma(String turma) {
        this.turma = turma;
    }
}

