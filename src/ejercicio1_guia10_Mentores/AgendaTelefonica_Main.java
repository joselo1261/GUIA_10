
package ejercicio1_guia10_Mentores;

import java.util.HashMap;

public class AgendaTelefonica_Main {

    
    public static void main(String[] args) {
        HashMap<String,Long> agenda = new HashMap();
        AgendaTelefonica at = new AgendaTelefonica();
        
        System.out.println("Crear Agenda Telefonica");
        System.out.println("-----------------------");
        at.crearContactos(agenda);
        System.out.println(" ");
        
        System.out.println("Mostrar Agenda Telefonica");
        System.out.println("-------------------------");
        at.mostrarNormal(agenda);
        System.out.println(" ");
        
        System.out.println("Mostrar Agenda Ordenada Alfabeticamente");
        System.out.println("---------------------------------------");
        at.mostrarOrden(agenda);
        
        System.out.println("Borrar un Contacto");
        System.out.println("------------------");
        at.borrarContactos(agenda);
        
        System.out.println("Mostrar Nueva Agenda");
        System.out.println("--------------------");
        at.mostrarNormal(agenda);
        System.out.println(" ");
        
    }
    
}

    