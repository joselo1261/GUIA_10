package ejercicio3_guia10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

    public class Alumno_service {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        List<Alumno> alumnos;

        public Alumno_service() {
        alumnos = new ArrayList();
        }
        
        
        // Metodo Crear Alumno   
        public void crearAlumnos() {
        String cont;
        System.out.print("Ingrese cantidad Notas a relevar por alumno: ");
        int cant=sc.nextInt();

        do {
            System.out.print("\nIngrese el nombre del alumno: ");
            String nombre = sc.next();
            
            List<Integer> notas = new ArrayList();
            for (int i = 0; i < cant; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + " : ");
                notas.add(sc.nextInt());
            }
            
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            System.out.println(alumno);
            
            System.out.print("\nDesea crear otro alumno => (S/N) ");
            cont = sc.next();
            } while (cont.equalsIgnoreCase("S"));
        }

        // Metodo imprimir Lista Alumnos creada
        public void imprimirLista(){
            for(Alumno a : alumnos){
                System.out.println("Nombre: " + a.getNombre() + ", Notas: " + a.getNotas());
            }
               
        }
            
                
        // Metodo nota Final 
        public double notaFinal(String nombre){

            Iterator<Alumno> it = alumnos.iterator(); 
            
            while (it.hasNext()) {
            Alumno alumno = it.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                int sum = 0;
                for (int nota : alumno.getNotas()) {
                    sum += nota;
                }
                return (double) sum / alumno.getNotas().size();
            }
        }
        return -1;
    }

}