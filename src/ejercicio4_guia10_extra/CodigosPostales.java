
package ejercicio4_guia10_extra;

    

public class CodigosPostales {
    private int codigoP;
    private String ciudad;

    public CodigosPostales() {
    }

    public CodigosPostales(int codigoP, String ciudad) {
        this.codigoP = codigoP;
        this.ciudad = ciudad;
    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"+"\nCodigo Postal => " + codigoP + "\n Ciudad => " + ciudad +"\n-----------------------------------\n";
    }
    
}
