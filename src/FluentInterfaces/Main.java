package FluentInterfaces;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido().pessoa("Manoel").pedido("Bolo de Chocolate");

        System.out.printf("%s pediu um %s!", pedido.getPessoa().getNome(),pedido.getPedido());
    }
}
