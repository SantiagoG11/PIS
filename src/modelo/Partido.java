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
    private Arbitro arbitroPrincipal;
    private Arbitro arbitroLinea1;
    private Arbitro arbitroLinea2;
    private String fecha;
    private E_Partido e_partido;
    

    public Partido(EnumEstadio estadio, String fecha) {
        this.estadio = estadio;
        this.fecha = fecha;

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
    public Arbitro getArbitroPrincipal() {
        return arbitroPrincipal;
    }

    /**
     * @param arbitroPrincipal the arbitroPrincipal to set
     */
    public void setArbitroPrincipal(Arbitro arbitroPrincipal) {
        this.arbitroPrincipal = arbitroPrincipal;
    }

    /**
     * @return the arbitroLinea1
     */
    public Arbitro getArbitroLinea1() {
        return arbitroLinea1;
    }

    /**
     * @param arbitroLinea1 the arbitroLinea1 to set
     */
    public void setArbitroLinea1(Arbitro arbitroLinea1) {
        this.arbitroLinea1 = arbitroLinea1;
    }

    /**
     * @return the arbitroLinea2
     */
    public Arbitro getArbitroLinea2() {
        return arbitroLinea2;
    }

    /**
     * @param arbitroLinea2 the arbitroLinea2 to set
     */
    public void setArbitroLinea2(Arbitro arbitroLinea2) {
        this.arbitroLinea2 = arbitroLinea2;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the e_partido
     */
    public E_Partido getE_partido() {
        return e_partido;
    }

    /**
     * @param e_partido the e_partido to set
     */
    public void setE_partido(E_Partido e_partido) {
        this.e_partido = e_partido;
    }

    
}
