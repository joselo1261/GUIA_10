package ejercicio5_guia10;

    
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


    // Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
    // usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
    // conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
    // si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
    // los servicios en la clase correspondiente)
    // Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    // cómo se ordena un conjunto.
    // Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    // buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    // usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará al usuario.

    public class Pais_service {
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        
        // Crear Lista de Paises
        public void pedirPaises(TreeSet<String> paises) {
        
        boolean salir = true;
        
        do {
            System.out.print("Ingrese un Pais: ");
            String pais = sc.next().toUpperCase();
            paises.add(pais);

            System.out.print("\nDesea ingresar otro Pais => (S/N) ");
            String resp = sc.next();

            if (resp.equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);
            System.out.println("\n\t -- Lista de Paises -- ");
            System.out.println("Paises: " + paises);
        
    }
    
        // Eliminar un pais a eleccion
        public void eliminaPais(TreeSet<String> paises) {
        Iterator<String> it = paises.iterator();
        boolean encuentra = false;
        System.out.println("Ingrese el Pais a eliminar: ");
        String pais = sc.next();
        
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(pais)) {
                it.remove();
                encuentra = true;
                System.err.println("\nListado de Paises actualizado: " + paises +"\n");
                
            }
        }
        
        if (!encuentra) {
            System.err.println("\nEl Pais no se encuentra\n");
        }
        
    }
}
