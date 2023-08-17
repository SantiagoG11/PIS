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
import modelo.Campeonato;

/**
 *
 * @author Santiagod
 */
public class CampeonatoImplementacion implements DAO{

    Conexion instanciaMsql = Conexion.getInstance();

    public boolean guardar(Campeonato campeonato) {
        PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMsql.conectar();
            consulta = conexion.prepareStatement("INSERT INTO campeonato (nombre) VALUES (?)");
            consulta.setString(1, campeonato.getNombre());
            
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
    public boolean modificar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listarTodos() {
        List<Campeonato> lista = new ArrayList<Campeonato>();
        PreparedStatement consulta = null;
        Connection conexion = null;
        try {
           conexion = instanciaMsql.conectar();
           consulta = conexion.prepareStatement("select * from campeonato");
           ResultSet rs = consulta.executeQuery();
           while(rs.next()){
               Campeonato campeonato = new Campeonato();
               campeonato.setNombre(rs.getString(1));
               lista.add(campeonato);
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
    public boolean guardar(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
