package ejercicio3_guia10;

import java.util.List;

public class Alumno {
    private String nombre;
    private List<Integer> notas;

    public Alumno() {
    }

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

   
    public String mostrarLista() {
        return "Nombre Alumno: "+nombre + "Notas: "+notas +"\n";
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"+"\nNombre => " + nombre + "\nNotas => " + notas + "\n-----------------------------------";
    }
    
        
       
}
