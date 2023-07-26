/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author ixcd2
 */
public class Clasificacion {
    private List<Clasificacion> listaClasificacion;
    private List<Equipo> listaEquipo;

    /**
     * @return the listaClasificacion
     */
    public List<Clasificacion> getListaClasificacion() {
        return listaClasificacion;
    }

    /**
     * @param listaClasificacion the listaClasificacion to set
     */
    public void setListaClasificacion(List<Clasificacion> listaClasificacion) {
        this.listaClasificacion = listaClasificacion;
    }

    /**
     * @return the listaEquipo
     */
    public List<Equipo> getListaEquipo() {
        return listaEquipo;
    }

    /**
     * @param listaEquipo the listaEquipo to set
     */
    public void setListaEquipo(List<Equipo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }
    
    
}
