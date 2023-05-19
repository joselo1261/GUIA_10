package ejercicio3_guia10;

import java.util.Scanner;


    public class Alumno_Main {

    // Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
    // alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer con sus 3 notas.
    // En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
    // toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    // pregunta al usuario si quiere crear otro Alumno o no.
    // Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
    // Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    // final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    // del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    // promedio final, devuelto por el método y mostrado en el main.
        
    public static void main(String[] args) {
        Alumno_service alumserv = new Alumno_service();
        Scanner sc = new Scanner(System.in);
        System.out.println("\t------Crea Alumnos------");
        alumserv.crearAlumnos();
        
        System.out.println("\n\t------Imprime Lista Alumnos------");
        alumserv.imprimirLista();
        
        
        // Nota Final pidiendo nombre Alumno
            System.out.println("\nIngrese Nombre del alumno para calcular la nota final: ");
            String nombre = sc.nextLine();
            double notaFinal = alumserv.notaFinal(nombre);
            if (notaFinal == -1) {
            System.err.println("\nEl alumno no se encuentra en la lista.\n");
                } else {
            System.out.println("\nLa nota final de " + nombre + " es: " + notaFinal);
                System.out.println(" ");
            }
        }
    } 