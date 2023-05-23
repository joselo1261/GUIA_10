package ejercicio2_guia10_extra;

import ejercicio4_guia10.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class CantanteFamoso_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        CantanteFamoso_service cfs = new CantanteFamoso_service();
        
        System.out.println("\t ---Crear Lista de Cantantes Famosos ---");
        cfs.crearListaCantantes();
        
        boolean salir = true;
        
        do {
            System.out.println("\t*------------- MENU CANTANTES FAMOSOS -------------*");
            System.out.println("1. Mostrar todos los Cantantes Famosos");
            System.out.println("2. Agregar un Cantante Famoso");
            System.out.println("3. Eliminar un Cantante Famoso");
            System.out.println("4. Limpiar Pantalla");
            System.out.println("5. Salir.");
            System.out.println("\t===============================================");
            System.out.print("Ingrese una Opción: ");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    cfs.mostrarCantantes();
                    System.out.println("");break;
                case 2: 
                    cfs.agregarCantante();
                    System.out.println(""); break;
                case 3:
                    cfs.eliminarCantante();
                    System.out.println(""); break;
                case 4:
                    cfs.limpiar(1000);break;
                case 5:
                    System.err.println("Hasta la Proxima !!!!!!\n");
                    salir = false;
                    System.out.println(""); break;
                default:
                    System.err.println("Opcion Incorrecta. Vuelva a intentarlo.");
                    System.out.println("");
            }
            
        } while (salir);
}

}
