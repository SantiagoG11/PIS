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
    private List<E_Equipo> listaEquipos;
    private String[] columnas = {"Equipo", "Victorias", "Derrotas", "Empates"};

    public E_EquipoAbstractTableModel(List<E_Equipo> listaEquipos){
        this.listaEquipos = listaEquipos; // Corrección: cambia "this.lista = lista;" a "this.lista = listaEquipos;"
        this.titleColumns = new String[]{"Equipo", "Victorias", "Derrotas", "Empates"};
    }

    public void actualizar(List<E_Equipo> lista) {
        this.listaEquipos = listaEquipos;
        fireTableDataChanged();
    }

    public List<E_Equipo> getLista() {
        return listaEquipos;
    }

    public void setLista(List<E_Equipo> lista) {
        this.listaEquipos = lista;
    }

    public String[] getTitleColumns() {
        return titleColumns;
    }

    public void setTitleColumns(String[] titleColumns) {
        this.titleColumns = titleColumns;
    }

    @Override
    public int getRowCount() {
        return listaEquipos.size();
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

    public E_Equipo getEquipo(int fila){ // Corrección: cambia "getJugador" a "getEquipo"
        return listaEquipos.get(fila);
    }
}
