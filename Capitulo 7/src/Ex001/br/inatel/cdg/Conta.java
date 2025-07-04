package Ex001.br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] cliente = {null, null, null, null};

    // Constructor

    public Conta(int numero, float saldo, float limite, String nome_cliente, long cpf) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        cliente[0] = new Cliente(nome_cliente, cpf);
    }

    // Methods

    public void sacar(float quantia){
        if((saldo-quantia) < 0){
            System.out.println("Não é possível sacar essa quantia");
        } else {
            System.out.println(quantia + "R$ Foram debitado(s) da sua conta");
        }
    }

    public void depositar(float quantia){
        saldo += quantia;
        System.out.println(quantia + "R$ Foram depositado(s) na sua conta");
    }
}
