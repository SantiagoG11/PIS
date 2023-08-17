/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Equipo;

/**
 *
 * @author Usuario iTC
 */
public class EquipoAbstractTableModel extends AbstractTableModel{
    private String[] titleColumns;
    private List<Equipo> listaEquipos;

public EquipoAbstractTableModel(List<Equipo> listaEquipos){
        super();
        this.listaEquipos = listaEquipos;
        this.titleColumns = new String[]{"Nombre", "Ciudad", "Entrenador"};
    }
    
 public void actualizar(List<Equipo> listaEquipos) {
     this.setListaEquipos(listaEquipos);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return getListaEquipos().size();

    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Equipo equipo = getListaEquipos().get(rowIndex);
        switch(columnIndex){
            case 0:
                return equipo.getNombre();
            case 1:
                return equipo.getCiudad();
            case 2:
                return equipo.getEntrenador(); 
        }
        return null;
    }

    /**
     * @return the titleColumns
     */
    public String[] getTitleColumns() {
        return titleColumns;
    }

    /**
     * @param titleColumns the titleColumns to set
     */
    public void setTitleColumns(String[] titleColumns) {
        this.titleColumns = titleColumns;
    }

    /**
     * @return the listaEquipos
     */
    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    /**
     * @param listaEquipos the listaEquipos to set
     */
    public void setListaEquipos(List<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }
    
}
