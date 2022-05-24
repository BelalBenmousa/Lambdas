package n1;

import java.util.ArrayList;
import java.util.Arrays;

//- Exercici 4
//        Fer la mateixa impressió del punt anterior, però mitjançant method reference.
public class ex4 {
    public static void main(String[] args) {
        ArrayList<String> monthss = new ArrayList<>(Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Septembre","Octubre","Novembre","Desembre"));

        monthss.stream().forEach(System.out::println);
    }
}
