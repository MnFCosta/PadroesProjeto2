package Facade;

public class Main {

    public static void main(String[] args) {
        PessoaFachada pessoaFachada = new PessoaFachada();
        pessoaFachada.chamarAdulto();
        pessoaFachada.chamarAdolescente();
        pessoaFachada.chamarCrianca();

    }

}