/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Modelo.Persona;

/**
 *
 * @author santi
 */
public class Usuario extends Persona{
    private String correo;
    private String password;

    public Usuario(String correo, String password, String cedula, String nombres, String apellidos, int edad, String nacionalidad) {
        super(cedula, nombres, apellidos, edad, nacionalidad);
        this.correo = correo;
        this.password = password;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
