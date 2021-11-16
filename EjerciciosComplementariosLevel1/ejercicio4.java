import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba un número entero: ");

        int num = entrada.nextInt();

        int resultado=1;

        for (int i=1; i<=num; i++){

            resultado *=i;

        }

        System.out.println("El factorial de "+num+" es: "+resultado);

        
    }
}
