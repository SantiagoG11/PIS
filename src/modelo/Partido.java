    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ixcd2
 */
public class Partido {
    
    private EnumEstadio estadio;
    private EnumEstadoPartidos estado;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Albitro arbitroPrincipal;
    private Albitro arbitroLinea1;
    private Albitro arbitroLinea2;
    private String nombre;
    private Campeonato campeonato;

    public Partido(EnumEstadio estadio, EnumEstadoPartidos estado, Equipo equipoLocal, Equipo equipoVisitante, Albitro arbitroPrincipal, Albitro arbitroLinea1, Albitro arbitroLinea2, String nombre, Campeonato campeonato) {
        this.estadio = estadio;
        this.estado = estado;   
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.arbitroPrincipal = arbitroPrincipal;
        this.arbitroLinea1 = arbitroLinea1;
        this.arbitroLinea2 = arbitroLinea2;
        this.nombre = nombre;
        this.campeonato = campeonato;
    }

    

    /**
     * @return the estadio
     */
    public EnumEstadio getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(EnumEstadio estadio) {
        this.estadio = estadio;
    }

    /**
     * @return the estado
     */
    public EnumEstadoPartidos getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EnumEstadoPartidos estado) {
        this.estado = estado;
    }

    /**
     * @return the equipoLocal
     */
    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    /**
     * @param equipoLocal the equipoLocal to set
     */
    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    /**
     * @return the equipoVisitante
     */
    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    /**
     * @param equipoVisitante the equipoVisitante to set
     */
    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    /**
     * @return the arbitroPrincipal
     */
    public Albitro getArbitroPrincipal() {
        return arbitroPrincipal;
    }

    /**
     * @param arbitroPrincipal the arbitroPrincipal to set
     */
    public void setArbitroPrincipal(Albitro arbitroPrincipal) {
        this.arbitroPrincipal = arbitroPrincipal;
    }

    /**
     * @return the arbitroLinea1
     */
    public Albitro getArbitroLinea1() {
        return arbitroLinea1;
    }

    /**
     * @param arbitroLinea1 the arbitroLinea1 to set
     */
    public void setArbitroLinea1(Albitro arbitroLinea1) {
        this.arbitroLinea1 = arbitroLinea1;
    }

    /**
     * @return the arbitroLinea2
     */
    public Albitro getArbitroLinea2() {
        return arbitroLinea2;
    }

    /**
     * @param arbitroLinea2 the arbitroLinea2 to set
     */
    public void setArbitroLinea2(Albitro arbitroLinea2) {
        this.arbitroLinea2 = arbitroLinea2;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the campeonato
     */
    public Campeonato getCampeonato() {
        return campeonato;
    }

    /**
     * @param campeonato the campeonato to set
     */
    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
    
    
}
