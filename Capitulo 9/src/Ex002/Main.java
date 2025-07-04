package Ex002;

public class Main {
    public static void main(String args[]){
        BrownieCafe bc = new BrownieCafe("Brownie de Cafe", 10, "cafe");

        bc.adicionaCafe();
        bc.mostraInfo();

        bc.addCarrinhoDeCompras();
        bc.calculaValorTotalCompra();
    }
}
