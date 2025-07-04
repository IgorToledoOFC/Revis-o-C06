package Ex001.br;

import Ex001.br.inatel.cdg.Conta;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(254, 100, 10, "Paulinho Capa", 254163542);

        c1.sacar(1000);

        c1.sacar(50);

        c1.depositar(1000);
    }
}