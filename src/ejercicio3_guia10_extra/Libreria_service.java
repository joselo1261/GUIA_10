
package ejercicio3_guia10_extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;


public class Libreria_service {
    
    // Implemente un programa para una Librería haciendo uso de un HashSet para evitar
    //datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
    //información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
    //el título del libro, autor, número de ejemplares y número de ejemplares prestados.
    //También se creará en el main un HashSet de tipo Libro que guardará todos los libros
    //creados.
    //En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
    //sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
    //se le pregunta al usuario si quiere crear otro Libro o no.
    //La clase Librería contendrá además los siguientes métodos:
    //• Constructor por defecto.
    //• Constructor con parámetros.
    //• Métodos Setters/getters
    //• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
    //busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
    //método. El método se incrementa de a uno, como un carrito de compras, el
    //atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
    //cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
    //que no queden ejemplares disponibles para prestar. Devuelve true si se ha
    //podido realizar la operación y false en caso contrario.
    //• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
    //lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
    //El método decrementa de a uno, como un carrito de compras, el atributo
    //ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
    //vez que se produzca la devolución de un libro. No se podrán devolver libros
    //donde que no tengan ejemplares prestados. Devuelve true si se ha podido
    //realizar la operación y false en caso contrario.
    //• Método toString para mostrar los datos de los libros.
    
    // Metodo Crear Libreria
    
        Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        public void crearLibreria(HashSet<Libreria> libro){
        String salir;
        
        do {
            System.out.print("Ingrese el Titulo del Libro: ");
            String titulo = sc.next();
            System.out.print("Ingrese el Autor del Libro: ");
            String autor = sc.next();
            System.out.print("Ingrese numero de Ejemplares: ");
            int numero_ejempl = sc.nextInt();
            int numero_ejempl_prestados= 0;
                        
            libro.add(new Libreria(titulo,autor,numero_ejempl,numero_ejempl_prestados));
                       
            System.out.print("\nDesea crear otro Libro => (S/N) ");
            salir = sc.next();
            } while (salir.equalsIgnoreCase("S"));
        }
        
        public void imprimirLibrosHash(HashSet<Libreria> libro){
            System.out.println("\nImprimir el HashSet: ");
            for (Libreria l:libro){
            System.out.print(l);
            }
        }
         
        // Imprimir Ordenado se pasa el HashSet a un ArrayList
        public void imprimirLibrosArray(HashSet<Libreria> libro){
            System.out.println("\nImprimir con ArrayList (Ordenada) ");
            List<Libreria> libroar = new ArrayList(libro);
            Collections.sort(libroar,(Libreria a, Libreria b)-> a.getTitulo().compareToIgnoreCase(b.getTitulo()));
            libroar.forEach((aux) -> {
            System.out.println(aux);
        });
        
}
        
        // Metodo Prestamo
        public boolean prestarLibro(HashSet<Libreria>libro,String titulo){
            for (Libreria lib: libro)  {
                if(lib.getTitulo().equalsIgnoreCase(titulo) && (lib.getNumero_ejempl()>0) ){
                    lib.setNumero_ejempl(lib.getNumero_ejempl()-1);
                    lib.setNumero_ejempl_prestados(lib.getNumero_ejempl_prestados()+1);
                    return true;
                }
            }
            return false;
        }
        
       // Metodo Devolucion
        public boolean devolverLibro(HashSet<Libreria>libro,String titulo){
            for (Libreria lib: libro)  {
                if(lib.getTitulo().equalsIgnoreCase(titulo) && (lib.getNumero_ejempl_prestados()>0)){
                    lib.setNumero_ejempl(lib.getNumero_ejempl()+1);
                    lib.setNumero_ejempl_prestados(lib.getNumero_ejempl_prestados()-1);
                    return true;
                }
            }
            return false;
        }
        
        
        // Metodo para limpiar pantalla
        public void limpiar(int lineas){
        for (int i=0; i < lineas; i++)
        {
        System.out.println();
        }
}
    
        
        
    }


        
    
    
    
    
    
