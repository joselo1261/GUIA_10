
package ejercicio6_guia10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Tienda_service {
    
    // Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    // productos que venderemos y el precio que tendrán. Además, se necesita que la
    // aplicación cuente con las funciones básicas.
    // Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    // eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    // Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    // Realizar un menú para lograr todas las acciones previamente mencionadas.
    Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");   
    
    public void introducirProductos(HashMap<String,Double> productos) {
        
        boolean salir = true;
        
        do {
            
            System.out.println("Ingrese Nombre del Producto: ");
            String nombre = sc.next().toUpperCase();
            System.out.println("Ingrese Precio del Producto: ");
            Double precio = sc.nextDouble();

            productos.put(nombre, precio);

            System.out.println("Desea seguir ingresando productos => (S/N) ");
            String opc = sc.next();

            if (opc.equalsIgnoreCase("N")) {
                salir = false;
            }
            
        } while (salir);

    }
    
    // Imprime listado en forma ascendente
    public void mostrar (HashMap<String,Double> productos) {
        System.out.println("\t __ LISTA DE PRODUCTOS __");
        TreeMap<String,Double> prod = new TreeMap(productos); //<= Creamos TreeMap que se ordena ascendente
            
        for (Map.Entry<String, Double> entry : prod.entrySet()) {
        String nombre = entry.getKey();
        double precio = entry.getValue();
        System.out.println("Producto => " + nombre + " ; Precio => " + precio); 
        }
        
    }
    
    public void modificarPrecio(HashMap<String,Double> productos) {
        System.out.println("Ingrese el nombre del producto a modificar: ");
        String nombre = sc.next().toUpperCase();
        
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio: ");
            double precio = sc.nextDouble();
            productos.put(nombre,precio);
            System.err.println("\nPrecio modificado correctamente\n");
        } else {
            System.err.println("\nEl producto no existe !!! \n");
        }
        
    }
    
     public void eliminarProducto(HashMap<String,Double> productos) {
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        String nombre = sc.next().toUpperCase();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.err.println("\nProducto eliminado correctamente\n");
        } else {
            System.err.println("\nEl producto no existe !!!! \n");
        }

    }
     
    // Metodo para limpiar pantalla
    public void limpiar(int lineas){
    for (int i=0; i < lineas; i++)
    {
    System.out.println();
    }
}
    
}


