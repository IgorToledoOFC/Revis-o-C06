package Ex001;

public class Banda {
    public String nome;
    public String genero;
    private Empresario empresario = null;
    private Membros[] membros = {null, null, null, null, null, null, null, null, null, null};
    private Musicas[] musicas = {null, null, null, null, null, null, null, null, null, null};


    // Constructor

    public Banda(String nome, String genero, Musicas primeiraMusica, Membros primeiroMembro) {
        this.nome = nome;
        this.genero = genero;
        membros[0] = primeiroMembro;
        musicas[0] = primeiraMusica;
    }


    // Methods

    public void contratarEmpresario(Empresario empresario){
        this.empresario = empresario;
        System.out.println(" ");
        System.out.println("O Empresario(a) " + empresario.getNome() + " foi contratado pela banda " + nome);
    }

    public void mostraInfo(){
        System.out.println(" ");
        System.out.println("Banda " + nome);
        System.out.println("Genero: " + genero);
        if (empresario != null){
            System.out.println("Empresario: " + empresario.getNome());
            System.out.println(" ");
        }
        System.out.println("------------------------------ Membros ------------------------------");
        for (int i=0; i < membros.length; i++){
            if(membros[i] != null){
                System.out.println("Membro " + (i+1) + ": " + membros[i].getNome());
                System.out.println("Função: " + membros[i].getFuncao());
                System.out.println(" ");
            }
        }
        System.out.println("------------------------------ Musicas ------------------------------");
        for (int i=0; i < musicas.length; i++){
            if(musicas[i] != null){
                System.out.println("Musica " + (i+1) + ": " + musicas[i].getNome());
                System.out.println("Duração: " + musicas[i].duracao);
                System.out.println(" ");
            }
        }
    }

    public void addMusicaNova(Musicas novaMusica){
        for (int i=0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = novaMusica;
                System.out.println(" ");
                System.out.println(novaMusica.getNome() + " foi adicionado a Banda " + nome);
                break;
            }
        }
    }

    public void addMembroNovo(Membros novoMembro){
        for (int i=0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = novoMembro;
                System.out.println(" ");
                System.out.println(novoMembro.getNome() + " agora participa da Banda " + nome);
                break;
            }
        }
    }
}
