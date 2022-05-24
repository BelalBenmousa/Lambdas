package n1;
//Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.



public class ex5 {

interface operacion

{
        public double getPiValue ( double pi);

        public static void main (String[]args){
            operacion o = (x) -> x;
            System.out.println(o.getPiValue(3.14));
        }

    }
}
