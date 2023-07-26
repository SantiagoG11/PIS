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
    private List<Partido> listaPartidos; //muchos
    private List<Equipo> listaEquipos;  //muchos

    public Campeonato() {
        listaPartidos = new ArrayList<>();
        listaEquipos = new ArrayList<>();
    }
}
