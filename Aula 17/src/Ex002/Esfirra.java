package Ex002;

public class Esfirra extends Salgados{
    public Esfirra(String nome, int preco){
        super(nome, preco);
    }

    @Override
    public void addCarrinhoComprass(){
        System.out.println("Você adicionou Esfirra ao carrinho de compras");
    }
}
