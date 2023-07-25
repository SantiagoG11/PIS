/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AccesoDatos;


import java.util.List;



/**
 *
 * @author ixcd2
 */
public interface DAO <T>{
    public boolean guardar(T t);
    public boolean eliminar(String cedula);
    public boolean modificar(T t);
    public List<T> listarTodos();
    public List<T> buscar(String apellido);
}
