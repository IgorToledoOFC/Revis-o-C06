package Ex001;

public class Main {
    public static void main(String[] args) {
        Cachorro ca = new Cachorro("dog", 100);

        Lontra lo = new Lontra("fufi", 15);

        ca.emitirSom();

        lo.emitirSom();

        ca.nadar();
    }
}