package StatFactorySingleton;


public class Pessoa {
    private String nome;

    private String apelido;

    private String sobrenome;

    private static Pessoa pessoa;


    private Pessoa(String nome) {
        this.nome = nome;
        this.apelido = " ";
        this.sobrenome = " ";
    }

    private Pessoa(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
        this.sobrenome = " ";
    }


//    private Pessoa(String nome, String sobrenome){
//        this.nome = nome;
//        this.apelido = " ";
//        this.sobrenome = sobrenome;
//    }

    private Pessoa(String nome, String apelido, String sobrenome){
        this.nome = nome;
        this.apelido = apelido;
        this.sobrenome = sobrenome;
    }

    public static Pessoa criaNome(String nome){
        if(pessoa == null){
            System.out.println("Não Existe!");
            if (!valida(nome))
                return null;
            pessoa = new Pessoa(nome);
            pessoa.setNome(nome);
            return pessoa;
        }
        System.out.println("Existe!");
        pessoa.setNome(nome);
        return pessoa;

    }

    public static Pessoa criaNomeApelido(String nome, String apelido){
        if (pessoa == null){
            if(!valida(nome))
                return null;
            if(!valida(apelido))
                return null;
            return pessoa = new Pessoa(nome,apelido);
        }


        pessoa.setNome(nome);
        pessoa.setApelido(apelido);
        return pessoa;
    }

    public static Pessoa criaNomeSobrenome(String nome, String sobrenome) {
        if (pessoa == null) {
            if (!valida(nome))
                return null;
            if (!valida(sobrenome))
                return null;
            pessoa = new Pessoa(nome);
            pessoa.setSobrenome(sobrenome);
            return pessoa;
        }


        pessoa.setNome(nome);
        pessoa.setSobrenome(sobrenome);
        return pessoa;
    }

    public static Pessoa cria(String nome, String apelido, String sobrenome) {
        if (pessoa == null) {
            System.out.println("Não Existe!");
            if (!valida(nome))
                return null;
            if (!valida(sobrenome))
                return null;
            return pessoa = new Pessoa(nome, apelido, sobrenome);
        }

        System.out.println("Existe!");
        pessoa.setNome(nome);
        pessoa.setApelido(apelido);
        pessoa.setSobrenome(sobrenome);
        return pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!valida(nome))
            return;
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (!valida(sobrenome))
            return;
        this.sobrenome = sobrenome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        if (!valida(apelido))
            return;
        this.apelido = apelido;
    }

    private static boolean valida(String texto) {
        return !texto.contains(" ");
    }
}