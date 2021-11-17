import java.util.ArrayList;
public class ejercicio5 {
    public static void main(String[] args) {
        
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);

        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();

        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        ArrayList<Integer> totalPorDia = new ArrayList<Integer>();

        for(int i=0;i<horasTrabajadas.size();i++){
            int totalDelDia = horasTrabajadas.get(i)*valorPorHora.get(i);
            totalPorDia.add(totalDelDia);  
        }

        System.out.println(totalPorDia);

        int totalFinalACobrar = 0;

        for (int i=0;i<totalPorDia.size();i++){
            totalFinalACobrar+=totalPorDia.get(i);
        }

        System.out.println(totalFinalACobrar);


    }

}
