package proxydecorator;

public interface PessoaDAOInterface {

    public void addPessoa (String nome, Integer idade) throws PessoaException;

    public Pessoa getPessoa(String nome, Integer idade) throws PessoaException;
}
