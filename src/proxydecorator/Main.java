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
            pessoaDAO.addPessoa("Teste", 12);
        } catch (PessoaException e) {
            System.err.println("Não consegui adicionar a pessoa Teste.");
            System.err.println(e.getMessage());
        }

        try {
            Pessoa u = pessoaDAO.getPessoa("lala", 12);
            System.out.println(u.getNome());
        } catch (PessoaException e) {
            System.err.println("Não consegui recuperar a pessoa lala.");
            System.err.println(e.getMessage());
        }

        try {
            Pessoa u = pessoaDAO.getPessoa("Teste", 12);
            System.out.printf("A pessoa %s existe e sua idade é %d", u.getNome(),u.getIdade());
        } catch (PessoaException e) {
            System.err.println("Não consegui recuperar a pessoa Teste.");
            System.err.println(e.getMessage());
        }
    }

}