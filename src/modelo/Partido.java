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

    public Partido(EnumEstadoPartidos estado, Equipo equipoLocal, Equipo equipoVisitante, Arbitro arbitroPrincipal, Arbitro arbitroLinea1, Arbitro arbitroLinea2) {
        this.estado = estado;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.arbitroPrincipal = arbitroPrincipal;
        this.arbitroLinea1 = arbitroLinea1;
        this.arbitroLinea2 = arbitroLinea2;
    }
    
    /**
     * @return the estadistica
     */
}
