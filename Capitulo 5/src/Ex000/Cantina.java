package Ex000;

public class Cantina {
    private String nome;
    private Salgado[] salgado = {null, null, null, null, null};

    public Cantina(String nome, Salgado nsalgado) {
        this.nome = nome;
        this.salgado = salgado;
        salgado[0] = nsalgado;
        System.out.println(" ");
        System.out.println(nome + " criada, temos disponivel: " + salgado[0].getNome());
    }

    //Methods

    public void addSalgado(Salgado novoSalgado){
        for(int i=0; i < salgado.length; i++){
            if(salgado[i] == null){
                salgado[i] = novoSalgado;
                System.out.println(" ");
                System.out.println(novoSalgado.getNome() + " foi adicionado a " + nome);
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println(" ");
        System.out.println("Salgados disponíveis em " + nome + ":");
        for (int i=0; i < salgado.length; i++){
            if(salgado[i] != null){
                System.out.println(" ");
                System.out.println(i+1 + " Salgado: " + salgado[i].getNome());
            }
        }
    }
}
