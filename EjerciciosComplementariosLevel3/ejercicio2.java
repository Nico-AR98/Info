import java.util.ArrayList;
import java.util.List;

public class ejercicio2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> nuevaList = new ArrayList<Integer>();

        for (Integer num : palabras) {
            int potencia= (int) Math.pow(num, 2);
            nuevaList.add(potencia);
        }

        for (Integer num : nuevaList) {
           System.out.println(num);
        }

    }

}
