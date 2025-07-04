package Ex002;

public class Cigarrete extends Salgados{
    public Cigarrete(String nome, int preco){
        super(nome, preco);
    }

    @Override
    public void addCarrinhoComprass(){
        System.out.println("Você adicionou Cigarrete ao carrinho de compras");
    }
}
