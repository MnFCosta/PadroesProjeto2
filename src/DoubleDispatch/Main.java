package DoubleDispatch;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new SemNecessidade("Jorge", "Silva");
        Pessoa pd1 = new ComNecessidade("Igor", "Meirelles", "Física");


        Fila f = new Fila();
        f.addPessoa(p1);
        f.addPessoa(pd1);


        System.out.println(f.getTabela());
    }

}
