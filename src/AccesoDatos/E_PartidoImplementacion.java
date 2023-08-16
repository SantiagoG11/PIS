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
import modelo.Partido;

/**
 *
 * @author santi
 */
public class E_PartidoImplementacion implements DAO{
    Conexion instanciaMsql = Conexion.getInstance();
    
    
    public boolean guardar(E_PartidoImplementacion epartido, Partido partido) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO e_partido (goles_locales, equipo_local, equipo_visitante, albitro_principal, albitro_linea1, albitro_linea2, nombre_equipo_local, ) VALUES (?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, String.valueOf(t.getEstadio()));  
            consulta.setString(0, t.getEquipoLocal().getNombre());
            consulta.setString(0, t.getEquipoVisitante().getNombre());
            consulta.setString(0, t.getArbitroPrincipal().getApellidos());
            consulta.setString(0, t.getArbitroLinea1().getApellidos());
            consulta.setString(6, partido.getEquipoLocal().getNombre());
            consulta.setString(7, partido.getEquipoVisitante().getNombre());
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
                //Partido partido = new Partido(EnumEstadio.valueOf(rs.getNString(1)), EnumEstadoPartidos.FINALIZADO, new Equipo(rs.getNString(3), null, null), new Equipo(rs.getNString(4), null, null), new Equipo(rs.getNString(5), null, null), new Albitro(null, null, rs.getNString(6), 0, null), new Albitro(null, null, rs.getNString(6), 0, null), new Albitro(null, null, rs.getNString(6), 0, null), rs.getNString(9));
                //lista.add(partido); 
            }
            
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public List<Partido> buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean guardar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
