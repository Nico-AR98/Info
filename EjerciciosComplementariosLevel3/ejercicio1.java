import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ejercicio1 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();

        lista.add("Hola");
        lista.add(null);
        lista.add("Informatorio");
        lista.add("");

        List<String> filtroLista = lista.stream()
                        .filter(Objects::nonNull).filter(p -> p.equals("")).collect(Collectors.toList());

        System.out.println(filtroLista);
    }

}
