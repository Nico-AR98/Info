import java.util.ArrayList;

public class ejercicio1 {
    
    public static void main(String[] args) {
        
        ArrayList<String> ciudades = new ArrayList<String>();

        ciudades.add("#1 Córdoba");
        ciudades.add("#2 Corrientes");
        ciudades.add("#3 Salta");

        for (int i=0;i<ciudades.size();i++){

            System.out.println(ciudades.get(i));

        }
    }
        

}
