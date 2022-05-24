package n1;

import java.util.ArrayList;
import java.util.Arrays;

//Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
public class ex7 {
    public static void main(String[] args) {
        ArrayList<String> llista = new ArrayList<>(Arrays.asList("Gener","2","10","Abril","Maig","7","Juliol","20","Septembre","Octubre","17","Desembre"));

        llista.stream().sorted((p1, p2) -> p2.compareTo(p1)).forEachOrdered(System.out::println);
    }
}
