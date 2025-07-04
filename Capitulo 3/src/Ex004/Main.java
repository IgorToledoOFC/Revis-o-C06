package Ex004;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Please Write the quantity of Students: ");
        int qtd_students = input.nextInt();

        switch (qtd_students){
            case 10:
                System.out.println("Class: |-16");
            break;

            case 20:
                System.out.println("Class: |-16");
            break;

            case 30:
                System.out.println("Class: |-22");
            break;

            default:
                System.out.println("Inatel don't support these quantity");
        }

    }
}
