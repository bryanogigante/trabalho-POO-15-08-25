// Classe utilitária que contém métodos de validação
public class Validacoes {
    
    // Construtor privado para evitar que a classe seja instanciada,
    // já que ela é apenas utilitária (com métodos estáticos)
    private Validacoes() {
    }

    // Método estático para validar se a matrícula é válida
    public static void validarMatricula(String matricula) {
        // Verifica se a matrícula é nula ou está vazia (após remover espaços)
        if (matricula == null || matricula.trim().isEmpty()) {
            // Lança uma exceção indicando que a matrícula é inválida
            throw new IllegalArgumentException("A matrícula não pode ser nula ou vazia.");
        }
    }
}
