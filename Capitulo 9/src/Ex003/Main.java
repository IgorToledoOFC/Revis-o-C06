package Ex003;

public class Main {
    public static void main(String args[]){
        BrownieCafe bc = new BrownieCafe("Brownie de Cafe", 10, "cafe");

        bc.adicionaCafe();
        bc.mostraInfo();

        Comprador c1 = new Comprador("Garry", 100);

        c1.efetuarCompra(bc);

         // Instancia de algo para adicionar metodos ao Polimorfismo, é chamado na main mesmo
         //if (bc instanceof BrownieCafe) {
         //    BrownieCafe browniecafe = (BrownieCafe) bc;
         //    browniecafe.adicionaMaisCafe();
         //}
    }
}
