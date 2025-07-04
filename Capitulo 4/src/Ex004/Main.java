package Ex004;


public class Main {
    public static void main(String args[]){
        Zumbi z1 = new Zumbi("Garry", 100);
        Zumbi z2 = new Zumbi("Clara", 75);

        boolean verification = z1.transfereVida(z2, 25);
        System.out.println(verification);
    }
}
