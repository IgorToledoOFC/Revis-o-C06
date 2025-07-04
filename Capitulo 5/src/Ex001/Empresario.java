package Ex001;

public class Empresario {
    private String nome;
    private long cnpj;

    // Constructor

    public Empresario(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Getters and Setters


    public String getNome() {
        return nome;
    }

    public long getCnpj() {
        return cnpj;
    }
}
