import java.util.ArrayList;
public class ejercicio5 {
    public static void main(String[] args) {
        
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();

        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();

        ArrayList<Integer> totalPorDia = new ArrayList<Integer>();

        for (int i=0;i<horasTrabajadas.size();i++){

            for (int j=0; j<valorPorHora.size();j++){
                totalPorDia.add(horasTrabajadas.get(i)+valorPorHora.get(j));
            }
        }
    }
}
