/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Equipo;
import modelo.Jugador;

/**
 *
 * @author Usuario iTC
 */
public class EquipoAbstractModel extends AbstractTableModel{
    private String[] titleColumns;
    private List<Equipo> listaEquipos;

public EquipoAbstractModel(List<Equipo> listaEquipos){
        super();
        this.listaEquipos = listaEquipos;
        this.titleColumns = new String[]{"Nombres", "Apellidos", "Cedula", "Nacionalidad", "Edad", "Dorsal", "Posicion"};
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
