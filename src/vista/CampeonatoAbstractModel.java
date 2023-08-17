/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Campeonato;

/**
 * AbstractTableModel para la tabla de campeonatos.
 * Similar a ArbitroAbstractTableModel.
 */
public class CampeonatoAbstractModel extends AbstractTableModel {
    private List<Campeonato> lista;
    private String[] titleColumns;

    public CampeonatoAbstractModel(List<Campeonato> lista) {
        super();
        this.lista = lista;
        this.titleColumns = new String[]{"Nombre"};
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Campeonato campeonato = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return campeonato.getNombre();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return titleColumns[column];
    }

    public void actualizar(List<Campeonato> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }

    /**
     * @return the lista
     */
    public List<Campeonato> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Campeonato> lista) {
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

    public Campeonato getCampeonato(int fila) {
        return lista.get(fila);
    }
}
