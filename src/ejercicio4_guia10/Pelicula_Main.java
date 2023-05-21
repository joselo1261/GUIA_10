
package ejercicio4_guia10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Pelicula_Main {
    
    // Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
    // tendremos una clase Pelicula con el título, director y duración de la película (en horas).
    // Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
    // que se pide a continuación:
    // En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    // todos sus datos y guardándolos en el objeto Pelicula.
    // Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    // crear otra Pelicula o no.
    // Despues de ese bucle realizaremos las siguientes acciones:
    // • Mostrar en pantalla todas las películas.
    // • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    // • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    // • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    // • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    // • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    Pelicula_service ps = new Pelicula_service();
        boolean salir = true;
        
        ArrayList<Pelicula> movie = new ArrayList();
        
        System.out.println("\t ----- Crear Peliculas -----");
        ps.crearPelicula(movie);
        
        do {
            System.out.println("\t*-------------- MENU PELICULAS --------------*");
            System.out.println("1. Mostrar todas las Peliculas");
            System.out.println("2. Mostrar Peliculas con duracion mayor a => x: horas");
            System.out.println("3. Ordenar Peliculas de acuerdo a su Duracion (de mayor a menor)");
            System.out.println("4. Ordenar Peliculas de acuerdo a su Duracion (de menor a mayor)");
            System.out.println("5. Ordenar Peliculas por Titulo alfabeticamente");
            System.out.println("6. Ordenar Peliculas por Director alfabeticamente");
            System.out.println("7. Limpiar Pantalla");
            System.out.println("8. Salir.");
            System.out.println("\t===============================================");
            System.out.print("Ingrese una Opción: ");
            int opc = sc.nextInt();
            switch (opc) {
                case 1: 
                    ps.mostrar(movie);
                    System.out.println("");break;
                    
                case 2: 
                    System.out.println("Ingrese la Duracion a comparar en horas (Ej. 2,3): ");
                    double dur = sc.nextDouble();
                    ps.segunDuracion(dur,movie);
                    System.out.println(""); break;
                case 3:
                    Collections.sort(movie, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
                    ps.mostrar(movie);
                    System.out.println(""); break;
                case 4:
                    Collections.sort(movie, Comparator.comparingDouble(Pelicula::getDuracion));
                    ps.mostrar(movie);
                    System.out.println(""); break;
                case 5:
                    Collections.sort(movie, Comparator.comparing(Pelicula::getTitulo));
                    ps.mostrar(movie);
                    System.out.println(""); break;
                case 6:
                    Collections.sort(movie, Comparator.comparing(Pelicula::getDirector));
                    ps.mostrar(movie);
                    System.out.println(""); break;
                case 7:
                    ps.limpiar(1000);break;
                case 8:
                    System.err.println("Hasta la Proxima !!!!!!");
                    salir = false;
                    System.out.println(""); break;
                default:
                    System.err.println("Opcion Incorrecta. Vuelva a intentarlo.");
                    System.out.println("");
            }
            
        } while (salir);

    }

}
