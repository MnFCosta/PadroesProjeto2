package Flyweight.entidades;

public class Nome implements Pessoa {
    private final String nome;

    protected Nome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}