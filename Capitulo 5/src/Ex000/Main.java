package Ex000;

public class Main {
    public static void main(String[] args) {
        Salgado s1 = new Salgado("Coxinha");

        Salgado s2 = new Salgado("Cigarrete");

        Salgado s3 = new Salgado("Pizza");

        Cantina c1 = new Cantina("Cantina do Inatel", s1);

        c1.addSalgado(s2);

        c1.addSalgado(s3);

        c1.mostraInfo();
    }
}