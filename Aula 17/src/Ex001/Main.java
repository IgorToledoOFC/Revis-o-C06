package Ex001;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> listaDeDouble = new ArrayList<Double>();


        for(int i=0; i < 5; i++){
            listaDeDouble.add(new Random().nextDouble()*10);
        }

        System.out.println("Esses são os elementos");
        for (Double double1 : listaDeDouble){
            System.out.println(double1);
        }

        Collections.sort(listaDeDouble, Collections.reverseOrder());

        System.out.println("Esses são os elementos ordenados");
        for (Double double1 : listaDeDouble){
            System.out.println(double1);
        }
    }
}
