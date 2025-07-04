package Ex002;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String nome;
        double valor;
        double soma = 0;

        System.out.println("Welcome to Zé do Lanche");
        System.out.println("Let me take your order!");
        System.out.println("You want 4 lunches right?");

        System.out.println("What do you want to eat first? ");
        nome = entrada.nextLine();
        System.out.println("How much that? ");
        valor = entrada.nextDouble();
        soma+= valor;
        entrada.nextLine();

        Salgados s1 = new Salgados(nome, valor);

        System.out.println("And next what you gonna eat? ");
        nome = entrada.nextLine();
        System.out.println("How much that? ");
        valor = entrada.nextDouble();
        soma+= valor;
        entrada.nextLine();

        Salgados s2 = new Salgados(nome, valor);

        System.out.println("Right, and what more? ");
        nome = entrada.nextLine();
        System.out.println("How much that? ");
        valor = entrada.nextDouble();
        soma+= valor;
        entrada.nextLine();

        Salgados s3 = new Salgados(nome, valor);

        System.out.println("and what do you wanna eat latest? ");
        nome = entrada.nextLine();
        System.out.println("How much that? ");
        valor = entrada.nextDouble();
        soma+= valor;
        entrada.nextLine();

        System.out.println("The Amount Collected: " + soma);
        System.out.println("An average of " + soma/4 + " per salty was obtained");



        entrada.close();
    }
}
