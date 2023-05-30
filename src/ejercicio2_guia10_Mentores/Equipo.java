package ejercicio2_guia10_Mentores;


public class Equipo {
    private String nombreEquipo;
    private String ciudad;
    private Integer cantidadPartidos;
    private Integer ganados;
    private Integer perdidos;
    private Integer empatados;
    private Integer puntosTotales;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String ciudad, Integer cantidadPartidos, Integer ganados, Integer perdidos, Integer empatados, Integer puntosTotales) {
        this.nombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.cantidadPartidos = cantidadPartidos;
        this.ganados = ganados;
        this.perdidos = perdidos;
        this.empatados = empatados;
        this.puntosTotales = puntosTotales;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCantidadPartidos() {
        return cantidadPartidos;
    }

    public void setCantidadPartidos(Integer cantidadPartidos) {
        this.cantidadPartidos = cantidadPartidos;
    }

    public Integer getGanados() {
        return ganados;
    }

    public void setGanados(Integer ganados) {
        this.ganados = ganados;
    }

    public Integer getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(Integer perdidos) {
        this.perdidos = perdidos;
    }

    public Integer getEmpatados() {
        return empatados;
    }

    public void setEmpatados(Integer empatados) {
        this.empatados = empatados;
    }

    public Integer getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(Integer puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    @Override
    public String toString() {
        return  nombreEquipo + ciudad + cantidadPartidos + ganados +  perdidos +  empatados + puntosTotales ;
    }
     
}

    