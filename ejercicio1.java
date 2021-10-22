import java.util.Scanner;

public class ejercicio1 {

    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");

        String nombre_usuario= entrada.nextLine();

        System.out.println("Hola "+nombre_usuario);
    }
    
}