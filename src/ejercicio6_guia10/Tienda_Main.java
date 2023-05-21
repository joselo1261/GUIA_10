
package ejercicio6_guia10;

import java.util.HashMap;
import java.util.Scanner;

public class Tienda_Main {
    
    public static void main(String[] args) {
    HashMap<String,Double> productos = new HashMap();
        Tienda_service ts = new Tienda_service();
        boolean salir = true;
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

        do {
            System.out.println("\n\t *------ MENU PRODUCTOS ------*");
            System.out.println("1. Ingresar un nuevo Producto");
            System.out.println("2. Modificar Precio de un Producto");
            System.out.println("3. Eliminar un Producto");
            System.out.println("4. Mostrar todos los Productos con su Precio");
            System.out.println("5. Limpiar Pantalla");
            System.out.println("6. Salir.");
            
            System.out.print("\nIngrese una Opción: ");
            int opc = leer.nextInt();
            System.out.println("");
            switch (opc) {
                case 1: ts.introducirProductos(productos); break;
                case 2: ts.modificarPrecio(productos); break;
                case 3: ts.eliminarProducto(productos); 
                    System.out.println(" "); break;
                case 4: 
                    ts.mostrar(productos); break;
                case 5: ts.limpiar(1000); break;
                case 6:
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