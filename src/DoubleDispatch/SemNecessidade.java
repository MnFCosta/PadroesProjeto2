package DoubleDispatch;

public class SemNecessidade extends Pessoa{

    private String sobrenome;

    public SemNecessidade(String nome, String sobrenome) {
        super(nome);
        this.sobrenome = sobrenome;
    }

    @Override
    public void addPropriedades(Fila fila) {
        super.addPropriedades(fila);
        fila.addPropriedade(PropriedadesPessoa.SOBRENOME, sobrenome);
    }
}
