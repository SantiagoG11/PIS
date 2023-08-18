/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AccesoDatos;

import java.util.List;
import modelo.Partido;

/**
 *
 * @author santi
 */
public interface DAOE_EQUIPO <T>{
    public boolean guardar(T t, Partido partido);
    public boolean eliminar(String cedula);
    public boolean modificar(T t);
    public List<T> listarTodos();
    public List<T> buscar(String apellido);
}
