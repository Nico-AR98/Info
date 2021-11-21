package empleado;
public class Empleado {
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
