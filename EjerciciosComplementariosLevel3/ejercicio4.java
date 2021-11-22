import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ejercicio4 {

    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);

        //Añado los elementos de la lista a un Set para eliminar los duplicados
        Set<Integer> listaSinRepetidos = new HashSet<Integer>(palabras);

        List <Integer> listaFactorial = new ArrayList<Integer>();

        for (Integer num : listaSinRepetidos) {

            int resultado = factorial(num);
            listaFactorial.add(resultado);
        }

        for (Integer num : listaFactorial) {
            System.out.println(num);
        }

    }

    public static int factorial( int numero ) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
           fact *= i;
        }
   
        return fact;
    }
}

