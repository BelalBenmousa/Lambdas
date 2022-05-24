package n1;

import java.util.ArrayList;
import java.util.Arrays;

// Exercici 3
// Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.
public class ex3 {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>(Arrays.asList("Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Septembre","Octubre","Novembre","Desembre"));

        months.forEach((e) -> {
            System.out.println(e);
        });
    }
}
