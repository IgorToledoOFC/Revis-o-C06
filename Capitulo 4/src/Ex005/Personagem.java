package Ex005;

public class Personagem {
    private String nome;
    private int pontos;
    private Arma arma;

    // Constructor

    public Personagem(String nome, int pontos, Arma arma) {
        this.nome = nome;
        this.pontos = pontos;
        this.arma = arma;
    }

    // methods

    public void usarArma(){
        System.out.println("Arma Utilizada!");
        System.out.println("Menos 2 pontos de resistência");
        arma.setResistencia(arma.getResistencia()-2);

        System.out.println("Resistencia atual da arma: " + arma.getResistencia());
    }

    public void tomarDano(){
        System.out.println(nome + " tomou dano - 5hp");
        pontos-=5;
    }
}
