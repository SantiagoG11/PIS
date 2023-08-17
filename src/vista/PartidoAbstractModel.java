/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Partido;

/**
 * AbstractTableModel para la tabla de partidos.
 */
public class PartidoAbstractModel extends AbstractTableModel {
    private List<Partido> listaPartidos;
    private String[] titleColumns;

    public PartidoAbstractModel(List<Partido> listaPartidos) {
        super();
        this.listaPartidos = listaPartidos;
        this.titleColumns = new String[]{"Fecha", "Estadio", "Estado"};
    }

    @Override
    public int getRowCount() {
        return listaPartidos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Partido partido = listaPartidos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return partido.getFecha();
            case 1:
                return partido.getEstadio();
            case 2:
                return partido.getEstado();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titleColumns[column];
    }

    public void actualizar(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
        fireTableDataChanged();
    }

    /**
     * @return the listaPartidos
     */
    public List<Partido> getListaPartidos() {
        return listaPartidos;
    }

    /**
     * @param listaPartidos the listaPartidos to set
     */
    public void setListaPartidos(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
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

    public Partido getPartido(int fila) {
        return listaPartidos.get(fila);
    }
}