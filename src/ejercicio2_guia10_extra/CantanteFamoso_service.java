
package ejercicio2_guia10_extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class CantanteFamoso_service {
    
    // Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
    // tendrá como atributos el nombre y discoConMasVentas.
    // Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
    // objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
    // cada cantante y su disco con más ventas por pantalla.
    // Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
    // agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
    // usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios.
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        List<CantanteFamoso> cantantes = new ArrayList();
        
        // Crear Lista Cantantes
        public void crearListaCantantes(){
            System.out.print("Ingrese cantidad de Cantantes de la Lista: ");    
            int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("\nIngrese Nombre del cantante " + (i + 1) + ": ");
            String nombre = sc.next();
            System.out.print("Ingrese Disco con mas ventas del cantante " + (i + 1) + ": ");
            String discoConMasVentas = sc.next();
            cantantes.add(new CantanteFamoso(nombre, discoConMasVentas));
        }  
        
        // Imprime Lista de Cantantes
        for (CantanteFamoso cantante : cantantes) {
            System.out.println("\n--------------------------------------"+"\nCantante => "+cantante.getNombre()+"\nDisco de Mayor Venta => " +cantante.getDiscoConMasVentas()+"\n--------------------------------------");
        }
        
        }
        
        // Agregar Nuevo Cantante
        public void agregarCantante(){
            System.out.print("\nIngrese Nombre del cantante: ");
            String nombre = sc.next();
            System.out.print("Ingrese Disco con mas ventas del cantante: ");
            String discoConMasVentas = sc.next();
            cantantes.add(new CantanteFamoso(nombre, discoConMasVentas));
            
        }  
        
        
        // Mostrar Lista Cantantes Ordenada
        public void mostrarCantantes(){
            // Primero ordenamos el ArrayList
            Collections.sort(cantantes,(CantanteFamoso a, CantanteFamoso b) -> a.getNombre().compareTo(b.getNombre()));
            cantantes.forEach((aux) -> {
            System.out.println(aux);
        });
        
        }
        
         // Eliminar un Cantante
        public void eliminarCantante(){
            System.out.print("\nIngrese el Cantante a Eliminar: ");
            String cantElim = sc.next();
            boolean encuentra = false;
            if(cantantes.removeIf(c->c.getNombre().equalsIgnoreCase(cantElim))){
                System.out.println("\nSe elimino cantante correctamente");
            } else{
                System.out.println("\nEl cantante no existe");
            }
                                    
}
              
        // Metodo para limpiar pantalla
        public void limpiar(int lineas){
        for (int i=0; i < lineas; i++)
        {
        System.out.println();
        }
}
       
}

    
    
    
    
    
    
   
