/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.E_Equipo;
import modelo.Equipo;

/**
 *
 * @author Santiagod
 */
public class E_EquipoAbstractTableModel extends AbstractTableModel {
    private String[] titleColumns;
    private List<E_Equipo> lista;
    private String[] columnas = {"Equipo", "Victorias", "Derrotas", "Empates"};

public E_EquipoAbstractTableModel(List<E_Equipo> listaEquipos){
        this.lista = lista;
            this.titleColumns = new String[]{"Equipo", "Victorias", "Derrotas", "Empates"};
    }
    public void actualizar(List<E_Equipo> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
    
    /**
     * @return the lista
     */
    public List<E_Equipo> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<E_Equipo> lista) {
        this.lista = lista;
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
    
    @Override
    public int getRowCount() {
        return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        E_Equipo eequipo = getLista().get(rowIndex);
        switch(columnIndex){
            case 0:
                return eequipo.getEquipo().getNombre();
            case 1:
                return eequipo.getPartidosGanados();
            case 2:
                return eequipo.getPartidosPerdidos();
            case 3:
                return eequipo.getPartidosEmpatados();   
        }
        return null;
    }
    @Override
    public String getColumnName(int columns){
        return getTitleColumns()[columns];
    }
    
    public E_Equipo getJugador(int fila){
        return lista.get(fila);
    }
}
