package ejercicio4_guia10_extra;

    
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

    //  Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página
    //  https://mapanet.eu/index.htm. 
    //  Nota: Poner el código postal sin la letra, solo el numero.
    //• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
    //• Muestra por pantalla los datos introducidos
    //• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
    //usuario.
    //• Muestra por pantalla los datos
    //• Agregar una ciudad con su código postal correspondiente más al HashMap.
    //• Elimina 3 ciudades existentes dentro del HashMap

    
public class CodigosPostales_service {
    Scanner sc = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
        
    // Mostrar listado en forma ascendente
    public void mostrarDatos(HashMap<Integer, String> codigopostal) {
        System.out.print("\n\t __ CODIGO POSTAL / CIUDAD __");
        TreeMap<Integer, String> cpt = new TreeMap(codigopostal); //<= Creamos TreeMap que se ordena ascendente
            
        for (Map.Entry<Integer, String> entry : cpt.entrySet()) {
        int codigop = entry.getKey();
        String city = entry.getValue();
        System.out.print("\nCodigo Postal => " + codigop + "\nCiudad => "+city);
        }
        System.out.print("\n................................................");
}
    
    
    // Buscar ciudad por código postal
    public void buscarCodigo(HashMap<Integer, String> codigopostal){
      System.out.print("\nIngrese Codigo Postal buscar Ciudad: ");
        int codigo = sc.nextInt();
        if (codigopostal.containsKey(codigo)) {
            System.out.print("Ciudad asociada: " + codigopostal.get(codigo)+"\n");
        } else {
            System.err.print("No se encuentra asociada a un Codigo Postal \n");
        }
        System.out.print(" ");
}
    
    
    public void agregarCodigo(HashMap<Integer, String> codigopostal){
        System.out.print("\nIngrese Codigo Postal: ");
        int cp = sc.nextInt();
        System.out.print("\nIngrese Ciudad: ");
        String ciudad = sc.next().toUpperCase();

        codigopostal.put(cp, ciudad);
        System.out.println("\nCodigo ingresado correctamente");
        
    }
    
    public void eliminarCodigo(HashMap<Integer, String> codigopostal) {
        System.out.print("\nIngrese Codigo Postal: \n");
        int cpel = sc.nextInt();

        if (codigopostal.containsKey(cpel)) {
            codigopostal.remove(cpel);
            System.err.print("Codigo/Ciudad eliminado correctamente \n");
        } else {
            System.err.print("El Codigo no existe !!!! ");
        }
}
    
    // Metodo para limpiar pantalla
    public void limpiar(int lineas){
    for (int i=0; i < lineas; i++)
    {
    System.out.println();
    }
}
    
   public void ingresarDatos(HashMap<Integer, String> codigopostal) {
        boolean salir = true;
        do {
            System.out.print("\nIngrese Codigo Postal: ");
            int cp = sc.nextInt();
            System.out.print("\nIngrese Ciudad: ");
            String ciudad = sc.next().toUpperCase();

            codigopostal.put(cp, ciudad);
                        
            System.out.print("\nCodigo Postal => " + cp + "\nCiudad => "+ciudad+"\n");

            System.out.print("\nDesea seguir ingresando productos => (S/N) "+"\n");
            String opc = sc.next();

            if (opc.equalsIgnoreCase("N")) {
                salir = false;
            }
        } while (salir);
        
        // Codigos Postales Agregados de la Pagina Web
        codigopostal.put(1172,"CABA - Almagro");
        codigopostal.put(1023,"CABA - Balvanera");
        codigopostal.put(1269,"CABA - Barracas");
        codigopostal.put(1428,"CABA - Belgrano");
        codigopostal.put(1226,"CABA - Boedo");
        codigopostal.put(1414,"CABA - Caballito");
        codigopostal.put(1427,"CABA - Chacarita");
        codigopostal.put(1426,"CABA - Colegiales");
        codigopostal.put(1105,"CABA - Comunicaciones");
        codigopostal.put(1068,"CABA - Constitucion");
        codigopostal.put(1406,"CABA - Flores");
        codigopostal.put(1159,"CABA - La Boca");
        codigopostal.put(1408,"CABA - Liniers");
        codigopostal.put(1440,"CABA - Mataderos");
        codigopostal.put(1002,"CABA - Monserrat");
        codigopostal.put(1437,"CABA - Nueva Pompeya");
        codigopostal.put(1429,"CABA - Nuñez");
        codigopostal.put(1425,"CABA - Palermo");
        codigopostal.put(1424,"CABA - Parque Chacabuco");
        codigopostal.put(1255,"CABA - Parque Patricios");
        codigopostal.put(1014,"CABA - Recoleta");
        codigopostal.put(1001,"CABA - Retiro");
        codigopostal.put(1419,"CABA - Saavedra");
        codigopostal.put(1219,"CABA - San Cristobal");
        codigopostal.put(1003,"CABA - San Nicolas");
        codigopostal.put(1063,"CABA - San Telmo");
        codigopostal.put(1407,"CABA - Velez Sarfield");
        codigopostal.put(1405,"CABA - Villa Crespo");
        codigopostal.put(1417,"CABA - Villa Devoto");
        codigopostal.put(1416,"CABA - Villa Gral. Mitre");
        codigopostal.put(1439,"CABA - Villa Lugano");
        codigopostal.put(1430,"CABA - Villa Ortuzar");
        codigopostal.put(1431,"CABA - Villa Urquiza");
        codigopostal.put(1104,"CABA - Zona Puerto");
}

}
