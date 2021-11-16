import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre y apellido");

        String nombre = entrada.nextLine();


        System.out.println("Ingrese su edad: ");

        String edad = entrada.nextLine();


        System.out.println("Ingrese su dirección: ");

        String direccion = entrada.nextLine();


        System.out.println("Ingrese su ciudad: ");

        String ciudad = entrada.nextLine();

        System.out.println(ciudad+"-"+direccion+"-"+edad+"-"+nombre);

    }
}
