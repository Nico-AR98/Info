import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.time.Period;


class ejercicio5 {

    static class Alumno {
        public String apellido;
        public String nombre;
        public LocalDate fechaDeNacimiento;
    
        public Alumno(String apellido, String nombre, String fechaDeNacimiento) {
            this.apellido=apellido;
            this.nombre=nombre;
            this.fechaDeNacimiento=LocalDate.parse(fechaDeNacimiento);
        }
    
    }

    public static void main(String[] args) {

        Alumno alumno1 =new Alumno("Martinez","Mariano","1998-09-12");
        Alumno alumno2 =new Alumno("Sanchez","Leandro","2000-07-10");
        Alumno alumno3 =new Alumno("Mora","Sergio","2001-02-18");
        Alumno alumno4 =new Alumno("Gallardo","Nicolás","2001-07-12");
        Alumno alumno5 =new Alumno("Fernandez","Joaquin","1995-04-09");

        List <Alumno> listaAlumnos = List.of(alumno1,alumno2,alumno3,alumno4,alumno5);

        Map<String,Integer> listaEdadesAlumnos = new HashMap<>();

        LocalDate ahora = LocalDate.now(); //Fecha actual

        for (Alumno alumno : listaAlumnos) {
            Period periodo = Period.between(alumno.fechaDeNacimiento, ahora);
            int edad = periodo.getYears();
            listaEdadesAlumnos.put(alumno.apellido, edad);
        }

        //Muestra las edades de los alumnos
        for (Alumno alumno : listaAlumnos) {
            System.out.println(listaEdadesAlumnos.get(alumno.apellido));
        }
 
    }
}




