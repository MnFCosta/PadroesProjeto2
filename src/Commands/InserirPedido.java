package Commands;

public class InserirPedido implements Comando {
    private String nome;
    private String pedido;

    public InserirPedido(String nome, String pedido) {
        super();
        this.nome = nome;
        this.pedido = pedido;
    }

    public String fazer() {
        return nome.concat(String.format(" Pedido = %s", pedido));
    }

    public String desfazer() {
        return nome;
    }
}