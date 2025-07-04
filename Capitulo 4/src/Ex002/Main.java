package Ex002;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        Zumbi zumbi1 = new Zumbi("Garry", 100);

        Zumbi zumbi2 = new Zumbi("Mia", 60);

        Zumbi zumbi3 = new Zumbi("Clara", 75);

        double life = zumbi1.mostraVida();
        System.out.println(zumbi1.name + ": "+ life);

        life = zumbi2.mostraVida();
        System.out.println(zumbi2.name + ": "+ life);

        life = zumbi3.mostraVida();
        System.out.println(zumbi3.name + ": "+ life);

        zumbi1.transfereVida(zumbi2, 40);

        life = zumbi2.mostraVida();
        System.out.println(zumbi2.name + ": "+ life);

    }
}
