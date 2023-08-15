/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import modelo.Equipo;

/**
 *
 * @author santi
 */
public class Entrenador extends Persona{
    
    private Equipo equipo;
    
    public Entrenador(String cedula, String nombres, String apellidos, int edad, String nacionalidad) {
        super(cedula, nombres, apellidos, edad, nacionalidad);
    }

    /**
     * @return the equipo
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
