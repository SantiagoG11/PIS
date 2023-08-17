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
            consulta = conexion.prepareStatement("INSERT INTO entrenador (nombres, apellidos, cedula, nacionalidad, edad) VALUES (?, ?, ?, ?, ?)");
            consulta.setString(1, t.getNombres());
            consulta.setString(2, t.getApellidos());
            consulta.setString(3, t.getCedula());
            consulta.setString(4, t.getNacionalidad());
            consulta.setInt(5, t.getEdad());
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
                Entrenador entrenador = new Entrenador(rs.getString(1), rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4)), rs.getString(5));
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
