package Ex001;

public class Boi extends Mamifero{

    public Boi(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de Boi");
    }
}
