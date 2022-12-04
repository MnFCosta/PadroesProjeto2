package proxydecorator;

public class Main {

    public static void main(String[] args) {
        PessoaDAOInterface pessoaDAO = new PessoaDAODecorator();

        try {
            pessoaDAO.addPessoa("", null );
        } catch (PessoaException e) {
            System.err.println("Não consegui adicionar a pessoa vazio.");
            System.err.println(e.getMessage());
        }

        try {
            pessoaDAO.addPessoa("Pedro", 12);
        } catch (PessoaException e) {
            System.err.println("Não consegui adicionar a pessoa Pedro.");
            System.err.println(e.getMessage());
        }

        try {
            Pessoa u = pessoaDAO.getPessoa("Jorge", 12);
            System.out.println(u.getNome());
        } catch (PessoaException e) {
            System.err.println("Não consegui recuperar a pessoa Jorge.");
            System.err.println(e.getMessage());
        }

        try {
            Pessoa u = pessoaDAO.getPessoa("Pedro", 12);
            System.out.printf("A pessoa %s existe e sua idade é %d", u.getNome(),u.getIdade());
        } catch (PessoaException e) {
            System.err.println("Não consegui recuperar a pessoa Pedro.");
            System.err.println(e.getMessage());
        }
    }

}