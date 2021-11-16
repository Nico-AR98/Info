import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba una palabra: ");

        String palabra = entrada.nextLine();

        System.out.println("Escriba un caractér: ");

        char caracter= entrada.next().charAt(0);

        System.out.println(contarCaracteres(palabra, caracter));

    }

    public static int contarCaracteres(String cadena, char caracter) {
        int posicion, contador = 0;
        posicion = cadena.indexOf(caracter);
        while (posicion != -1) { 
            contador++;                                      
            posicion = cadena.indexOf(caracter, posicion + 1);
        }
        return contador;
}


}
