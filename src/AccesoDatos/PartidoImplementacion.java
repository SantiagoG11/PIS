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
import modelo.Arbitro;
import modelo.EnumEstadio;
import modelo.EnumEstadoPartidos;
import modelo.Equipo;
import modelo.Partido;


/**
 *
 * @author ixcd2
 */
public class PartidoImplementacion implements DAOPartido{

    Conexion instanciaMsql = Conexion.getInstance();
    
    @Override
    public boolean guardar(Partido t) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO partido (estadio, equipo_local, equipo_visitante, arbitro_principal, arbitro_linea1, arbitro_linea2, estado , fecha) VALUES (?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(0, String.valueOf(t.getEstadio()));  
            consulta.setString(1, t.getEquipoLocal().getNombre());
            consulta.setString(2, t.getEquipoVisitante().getNombre());
            consulta.setString(3, t.getArbitroPrincipal().getApellidos());
            consulta.setString(4, t.getArbitroLinea1().getApellidos());
            consulta.setString(5, t.getArbitroLinea2().getApellidos());
            consulta.setString(6, String.valueOf(t.getEstado()));
            consulta.setString(7, t.getFecha());
            consulta.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return false;
    }

    @Override
    public boolean eliminar(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Partido t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Partido> listarTodos() {
        List<Partido> lista = new ArrayList<>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("select *from partido");
            ResultSet rs = consulta.executeQuery();
            while (rs.next()) {
                Partido partido = new Partido(
        EnumEstadio.valueOf(rs.getString(1)),
        EnumEstadoPartidos.valueOf(rs.getString(8)), // Cambiar por la columna correcta
            new Equipo(rs.getString(2), null, null),
            new Equipo(rs.getString(3), null, null),
            new Arbitro(null, rs.getString(4), null, null, 0), // Cambiar por la columna correcta
            new Arbitro(null, rs.getString(5), null, null, 0),
            new Arbitro(null, rs.getString(6), null, null, 0),
       rs.getString(9)
            );
            lista.add(partido); 
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public List<Partido> buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
