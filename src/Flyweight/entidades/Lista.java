package Flyweight.entidades;

import java.util.ArrayList;
import java.util.List;

public class Lista implements Pessoa {
    private List<Pessoa> pessoas;

    public Lista() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void add(Pessoa e) {
        pessoas.add(e);
    }

    public String getNome() {
        String string = new String();
        for (Pessoa c : pessoas)
            string = String.format("%s %s", string, c.getNome());
        return string;
    }
}