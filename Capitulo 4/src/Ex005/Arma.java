package Ex005;

public class Arma {
    private String nome;
    private int poder;
    private int resistencia;
    private String descricao;

    // Constructor

    public Arma(String nome, int poder, int resistencia, String descricao) {
        this.nome = nome;
        this.poder = poder;
        this.resistencia = resistencia;
        this.descricao = descricao;
    }

    // Methods

    public void mostraInfoArma(){
        System.out.println(" ");
        System.out.println("Informações da Arma");
        System.out.println("Name:        " + this.nome);
        System.out.println("Poder:       " + this.poder);
        System.out.println("Resistencia: " + this.resistencia);
        System.out.println("Descricao:   " + this.descricao);
        System.out.println(" ");
    }

    // Getters and Setters

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getResistencia() {
        return resistencia;
    }
}
