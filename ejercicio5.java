import java.util.Scanner;

public class ejercicio5 {
    
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba un número: ");

        int num1= entrada.nextInt();

        System.out.println("Escriba otro número: ");

        int num2= entrada.nextInt();

        int resultado=0;

        for (int i=0; i<num2; i++){
            resultado+=num1;
        }

        System.out.println("El resultado de "+num1+" multiplicado por "+num2+" es igual a: "+resultado);

        
     
    }
}
