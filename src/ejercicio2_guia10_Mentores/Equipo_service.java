package ejercicio2_guia10_Mentores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Equipo_service {
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void llenarLista(ArrayList<Equipo> equipos) {

        System.out.println("Tabla de Posiciones Futbol Final Torneo");
        System.out.println("***************************************");
        Equipo eq1 = new Equipo("Belgrano", "Cordoba", 7, 6, 0, 1, 19);
        Equipo eq2 = new Equipo("Talleres", "Cordoba", 7, 3, 3, 1, 10);
        Equipo eq3 = new Equipo("River", "Buenos Aires", 6, 5, 0, 1, 16);
        Equipo eq4 = new Equipo("Boca", "Buenos Aires", 6, 3, 2, 1, 10);
        Equipo eq5 = new Equipo("San Martin", "San Juan", 7, 4, 3, 0, 12);
        Equipo eq6 = new Equipo("Huracan", "Buenos Aires", 7, 2, 3, 2, 8);
        Equipo eq7 = new Equipo("Colon", "Santa Fe", 7, 4, 2, 1, 13);
        Equipo eq8 = new Equipo("Union", "Santa Fe", 7, 2, 3, 2, 8);
        Equipo eq9 = new Equipo("Rosario Central", "Rosario", 7, 5, 0, 2, 17);
        Equipo eq10 = new Equipo("Godoy Cruz", "Mendoza", 7, 3, 4, 0, 9);

        equipos.add(eq1);
        equipos.add(eq2);
        equipos.add(eq3);
        equipos.add(eq4);
        equipos.add(eq5);
        equipos.add(eq6);
        equipos.add(eq7);
        equipos.add(eq8);
        equipos.add(eq9);
        equipos.add(eq10);

    }

    public void mostrarEquipos(ArrayList<Equipo> equipos) {
        
        Collections.sort(equipos,Comparator.comparingInt(Equipo::getPuntosTotales).reversed());
        
        imprimirTabla(equipos);
    }
    
    public void finalTorneo(ArrayList<Equipo> equipos) {
        
        Collections.sort(equipos,Comparator.comparingInt(Equipo::getPuntosTotales).reversed());
        
        System.out.println("");
        System.out.println("Equipo ganador  => " + equipos.get(0).getNombreEquipo()+ " con " + equipos.get(0).getPuntosTotales() + " puntos.");
        System.out.println("Equipo perdedor => " + equipos.get(9).getNombreEquipo() + " con " + equipos.get(9).getPuntosTotales() + " puntos.");
        System.out.println("");
        
        System.out.println("Ingrese Equipo que Ascendio de la Division Inferior: ");
        String nombre = sc.next();
        System.out.println("Ingrese la ciudad: ");
        String ciudad = sc.next();
        System.out.println(" ");
        
        equipos.remove(9);
        equipos.add(new Equipo(nombre,ciudad,0,0,0,0,0));
        
        equipos.forEach((Equipo equipo) -> {
            equipo.setCantidadPartidos(0);
            equipo.setGanados(0);
            equipo.setPerdidos(0);
            equipo.setEmpatados(0);
            equipo.setPuntosTotales(0);
        });
        
        Collections.sort(equipos,Comparator.comparing(Equipo::getNombreEquipo));
        
        System.out.println("Tabla Posiciones Futbol Inicio Torneo");
        System.out.println("=====================================");
        System.out.println(" ");
        
        imprimirTabla(equipos);
        
}
       
    public void imprimirTabla(ArrayList<Equipo> equipos){
        
        System.out.println("*******************************************************************************************");
        System.out.printf("%-1s %-3s %-1s %-19s %-1s %-19s %-1s %5s %-1s %5s %-1s %5s %-1s %5s %-1s %5s %-1s","|","#","|", "EQUIPO","|", "CIUDAD", "|","PJ", "|","PG","|", "PP","|", "PE","|","PT","|");
        System.out.println("\n*******************************************************************************************");
        
        equipos.forEach((Equipo equipo) -> {
            int posic= equipos.indexOf(equipo); // Obtener la posicion en el Array de cada elemento
            System.out.printf("%-1s %-3s %-1s %-19s %-1s %-19s %-1s %5s %-1s %5s %-1s %5s %-1s %5s %-1s %5s %-1s","|",(posic+1),"|",equipo.getNombreEquipo(),"|", equipo.getCiudad(),
                    "|",equipo.getCantidadPartidos(),"|", equipo.getGanados(), "|",equipo.getPerdidos(),"|", equipo.getEmpatados(),
                    "|",equipo.getPuntosTotales(),"|");
            
            System.out.println("\n-------------------------------------------------------------------------------------------");
            });
        
}
     
}
