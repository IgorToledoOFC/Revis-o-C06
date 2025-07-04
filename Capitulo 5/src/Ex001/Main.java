package Ex001;

public class Main {
    public static void main(String args[]){
        Membros mem1 = new Membros("Garry", "Vocalista");
        Musicas mu1 = new Musicas("POO Hard Song", 3.5f);

        Banda b1 = new Banda("POO on the Future", "POP", mu1, mem1);

        Membros mem2 = new Membros("Patric", "Baterista");
        Membros mem3 = new Membros("Bob", "Baixista");

        Musicas mu2 = new Musicas("Bring me the Horizon", 4.0f);
        Musicas mu3 = new Musicas("Do you wanna Know", 3.9f);

        b1.mostraInfo();

        b1.addMembroNovo(mem2);
        b1.addMembroNovo(mem3);

        b1.addMusicaNova(mu2);
        b1.addMusicaNova(mu3);

        Empresario em1 = new Empresario("Jerry Smith", 154162356);
        b1.contratarEmpresario(em1);
        b1.mostraInfo();
    }
}
