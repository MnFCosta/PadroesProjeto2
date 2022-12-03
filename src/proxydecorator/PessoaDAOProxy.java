package proxydecorator;

import java.util.HashMap;
import java.util.Map;

public class PessoaDAOProxy implements PessoaDAOInterface {
    private Map<String, Pessoa> pessoas;

    public PessoaDAOProxy() {
        super();
        this.pessoas = new HashMap<>();
    }

    public void addPessoa(String nome, Integer idade) {
        this.pessoas.put(nome, new Pessoa(nome, idade));
    }

    public Pessoa getPessoa(String nome, Integer idade){
        return pessoas.get(nome);
    }
}
