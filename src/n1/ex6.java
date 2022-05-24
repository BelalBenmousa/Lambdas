package n1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.
public class ex6 {
    public static void main(String[] args) {
        ArrayList<String> llista = new ArrayList<>(Arrays.asList("Gener","2","10","Abril","Maig","7","Juliol","20","Septembre","Octubre","17","Desembre"));

        llista.stream().sorted(
                Comparator.comparing(n->n.toString())).collect(Collectors.toList()).forEach(System.out::println);
    }
}
