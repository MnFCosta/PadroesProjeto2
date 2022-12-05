package Commands;

public class Main {

    public static void main(String[] args) {
        String nome = "";
        ExecutorComandos exec = new ExecutorComandos();

        nome = exec.fazer(new CriarFila("Lucas", "1"));
        System.out.println("1 - " + nome);

        nome= exec.fazer(new InserirPedido(nome, "Sorvete"));
        System.out.println("2 - " + nome);

        nome= exec.desfazer();
        System.out.println("3 - " + nome);

        nome= exec.desfazer();
        System.out.println("4 - " + nome);

        nome= exec.desfazer();
        System.out.println("5 - " + nome);


    }

}