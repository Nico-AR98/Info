import java.util.ArrayList;
import java.util.List;

public class ejercicio4 {

    public static void main(String[] args) {
        List<String> estudiantes = new ArrayList<String>();
        estudiantes.add("Mario Maidana");
        estudiantes.add("Lucia Acuña");
        estudiantes.add("Diego Galeano");
        estudiantes.add("Maximo Fernández");
        estudiantes.add("Enrique Peña");
        estudiantes.add("Nicolás Monzon");
        estudiantes.add("Federico Martinez");
        estudiantes.add("Florencia Viera");
        estudiantes.add("Micaela Alvarenga");
        estudiantes.add("Rocio Barrientos");
        estudiantes.add("Belen Jantus");
        estudiantes.add("Roque Sosa");

        List<String> cursoJava = new ArrayList<String>();
        cursoJava= estudiantes.subList(0, 4);


        List<String> cursoBasesDeDatos = new ArrayList<String>();
        cursoBasesDeDatos= estudiantes.subList(3, 7);


        List<String> cursoBootstrap = new ArrayList<String>();
        cursoBootstrap= estudiantes.subList(4, 12);

    }
}