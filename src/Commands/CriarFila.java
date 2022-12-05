package Commands;

public class CriarFila implements Comando {
    private String nome;
    private String posicao;

    public CriarFila(String nome, String posicao) {
        super();
        this.nome = nome;
        this.posicao = posicao;
    }

    public String fazer() {
        return nome.concat(String.format(" Posição na fila = %s ", posicao));
    }

    public String desfazer() {
        return nome;
    }

}