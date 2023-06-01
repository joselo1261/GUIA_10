
package ejercicio1_guia10_extra;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros_Main {

    
    // Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
    // y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
    // introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
    // programa mostrará por pantalla el número de valores que se han leído, su suma y su
    // media (promedio).
       
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
       ArrayList<Integer> numeros = new ArrayList();
        int num;
        int suma = 0;

        // Cargar numeros en la Lista
        do{
            System.out.print("Ingrese numeros enteros (finaliza carga con el -99): ");
            num = sc.nextInt();
            numeros.add(num);
            suma += num;
            
            }while (num != -99);
        {
      
        // Mostrar valores y calcular la suma y el promedio
        double promedio = (double) suma / numeros.size();
            System.out.println("\nCantidad de numeros ingresados:  " + numeros.size());
            System.out.println("\nLa Suma de los valores es : " + suma);
            System.out.println("\nEl Promedio de los valores es : " + promedio);
            System.out.println("----------------------------------------");
                            
        }
        }
}