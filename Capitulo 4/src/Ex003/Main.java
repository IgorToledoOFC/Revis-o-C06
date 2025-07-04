package Ex003;

import Ex002.Zumbi;

public class Main {
    public static void main(String args[]){
        Zumbi z1 = new Zumbi("Garry", 100);
        Zumbi z2 = new Zumbi("Pedro", 75);

        double hp;

        hp = z1.mostraVida();
        System.out.println(z1.name + ": " + hp);

        hp = z2.mostraVida();
        System.out.println(z2.name + ": " + hp);

        z1 = z2;

        hp = z1.mostraVida();
        System.out.println(z1.name + ": " + hp);

        hp = z2.mostraVida();
        System.out.println(z2.name + ": " + hp);

    }
}
