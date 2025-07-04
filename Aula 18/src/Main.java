import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numValue = 10000;
        long initialTime, endTime;

        List<Integer> listOfIntegers = new ArrayList<Integer>(); // Lista de inteiros para Array tipo List
        Set<Integer> setIntegers = new HashSet<Integer>(); // Lista de inteiros para Array do tipo HashSet
        Map<Integer, Integer> mapOfIntegers = new HashMap<Integer, Integer>(); // lista de inteiros para Array do tipo HashMap

        // Adding on List (ArrayList)
        initialTime = System.currentTimeMillis();
        for(int i=0; i < numValue; i++){
            listOfIntegers.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to Insert on the List: " + (endTime-initialTime) + "ms");

        // Adding on HashSet
        initialTime = System.currentTimeMillis();
        for(int i=0; i < numValue; i++){
            listOfIntegers.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time to Insert on the List: " + (endTime-initialTime) + "ms");




    }
}