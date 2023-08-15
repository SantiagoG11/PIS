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
public class Equipo {
    private String nombre;
    private String ciudad;
    private Entrenador entrenador;
    private List<Jugador> listaJugadores;
    private Campeonato campeonato1;
    private Campeonato campeonato2;

    public Equipo(String nombre, String ciudad, Entrenador entrenador, Campeonato campeonato1, Campeonato campeonato2) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.entrenador = entrenador;
        listaJugadores = new ArrayList<>();
        this.campeonato1 = campeonato1;
        this.campeonato2 = campeonato2;
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
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the entrenador
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the listaJugadores
     */
    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    /**
     * @param listaJugadores the listaJugadores to set
     */
    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    /**
     * @return the campeonato1
     */
    public Campeonato getCampeonato1() {
        return campeonato1;
    }

    /**
     * @param campeonato1 the campeonato1 to set
     */
    public void setCampeonato1(Campeonato campeonato1) {
        this.campeonato1 = campeonato1;
    }

    /**
     * @return the campeonato2
     */
    public Campeonato getCampeonato2() {
        return campeonato2;
    }

    /**
     * @param campeonato2 the campeonato2 to set
     */
    public void setCampeonato2(Campeonato campeonato2) {
        this.campeonato2 = campeonato2;
    }


}
