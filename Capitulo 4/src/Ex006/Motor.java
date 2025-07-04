package Ex006;

public class Motor {
    private String cilindradas;
    private float velocidadeMaxima;

    // Constructor

    public Motor(String cilindradas, float velocidadeMaxima){
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Methods

    public void mostraInfo(){
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println(" ");
    }

}
