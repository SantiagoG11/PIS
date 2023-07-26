/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Modelo.Entrenador;
import Modelo.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ixcd2
 */
public class Equipo {
    private String nombre;
    private String ciudad;
    private Campeonato campeonato;
    private Entrenador entrenador;
    private List<Jugador> listaJugadores;
    private List<Campeonato> listaCompeonato;

    public Equipo(String nombre, String ciudad, Campeonato campeonato, Entrenador entrenador) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.campeonato = campeonato;
        this.entrenador = entrenador;
        listaJugadores = new ArrayList<>();
        listaCompeonato = new ArrayList<>();
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
    
}
