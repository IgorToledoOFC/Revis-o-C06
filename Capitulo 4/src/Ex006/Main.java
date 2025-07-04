package Ex006;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String nome_piloto;
        boolean vilao;
        String nome_kart;
        String cilindradas = "sei la";
        float velocidade_maxima = -1;


        System.out.println("De o nome para o primeiro piloto: ");
        nome_piloto = input.nextLine();

        System.out.println("Esse piloto é um vilão? true = sim   false = não");
        vilao = input.nextBoolean();
        input.nextLine();

        System.out.println("Digite o nome do Kart desse piloto: ");
        nome_kart = input.nextLine();

        System.out.println("Digite qual dessas cilindradas esse carro tem: 50 100 150 ");
        while (!cilindradas.equals("50") && !cilindradas.equals("100") && !cilindradas.equals("150")) {
            cilindradas = input.nextLine().trim();
        }

        System.out.println("Digite qual velocidades máxima esse carro atinge: 0 - 150 ");
        while (velocidade_maxima < 0 || velocidade_maxima > 150) {
            velocidade_maxima = input.nextFloat();
            input.nextLine();
        }

        Kart k1 = new Kart(nome_kart, cilindradas, velocidade_maxima);

        Piloto p1 = new Piloto(nome_piloto, vilao, k1);

        System.out.println("De o nome para o primeiro piloto: ");
        nome_piloto = input.nextLine();

        System.out.println("Esse piloto é um vilão? true = sim   false = não");
        vilao = input.nextBoolean();
        input.nextLine();

        System.out.println("Digite o nome do Kart desse piloto: ");
        nome_kart = input.nextLine();

        cilindradas = " ";
        System.out.println("Digite qual dessas cilindradas esse carro tem: 50 100 150 ");
        while (!cilindradas.equals("50") && !cilindradas.equals("100") && !cilindradas.equals("150")) {
            cilindradas = input.nextLine().trim();
        }

        velocidade_maxima = -1;
        System.out.println("Digite qual velocidades máxima esse carro atinge: 0 - 150 ");
        while (velocidade_maxima < 0 || velocidade_maxima > 150) {
            velocidade_maxima = input.nextFloat();
            input.nextLine();
        }

        Kart k2 = new Kart(nome_kart, cilindradas, velocidade_maxima);

        Piloto p2 = new Piloto(nome_piloto, vilao, k2);

        p1.soltaSuperPoder();

        p2.soltaSuperPoder();

        k1.fazerDrift();
        k1.pular();

        k2.soltarTurbo();

        k1.getMotor().mostraInfo();

        k2.getMotor().mostraInfo();

    }
}
