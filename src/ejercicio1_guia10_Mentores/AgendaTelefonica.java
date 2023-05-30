
package ejercicio1_guia10_Mentores;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


// Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. 
// La clase debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos 
// y mostrar los contactos ordenados alfabéticamente por nombre.
// En el programa principal, crear un mapa (HashMap) de tipo "String" (nombre del contacto) y "Integer" (número de teléfono). 
// Luego, mostrar un menú que le dé al usuario la opción de agregar un contacto, buscar un contacto por nombre, 
// mostrar todos los contactos o mostrar los contactos ordenados alfabéticamente.

public class AgendaTelefonica {
    
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void crearContactos (HashMap<String,Long> agenda) {
        
        boolean salir = true;
        
        do {
            System.out.println("Ingrese el nombre del contacto: ");
            String nombre = sc.next().toUpperCase();
            System.out.println("Ingrese el numero de telefono: ");
            long numero = sc.nextLong();

            agenda.put(nombre, numero);

            System.out.println("Desea agregar otro contacto? (S/N) ");
            String rta = sc.next();
            if (rta.equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);

    }
    
    // Orden Normal
    public void mostrarNormal (HashMap<String,Long> agenda) {
    
        for (Map.Entry<String, Long> entry : agenda.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            
            System.out.println("\nContacto: " + key + "\nNumero: " + value);
            
        }
    
    }
    
    // Ordenada Alfabeticamente
    public void mostrarOrden(HashMap<String,Long> agenda) {
        
        TreeMap<String,Long> agendaT = new TreeMap(agenda); // Se pasa a TreeMap para que se ordene
        
        for (Map.Entry<String, Long> entry : agendaT.entrySet()) {
            String key = entry.getKey();
            Long value = entry.getValue();
            
            System.out.println("\nContacto: " + key + "\nNumero: " + value);
            
        }
        System.out.println(" ");
    }
    
    public void borrarContactos(HashMap<String,Long> agenda) {
    
        System.out.println("\nIngrese el nombre del contacto a borrar: ");
        String nombre = sc.next().toUpperCase();

        if (agenda.containsKey(nombre)) {
            agenda.remove(nombre);
            System.out.println("\nSe borra el contacto " + nombre + ".");
        } else {
            System.err.println("\nNo se encontro el contacto.");
        }
        System.out.println(" ");
    }
    
}

