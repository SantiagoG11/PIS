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

    private Estadistica estadistica;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        estadistica = new Estadistica();
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
    }
    
    /**
     * @return the estadistica
     */
    public Estadistica getEstadistica() {
        return estadistica;
    }

    /**
     * @param estadistica the estadistica to set
     */
    public void setEstadistica(Estadistica estadistica) {
        this.estadistica = estadistica;
    }

}
