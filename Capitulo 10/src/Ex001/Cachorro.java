package Ex001;

public class Cachorro extends Mamifero implements Interface{

    public Cachorro(String nome, double vida){
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de cachorro");
    }

    @Override
    public void nadar() {
        System.out.println("Cachorro esta nadando");
    }
}
