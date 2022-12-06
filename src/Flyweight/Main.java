package Flyweight;

import Flyweight.entidades.Nome;
import Flyweight.entidades.NomeFactory;
import Flyweight.entidades.Lista;

public class Main {

    public static void main(String[] args) {
        Lista aaa = new Lista();
//        Nome jorge = new Nome("Jorge");
//        Nome lucas = new Nome("Lucas");
//        Nome segio = new Nome("Sergio");
        aaa.add(NomeFactory.get("Jorge"));
        aaa.add(NomeFactory.get("Lucas"));
        aaa.add(NomeFactory.get("Sérgio"));
        System.out.println(aaa.getNome());

    }

}