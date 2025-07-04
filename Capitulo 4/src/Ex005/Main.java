package Ex005;

public class Main {
    public static void main(String args[]){
        Arma a1 = new Arma("Espada de ferro", 10, 100, "Afiação Média");

        Personagem p1 = new Personagem("Carlos", 20, a1);

        a1.mostraInfoArma();

        p1.tomarDano();

        p1.usarArma();
        p1.usarArma();

        a1.mostraInfoArma();
    }
}
