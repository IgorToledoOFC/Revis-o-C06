package Ex003;

public class Comprador {
    private String nome;
    private double saldo;

    //Constructor

    public Comprador(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // Methods

    public void efetuarCompra(Brownie brownie){
        brownie.addCarrinhoDeCompras();

        brownie.calculaValorTotalCompra();
    }
}
