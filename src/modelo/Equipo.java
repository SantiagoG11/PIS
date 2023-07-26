/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Modelo.Entrenador;
import Modelo.Jugador;
import java.util.List;

/**
 *
 * @author ixcd2
 */
public class Equipo {

    private Entrenador entrenador;
    private List<Jugador> listaJugadores;

    public Equipo(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
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
