package Facade;

public class PessoaFachada {
    private Pessoa adulto;
    private Pessoa adolescente;
    private Pessoa crianca;

    public PessoaFachada() {
        adulto = new Circle();
        adolescente = new Rectangle();
        crianca = new Crianca();
    }

    public void chamarCrianca() {
        crianca.chamar();
    }

    public void chamarAdolescente() {
        adolescente.chamar();
    }

    public void chamarAdulto() {
        adulto.chamar();
    }
}