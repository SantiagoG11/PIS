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
    
    private String estadio;
    private String estado;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private Arbitro arbitroPrincipal;
    private Arbitro arbitroLinea1;
    private Arbitro arbitroLinea2;
    private String fecha;
    private E_Partido e_partido;
    private Campeonato campeonato;

    public Partido(String estadio, Equipo equipoLocal, Equipo equipoVisitante, Arbitro arbitroPrincipal, Arbitro arbitroLinea1, Arbitro arbitroLinea2, String estado, String fecha, Campeonato campeonato) {
        this.estadio = estadio;
        this.estado = estado;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.arbitroPrincipal = arbitroPrincipal;
        this.arbitroLinea1 = arbitroLinea1;
        this.arbitroLinea2 = arbitroLinea2;
        this.fecha = fecha;
        this.campeonato = campeonato;
    }
    
    /**
     * @return the estadio
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
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
