import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba un número entero: ");

        int num = entrada.nextInt();

        List<Integer> numeros;

        numeros = new ArrayList<>();

        for (int i=1; i<=num;i++){
            numeros.add(i);

            for (int a=0; a<numeros.size();a++){
                System.out.print(numeros.get(a));
            }

            System.out.println();

        }

    }
}
