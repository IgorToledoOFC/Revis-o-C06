package Ex002;

public abstract class Salgados {
    protected String nome;
    protected int preco;

    public Salgados(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void addCarrinhoComprass(){
        System.out.println("Você adicionou um produto ao carrinho de compras");
    }
}
