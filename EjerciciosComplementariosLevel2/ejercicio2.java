import java.util.ArrayList;

public class ejercicio2 {
   public static void main(String[] args) {
        
    ArrayList<Integer> numeros = new ArrayList<Integer>(); //genero la lista

    //añado 5 elementos a la lista
    numeros.add(1);
    numeros.add(8);
    numeros.add(9);
    numeros.add(48);
    numeros.add(65);

    //añado dos elementos más, uno al principio y otro al final
    numeros.add(0,4);
    numeros.add(78);

    //imprimo los elementos de la lista al final
    System.out.println("Los elementos de la lista al final son: ");
    for(Integer i: numeros){
        System.out.println(i);                 
    }

    System.out.println();
    System.out.println("Cantidad de elementos de la lista al final: "+numeros.size());
    System.out.println();

    numeros.remove(0);
    numeros.remove(numeros.size()-1);

    System.out.println("Los elementos de la lista al principio son: ");
    for(Integer i: numeros){
        System.out.println(i);                 
    }

    System.out.println("Cantidad de elementos de la lista al principio: "+numeros.size());

    }
        
    
}
