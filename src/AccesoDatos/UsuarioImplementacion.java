        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author ixcd2
 */
public class UsuarioImplementacion implements DAOUsuario{
    
    Conexion instanciaMsql = Conexion.getInstance();

    @Override
    public boolean guardar(Usuario t) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO usuario (nombres, apellidos, cedula, nacionalidad, edad, correo, password) VALUES (?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, t.getNombres());
            consulta.setString(2, t.getApellidos());
            consulta.setString(3, t.getCedula());
            consulta.setString(4, t.getNacionalidad());
            consulta.setInt(5, t.getEdad());
            consulta.setString(6, t.getCorreo());
            consulta.setString(7, t.getPassword());
            consulta.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("uimplement"+e.getMessage());
        }
        
        return false;
    }

    @Override
    public boolean eliminar(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Usuario t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> listarTodos() {
        List<Usuario> lista = new ArrayList<>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("select *from entrenador");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario(rs.getNString(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getNString(5), Integer.parseInt(rs.getString(6)), rs.getNString(7));
                lista.add(usuario); 
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public List<Usuario> buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
