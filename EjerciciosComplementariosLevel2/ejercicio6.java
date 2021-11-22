import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ejercicio6 {

    static class Empleado {
        public String nombreyApellido;
        public int DNI;
        public int horasTrabajadas;
        public int valorPorHora;
        
        public Empleado(String nombreyApellido, int DNI, int horasTrabajadas, int valorPorHora){
            this.nombreyApellido=nombreyApellido;
            this.DNI=DNI;
            this.horasTrabajadas=horasTrabajadas;
            this.valorPorHora=valorPorHora;
        }
    }
    
    public static void main(String[] args) {
        //Se instancian algunos objetos de la clase empleado
        Empleado empleado1 = new Empleado("Juan Perez", 40985265, 8, 550);
        Empleado empleado2 = new Empleado("Mario Perez", 3568798, 30, 350);
        Empleado empleado3 = new Empleado("Fernando Carrizo", 1258746, 45, 450);

        // Se guardar los empleados en un HashSet
        Set <Empleado> empleados = new HashSet<Empleado>(); 

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        //Declaracion-inicialización variable sueldo total
        int sueldoTotal=0;

        //Declaracion HashMap para el guardado de los sueldos con clave DNI y valor sueldo total

        Map<Integer,Integer> sueldosDeEmpleados = new HashMap<>();
    
        for (Empleado empleado : empleados) {
            sueldoTotal = empleado.horasTrabajadas*empleado.valorPorHora;//Calculo del sueldo
            sueldosDeEmpleados.put(empleado.DNI,sueldoTotal); //guardo el sueldo en el HashMap
        }
    }

}






