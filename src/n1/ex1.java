package n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//- Exercici 1
//        A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.
public class ex1 {
    public static void main(String[] args) {
        List <String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "a","bsada","sad", "sada", "oaiooa", "asdasd", "oasodoa");
        stringList.stream().filter(s -> s.contains("o")).forEach(System.out::println);

    }
}
