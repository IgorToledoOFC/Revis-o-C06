package Ex006;

public class Kart {
    private String nome;
    private Motor motor;

    // Constructor

    public Kart(String nome, String cilindradas, float velocidademaxima){
        this.nome = nome;
        this.motor = new Motor(cilindradas, velocidademaxima);
    }

    // Methods

    public void pular(){
        System.out.println(nome + " pulou");
        System.out.println(" ");
    }

    public void soltarTurbo(){
        System.out.println(nome + " soltando Turbo");
        System.out.println(" ");
    }

    public void fazerDrift(){
        System.out.println(nome + " Fez Drift");
        System.out.println(" ");
    }

    // Getters and Setters


    public Motor getMotor() {
        return motor;
    }
}
