package ejercicio1_guia10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class RazasPerros {

    // Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    // programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    // después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    // salir, se mostrará todos los perros guardados en el ArrayList.    
    
    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String raza;
        String opcion;
        boolean encuentra=false;

        while (true) {
            System.out.print("Ingrese una raza de perro: ");
            raza = sc.nextLine();
            razas.add(raza);

            System.out.print("\nDesea guardar otro perro (Enter)");
            System.out.println("\nDesea Salir: Digite => (S)");
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("S")) {
                break;
            }
        }
        
        // Opcion1
        System.out.println("\t ......OPCION 1......");
        System.out.println("\nLos Perros guardados en el ArrayList son :\n");
        for (String r : razas) {
            System.out.println(r);
            
        }
        System.out.println(" ");
                
        // Opcion2
        System.out.println("\t ....OPCION 2....");
        System.out.println("\nLos Perros guardados en el ArrayList son :\n");
        razas.forEach((aa) -> {
            System.out.println(aa);
        });
        System.out.println(" ");
        
        
    // Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    // un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    // está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    // ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará la lista ordenada.
        
        while(true){
            System.out.print("\nDesea eliminar una raza de perro (Enter)");
            System.out.println("\nDesea Salir: Digite => (S)");
            opcion = sc.nextLine();

            if (opcion.equalsIgnoreCase("S")) {
                break;
            }
            
            Iterator<String> it = razas.iterator(); 
            System.out.println("\nIngrese la raza de perro a eliminar");
            String nombre=sc.nextLine();
            while (it.hasNext()) { 
                if (it.next().equals(nombre)) {  
                  it.remove();   
                  encuentra=true;
            }   
            }
            if(!encuentra){
                System.out.println("\nLa raza que desea eliminar no se encuentra\n");
            }
            Collections.sort(razas);
            System.out.println("\nLos Perros en el ArrayList son ahora:\n");
            razas.forEach((aux) -> {
            System.out.println(aux);
            });
            System.out.println(" ");
                         
        }
        
}
     
}
    
    