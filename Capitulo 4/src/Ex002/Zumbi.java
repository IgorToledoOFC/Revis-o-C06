package Ex002;

public class Zumbi {
    public String name;
    public double vida;

    // Constructor

    public Zumbi(String name, double vida) {
        this.name = name;
        this.vida = vida;
    }

    // Methods

    public double mostraVida(){
        return this.vida;
    }

    public void transfereVida(Zumbi z1, double quantia){
        if(this.vida-quantia <= 0){
            System.out.println(this.name + " nao tem vida o suficiente para transferir");
        } else {
            this.vida -= quantia;
            z1.vida += quantia;
            System.out.println(quantia + "Hp foi transferida para " + z1.name);
        }
    }
}
