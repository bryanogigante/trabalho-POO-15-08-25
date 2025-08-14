package com.java.sga.util;

public class Validacoes {
    
     private Validacoes() {
        
    }

    
    public static void validarMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("A matrícula não pode ser nula ou vazia.");
        }
    }
}


