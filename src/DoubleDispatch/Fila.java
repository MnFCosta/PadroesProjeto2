package DoubleDispatch;

import java.util.*;

public class Fila {
    private List<Pessoa> pessoas;
    private Map<PropriedadesPessoa, String> propriedades;

    public void addPessoa(Pessoa pessoa) {
        getPessoas().add(pessoa);
        pessoa.addPropriedades(this);
    }

    public void addPropriedade(PropriedadesPessoa tipo, String valor) {
        getPropriedades().put(tipo, getPropriedades().get(tipo) + String.format(" %s",valor));
    }

    public String getTabela() {
        if (pessoas.isEmpty())
            return "";

        String[] nomes = propriedades.get(PropriedadesPessoa.NOME).trim().split("\\s+");
        String[] sobrenomes = propriedades.get(PropriedadesPessoa.SOBRENOME).trim().split("\\s+");
        String[] deficiencias = propriedades.get(PropriedadesPessoa.DEFICIENCIA).trim().split("\\s+");
        String total = String.format("Pessoa 1: %s %s\n" +
                "Deficiencia: %s\n" +
                "Pessoa 2: %s %s\n" +
                "Deficiencia: %s", nomes[0], sobrenomes[0], "n/a", nomes[1], sobrenomes[1], deficiencias[0]);


        return total;
    }

    private List<Pessoa> getPessoas() {
        if (pessoas == null)
            pessoas = new ArrayList<Pessoa>();
        return pessoas;
    }

    private Map<PropriedadesPessoa, String> getPropriedades() {
        if (propriedades == null) {
            propriedades = new HashMap<PropriedadesPessoa, String>();
            for (PropriedadesPessoa tipo : PropriedadesPessoa.values())
                propriedades.put(tipo, " ");
        }
        return propriedades;
    }

}