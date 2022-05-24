package n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.
public class ex2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "a","bsadao","sad", "sada", "oaiooa", "asdasd", "oasodoa");
        stringList.stream().filter(s -> s.length() >= 5 && s.contains("o")).forEach(System.out::println);
    }
}
