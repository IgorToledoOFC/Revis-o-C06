package Ex001;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    // Constructor

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Methods

    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println("Informações: ");
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
