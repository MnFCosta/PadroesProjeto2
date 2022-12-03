package proxydecorator;

public class PessoaDAODecorator implements PessoaDAOInterface {
    private static PessoaDAOInterface pessoaDAO;

    private PessoaDAOInterface getDAO() {
        if (pessoaDAO == null)
            pessoaDAO = new PessoaDAOProxy();
        return pessoaDAO;
    }

    public void addPessoa (String nome, Integer idade) throws PessoaException{
        if(nome.isBlank())
            throw new PessoaException("Digite um nome de pessoa válido!");
        if(idade == null)
            throw new PessoaException("Digite uma idade de pessoa válido!");
        getDAO().addPessoa(nome, idade);
    }

    public Pessoa getPessoa(String nome, Integer idade) throws PessoaException{
        if(nome.isBlank())
            throw new PessoaException("Digite um nome de pessoa válido!");
        Pessoa u = getDAO().getPessoa(nome, idade);
        if(u == null)
            throw new PessoaException("Digite um nome de pessoa válido!");
        if(u.getIdade() == null)
            throw new PessoaException("Digite uma idade de pessoa válida!");
        return u;
    }


}
