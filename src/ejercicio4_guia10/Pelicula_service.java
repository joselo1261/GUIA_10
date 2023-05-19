
package ejercicio4_guia10;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicio4_guia10.Pelicula;

    // Crear Peliculas
    public class Pelicula_service {
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    public void crearPelicula(ArrayList<Pelicula> movie) {
        
        boolean salir = true;
        do {
            Pelicula p = new Pelicula();
            System.out.print("Ingrese Titulo de la pelicula: ");
            p.setTitulo(sc.next());
            System.out.print("Ingrese Director de la pelicula: ");
            p.setDirector(sc.next());
            System.out.print("Ingrese Duracion de la pelicula en horas: ");
            p.setDuracion(sc.nextDouble());

            movie.add(p);

            System.out.println("");
            System.out.print("Desea ingresar otra pelicula => (S/N) ");
            String resp = sc.next();
            System.out.println("");
            if (resp.equalsIgnoreCase("N")) {
                salir = false;
            }

        } while (salir);
        
    }
    
    // Mostrar Pelicula
    public void mostrar(ArrayList<Pelicula> movie) {
        movie.forEach((aux) -> {
            System.out.println(aux);
        });
    }
    
    
    // Mostrar Peliculas con duracion mayor a la ingresad por el usuario en el main
    public void segunDuracion(double dur,ArrayList<Pelicula> movie) {
        movie.forEach((aux) -> {
            if (aux.getDuracion() >= dur) {
                System.out.println(aux);
            }
        });
    }
    
    
    
    // Metodo para limpiar pantalla
    public void limpiar(int lineas){
    for (int i=0; i < lineas; i++)
    {
    System.out.println();
    }
}
}
    
    
    
