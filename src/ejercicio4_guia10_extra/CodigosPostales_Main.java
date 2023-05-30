
package ejercicio4_guia10_extra;

import java.util.HashMap;
import java.util.Scanner;


public class CodigosPostales_Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        HashMap<Integer, String> codigopostal = new HashMap();
        CodigosPostales_service cp = new CodigosPostales_service();
        
        boolean salir = true;
        do {
            System.out.println("\n|*------- MENU CODIGOS POSTALES ------*|");
            System.out.println("| 1. Ingresar Codigo Postal / Ciudad   |");
            System.out.println("| 2. Buscar Codigo Postal => Ciudad    |");
            System.out.println("| 3. Agregar Codigo Postal / Ciudad    |");
            System.out.println("| 4. Eliminar Codigo Postal / Ciudad   |");
            System.out.println("| 5. Mostrar Codigos Postales / Ciudad |");
            System.out.println("| 6. Limpiar Pantalla                  |");
            System.out.println("| 7. Salir                             |");
            System.out.println("|*------------------------------------*|");
            
            System.out.print("Ingrese una Opción: ");
            int opc = sc.nextInt();
            System.out.println("");
            switch (opc) {
                case 1: cp.ingresarDatos(codigopostal); System.out.println(" ");break; 
                case 2: cp.buscarCodigo(codigopostal); System.out.println(" ");break;
                case 3: cp.agregarCodigo(codigopostal); System.out.println(" ");break;
                case 4: cp.eliminarCodigo(codigopostal);System.out.println(" ");break;
                case 5: cp.mostrarDatos(codigopostal); System.out.println(" ");break;
                case 6: cp.limpiar(1000); System.out.println(" ");break;
                case 7:
                    System.err.print("Hasta la Proxima !!!!!! \n");
                    salir = false;
                    System.out.print(""); break;
                default:
                    System.err.print("Opcion Incorrecta !!! Vuelva a intentarlo");
                                             
            } 
            
        } while (salir);
    }
}
    
