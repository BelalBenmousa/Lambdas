package n1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.

interface Reverse {
    String reverseString(String palabra);
}

public class ex8 {

    public static void main(String[] args) {
        Reverse reverseString = (str) -> {
            return Stream.of(str)
                    .map(word->new StringBuilder(word).reverse())
                    .collect(Collectors.joining(" "));
        };

        System.out.println(reverseString.reverseString("Hola"));
    }


}
