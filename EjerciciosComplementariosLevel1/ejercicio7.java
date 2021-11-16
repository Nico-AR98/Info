import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ejercicio7 {

    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba una palabra: ");

        String palabra = entrada.nextLine();

        List<Integer> listOfIntegers = palabra.chars()                      
            .boxed()                      
            .collect(Collectors.toList());  

        for(int i:listOfIntegers) {

            int asciiValorMayus;

            if (i==32){
                asciiValorMayus =i;
            } else {
                asciiValorMayus=i-32;
            }

            
            System.out.print(Character.toString(asciiValorMayus));
        }

        System.out.println();

    }

}
