package ejercicio3_guia10_extra;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Libreria_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        HashSet<Libreria> libro = new HashSet();
        Libreria_service ls = new Libreria_service();
        
        boolean salir = true;
        do {
            System.out.println("\n*------- MENU LIBRERIA -------*");
            System.out.println("| 1. Ingresar Lista de Libros |");
            System.out.println("| 2. Imprimir Lista HashSet   |");
            System.out.println("| 3. Imprimir Lista Ordenada  |");
            System.out.println("| 4. Prestamo de Libros       |");
            System.out.println("| 5. Devolucion de Libros     |");
            System.out.println("| 6. Limpiar Pantalla         |");
            System.out.println("| 7. Salir                    |");
            System.out.println("*_____________________________*");
            
            System.out.print("\nIngrese una Opción: ");
            int opc = sc.nextInt();
            System.out.println("");
            switch (opc) {
                case 1: ls.crearLibreria(libro); break;
                case 2: ls.imprimirLibrosHash(libro); break;
                case 3: ls.imprimirLibrosArray(libro); break;
                case 4: 
                    System.out.println("\nIngrese el titulo del libro que va a prestar");
                    String titulo=sc.next();
                    if(ls.prestarLibro(libro,titulo)){
                    System.out.println("Préstamo realizado");
                    } else {
                    System.err.println("No se pudo realizar el préstamo.");
                    }  
                    System.out.println(" "); break;
                case 5:
                    System.out.println("\nIngrese el titulo del libro que va a devolver");
                    String titulo2=sc.next();
                    if(ls.devolverLibro(libro,titulo2)){
                    System.out.println("Devolucion realizada");
                    } else {
                    System.err.println("No se pudo realizar la devolucion ");
                    } 
                    System.out.println(" "); break;
                case 6: ls.limpiar(1000); break;
                case 7:
                    System.err.println("Hasta la Proxima !!!!!!");
                    salir = false;
                    System.out.println(""); break;
                default:
                    System.err.println("Opcion Incorrecta !!! Vuelva a intentarlo");
                    System.out.println("");
                         
            } 
            
        } while (salir);
    }
}
       
     
    
