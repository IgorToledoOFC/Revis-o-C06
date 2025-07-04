package Ex002;

public class Brownie {
    protected String nome;
    protected double preco;
    protected String sabor;

    // Constructor

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    // Methods

    public void addCarrinhoDeCompras(){
        System.out.println(nome + " foi adicionado ao Carrinho de Compras");
    }

    public void calculaValorTotalCompra(){
        System.out.println("Você está comprando: ");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }

    public void mostraInfo(){
        System.out.println("Informações: ");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Sabor: " + sabor);
    }
}
