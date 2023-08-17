/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author santi
 */
public class Jugador extends Persona{
    private String dorsal;
    private String posicion;

        public Jugador(String nombres, String apellidos, String cedula, String nacionalidad, int edad, String dorsal, String posicion) {
        super(nombres, apellidos,cedula, nacionalidad, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    
    /**
     * @return the dorsal
     */
    public String getDorsal() {
        return dorsal;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * @return the posicion
     */
    public String getPosicion() {
        return posicion;
    }

    /**
     * @param posicion the posicion to set
     */
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
