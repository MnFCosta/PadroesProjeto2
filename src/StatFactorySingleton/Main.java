package StatFactorySingleton;

public class Main {

    public static void main(String[] args) {
//        Pessoa pessoa = new Pessoa();
        Pessoa pessoa = Pessoa.cria("Manoel", "Mano", "Costa");
//
        System.out.printf("A pessoa %s '%s' %s existe!\n", pessoa.getNome(),pessoa.getApelido(),pessoa.getSobrenome());
        pessoa = Pessoa.criaNome("Lucas");
        System.out.printf("A pessoa %s '%s' %s existe!\n", pessoa.getNome(),pessoa.getApelido(),pessoa.getSobrenome());


    }

}