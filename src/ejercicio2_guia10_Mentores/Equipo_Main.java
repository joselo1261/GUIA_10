
package ejercicio2_guia10_Mentores;

import java.util.ArrayList;

public class Equipo_Main {

    public static void main(String[] args) {
        ArrayList<Equipo> equipos = new ArrayList();
        
        Equipo_service es = new Equipo_service();
        
        es.llenarLista(equipos);
        System.out.println(" ");
        
        es.mostrarEquipos(equipos);
        System.out.println(" ");
                
        es.finalTorneo(equipos);
        System.out.println(" ");
        
    }
    
}
