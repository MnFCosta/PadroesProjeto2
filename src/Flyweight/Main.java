package Flyweight;

import Flyweight.entidades.Nome;
import Flyweight.entidades.NomeFactory;
import Flyweight.entidades.Lista;

public class Main {

    public static void main(String[] args) {
        Lista aaa = new Lista();
        aaa.add(NomeFactory.get("Jorge"));
        aaa.add(NomeFactory.get("Lucas"));
        aaa.add(NomeFactory.get("Sérgio"));
        aaa.add(NomeFactory.get("Jorge"));
        System.out.println(aaa.getNome());

    }

}