package Ex005;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int memory = rand.nextInt(10)+1;
        int choice = -1;
        int aux = 0;

        while(choice != memory){
            System.out.println("try to figure out the number I'm thinking of from 1 to 10");
            choice = input.nextInt();
            if (choice != memory){
                aux++;
                System.out.println("No, you're wrong, try again");
            } else {
                System.out.println("You win, and lose " + choice + " times");
            }
        }

    }
}
