package Ex001;

public class Zumbi {
    private String nome;
    private float vida;

    // Constructor

    public Zumbi(String nome, float vida) {
        this.nome = nome;
        this.vida = vida;
    }

    // Methods
    public void bite(){
        System.out.println("Zombie bite Someone");
    }

    public void noise(){
        System.out.println("Zombie are making noise");
    }

    public void emote(){
        System.out.println("Now Zombie are dancing lambada!!!");
    }

}
