package Ex001;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Salgados s1 = new Salgados("Coxinha", 5.6);

        Salgados s2 = new Salgados("Cigarrete", 9);

        Salgados s3 = new Salgados("Pastel", 10);

        Salgados s4 = new Salgados("Pizza", 8);

        System.out.println("O número total de lanches é: 16");
        System.out.println("A média de lanches consumidos é: " + 16/8);
    }
}