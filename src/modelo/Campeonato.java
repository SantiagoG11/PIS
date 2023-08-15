/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ixcd2
 */
public class Campeonato {
    private String nombre;
    private List<Partido> listaPartidos; //muchos
    private List<Equipo> listaEquipos;  //muchos

    public Campeonato() {
        listaPartidos = new ArrayList<>();
        listaEquipos = new ArrayList<>();
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
     * @return the listaPartidos
     */
    public List<Partido> getListaPartidos() {
        return listaPartidos;
    }

    /**
     * @param listaPartidos the listaPartidos to set
     */
    public void setListaPartidos(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    /**
     * @return the listaEquipos
     */
    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    /**
     * @param listaEquipos the listaEquipos to set
     */
    public void setListaEquipos(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }
    
}
