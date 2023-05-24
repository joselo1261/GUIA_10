
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
            
            System.out.print("\nIngrese una Opción: ");
            int opc = sc.nextInt();
            System.out.println("");
            switch (opc) {
                case 1: cp.ingresarDatos(codigopostal); break;
                case 2: cp.buscarCodigo(codigopostal); break;
                case 3: cp.agregarCodigo(codigopostal); break;
                case 4: cp.eliminarCodigo(codigopostal);break;
                case 5: cp.mostrarDatos(codigopostal); break;
                case 6: cp.limpiar(1000); break;
                case 7:
                    System.err.println("Hasta la Proxima !!!!!!");
                    salir = false;
                    System.out.println(""); break;
                default:
                    System.err.println("\nOpcion Incorrecta !!! Vuelva a intentarlo");
                                             
            } 
            
        } while (salir);
    }
}
    
