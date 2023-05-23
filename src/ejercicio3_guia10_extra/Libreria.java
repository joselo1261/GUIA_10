package ejercicio3_guia10_extra;


public class Libreria {
    private String titulo;
    private String autor;
    private int numero_ejempl;
    private int numero_ejempl_prestados;

    public Libreria() {
    }

    public Libreria(String titulo, String autor, int numero_ejempl, int numero_ejempl_prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_ejempl = numero_ejempl;
        this.numero_ejempl_prestados = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumero_ejempl() {
        return numero_ejempl;
    }

    public void setNumero_ejempl(int numero_ejempl) {
        this.numero_ejempl = numero_ejempl;
    }

    public int getNumero_ejempl_prestados() {
        return numero_ejempl_prestados;
    }

    public void setNumero_ejempl_prestados(int numero_ejempl_prestados) {
        this.numero_ejempl_prestados = numero_ejempl_prestados;
    }

    @Override
    public String toString() {
        return "\n-----------------------------------"+"\nTitulo => " + titulo + "\nAutor => " + autor +"\nCant. Ejemplares => "+ numero_ejempl + "\nCant. Ejemplares Prestados => "+numero_ejempl_prestados +"\n-----------------------------------";
    }

    int setNumero_ejempl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
}
