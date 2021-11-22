import java.util.ArrayList;
import java.util.List;

public class ejercicio1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        for (int i=0;i<palabras.size();i++){
            if (palabras.get(i)=="" || palabras.get(i)==null){
                palabras.remove(i);
            }
        }

        for (int i=0;i<palabras.size();i++){
          System.out.println(palabras.get(i));
        }

    }

}
