package Ex003;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Please write your NPA here: ");
        float NPA = input.nextFloat();
        float NP3;

        if (NPA >= 60){
            System.out.println("Congratulations you Passed");
        } else {
            System.out.println("You not passed, god luck on NP3 ");

            System.out.println("Please Write your NP3 Here: ");
            NP3 = input.nextFloat();

            if ((NP3 + NPA)/2 >= 50){
                System.out.println("APPROVED!");
            } else {
                System.out.println("REPROVED!");
            }
        }

    }
}
