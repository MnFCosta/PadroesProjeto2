package DoubleDispatch;

public class ComNecessidade extends Pessoa{

    public String sobrenome;

    public String deficiencia;


    public ComNecessidade(String nome, String sobrenome, String deficiencia) {
        super(nome);
        this.sobrenome = sobrenome;
        this.deficiencia = deficiencia;
    }

    public void addPropriedades(Fila fila) {
        super.addPropriedades(fila);
        fila.addPropriedade(PropriedadesPessoa.SOBRENOME, sobrenome);
        fila.addPropriedade(PropriedadesPessoa.DEFICIENCIA, deficiencia);
    }

}
