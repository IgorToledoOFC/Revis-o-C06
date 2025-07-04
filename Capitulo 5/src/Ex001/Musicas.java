package Ex001;

public class Musicas {
    public String nome;
    public double duracao;

    // Constructor

    public Musicas(String nome, double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    // Getter and Setters


    public String getNome() {
        return nome;
    }

    public double getDuracao() {
        return duracao;
    }
}
