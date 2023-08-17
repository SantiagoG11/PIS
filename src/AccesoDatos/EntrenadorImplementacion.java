/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import modelo.Entrenador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Equipo;

/**
 *
 * @author ixcd2
 */
public class EntrenadorImplementacion implements DAOentrenador{

    Conexion instanciaMsql = Conexion.getInstance();
    
    @Override
    public boolean guardar(Entrenador t) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO entrenador (cedula, nombres, apellidos, edad, nacionalidad) VALUES (?, ?, ?, ?, ?)");
            consulta.setString(1, t.getCedula());
            consulta.setString(2, t.getNombres());
            consulta.setString(3, t.getApellidos());
            consulta.setInt(4, t.getEdad());
            consulta.setString(5, t.getNacionalidad());
            
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return false;
    }

    @Override
    public boolean modificar(Entrenador entrenador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Entrenador> listarTodos() {
        List<Entrenador> lista = new ArrayList<>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("select *from entrenador");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                Entrenador entrenador = new Entrenador((Equipo)rs.getObject(1), rs.getString(2), rs.getString(3), rs.getString(4), Integer.parseInt(rs.getString(5)), rs.getString(6));
                lista.add(entrenador); 
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public List<Entrenador> buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
