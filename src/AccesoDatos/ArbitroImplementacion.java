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

/**
 *
 * @author Usuario iTC
 */
public class ArbitroImplementacion implements DAO<Arbitro>{

    Conexion instanciaMsql = Conexion.getInstance();
    
    @Override
    public boolean guardar(Arbitro arbitro) {
        PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO arbitro (nombres, apellidos, cedula, nacionalidad, edad) VALUES (?, ?, ?, ?, ?)");
            consulta.setString(1, arbitro.getNombres());
            consulta.setString(2, arbitro.getApellidos());
            consulta.setString(3, arbitro.getCedula());
            consulta.setString(4, arbitro.getNacionalidad());
            consulta.setInt(5, arbitro.getEdad());
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
    public List<Arbitro> listarTodos() {
        List<Arbitro> lista = new ArrayList<>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("select *from arbitro");
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
    public List buscar(String apellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Arbitro t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
