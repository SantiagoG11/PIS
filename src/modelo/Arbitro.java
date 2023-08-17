/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.Persona;

/**
 *
 * @author santi
 */
public class Arbitro extends Persona{
    
    public Arbitro(String cedula, String nombres, String apellidos, int edad, String nacionalidad) {
        super(nombres, apellidos, cedula, nacionalidad, edad);
    }   
}
