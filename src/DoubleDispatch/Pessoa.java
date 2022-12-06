package DoubleDispatch;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        super();
        this.nome = nome;
    }

    public void addPropriedades(Fila fila) {
        fila.addPropriedade(PropriedadesPessoa.NOME, nome);
    }
}
