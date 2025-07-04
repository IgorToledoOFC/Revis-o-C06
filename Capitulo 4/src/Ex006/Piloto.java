package Ex006;

public class Piloto {
    private String nome;
    private boolean vilao;
    private Kart kart;

    // Constructor

    public Piloto(String nome, boolean vilao, Kart kart) {
        this.nome = nome;
        this.vilao = vilao;
        this.kart = kart;
    }

    // Methods

    public void soltaSuperPoder(){
        System.out.println(nome + " está soltando poder");
        System.out.println(" ");
    }
}
