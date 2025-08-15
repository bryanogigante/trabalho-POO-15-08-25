// Classe abstrata que serve como base para outras classes que representam pessoas
public abstract class Pessoa {
    
    // Atributo protegido que representa o nome da pessoa
    protected String nome;

    // Atributo protegido que representa a matrícula da pessoa
    protected String matricula;

    // Construtor padrão (sem parâmetros),uso do protected para encapsulamento
    protected Pessoa() {
    }

    // Construtor com parâmetros para inicializar nome e matrícula
    protected Pessoa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo matrícula
    public String getMatricula() {
        return matricula;
    }

    // Setter para o atributo matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
