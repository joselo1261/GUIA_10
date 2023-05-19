package ejercicio5_guia10;

import java.util.TreeSet;

public class Pais_Main {

        public static void main(String[] args) {
        TreeSet<String> paises = new TreeSet();
        Pais_service ps = new Pais_service();
        
        System.out.println("\t----- Crear Lista de Paises -----");
        ps.pedirPaises(paises);
        
        System.out.println("\n\t----- Elimnar un Pais de la Lista -----");
        ps.eliminaPais(paises);
        
    }
    
}
