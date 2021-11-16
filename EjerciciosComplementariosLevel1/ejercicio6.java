import java.util.Scanner;

public class ejercicio6 {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba la base: ");

        int base = entrada.nextInt();

        System.out.println("Escriba el exponente: ");

        int expo= entrada.nextInt();

        int resultado=1;

        for (int i=0; i<expo; i++){
            resultado*=base;
        }

        System.out.println("El resultado de "+base+" elevado al "+ expo+" es: "+ resultado);
     
    }
}
