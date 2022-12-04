package FluentInterfaces;

public class Pedido {
    private String pedido;
    private Pessoa pessoa;

    public Pedido pedido(String pedido){
        this.pedido = pedido;
        return this;
    }

    public Pedido pessoa(String nome){
        pessoa = new Pessoa(nome);
        return this;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getPedido() {
        return pedido;
    }
}
