/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ixcd2
 */
public class Conexion {
     public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL= "jdbc:mysql://localhost:3306/pis";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "Isaac2004Cartuche";
    public static Conexion instancia;

    public Connection conectar() throws SQLException{
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
    public void desconectar (Connection conexion){
        try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
    }
    
    public void cerrarResultado(ResultSet resultado){
        try {
                resultado.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
    }
    
    public void cerrarStatment(PreparedStatement statement){
        try {
                statement.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
    }
    
    public static Conexion getInstance(){
        if(instancia == null)
            instancia = new Conexion();
        return instancia;
    }
}
