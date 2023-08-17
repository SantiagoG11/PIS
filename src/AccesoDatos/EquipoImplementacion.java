/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Campeonato;
import modelo.Entrenador;
import modelo.Equipo;

/**
 *
 * @author ixcd2
 */
public class EquipoImplementacion implements DAOEquipo{

    Conexion instanciaMsql = Conexion.getInstance();
    
    @Override
    public boolean guardar(Equipo t) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO equipo (nombre, ciudad, entrenador_nombre, nombre_campeonato1, nombre_campeonato2) VALUES (?, ?, ?, ?, ?)");
            consulta.setString(1, t.getNombre());
            consulta.setString(2, t.getCiudad());
            consulta.setString(3, t.getEntrenador().getNombres());
            consulta.setString(4, String.valueOf(t.getCampeonato1().getNombre()));
            consulta.setString(5, t.getCampeonato2().getNombre());
            
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return false;
    }

    @Override
    public boolean modificar(Equipo equipo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Equipo> listarTodos() {
        List<Equipo> lista = new ArrayList<>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("select *from equipo");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                //Equipo equipo = new Equipo(rs.getString(1), rs.getString(2), (Entrenador)rs.getObject(3),(Campeonato)rs.getObject(4), (Campeonato)rs.getObject(5));
                lista.add(null); 
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public List<Equipo> buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}    
