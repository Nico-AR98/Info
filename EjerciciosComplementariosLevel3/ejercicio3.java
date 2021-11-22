import java.util.List;

public class ejercicio3 {

    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        int contador = 0;

        for (String palabra : palabras) {
            if (palabra.charAt(0)=='b' || palabra.charAt(0)=='B') {
                contador+=1;
            }
        }

        System.out.println(contador);
        
    }
}
