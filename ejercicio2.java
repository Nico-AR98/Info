import java.util.Scanner;

public class ejercicio2 {

    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");

        float num1 = entrada.nextInt();

        System.out.println("Ingrese otro número: ");

        float num2 = entrada.nextInt();

        System.out.println("Suma = "+ (num1+num2));
        System.out.println("Resta = "+ (num1-num2));
        System.out.println("Multiplicación = " + (num1*num2));
        System.out.println("División = " + (num1/num2));
        System.out.println("Módulo = "+ (num1%num2));

    }
}
