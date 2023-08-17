/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Entrenador;
import modelo.Jugador;

/**
 *
 * @author Usuario iTC
 */
public class EntrenadorAbstractModel extends AbstractTableModel {
    private String[] titleColumns;
    private List<Entrenador> lista;

    public EntrenadorAbstractModel(List<Entrenador> lista){
        super();
        this.lista = lista;
        this.titleColumns = new String[]{"Cedula", "Nombres", "Apellidos", "Cedula", "Nacionalidad"};
    }
    
    public void actualizar(List<Entrenador> lista) {
        this.lista= lista;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Entrenador entrenador = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return entrenador.getNombres();
            case 1:
                return entrenador.getApellidos();
            case 2:
                return entrenador.getCedula();
            case 3:
                return entrenador.getNacionalidad();
        }
        return null;
    }

        @Override
    public String getColumnName(int column) {
        return titleColumns[column];
    }


    /**
     * @return the lista
     */
    public List<Entrenador> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Entrenador> lista) {
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
    public Entrenador getEntrenador(int fila) {
        return lista.get(fila);
    }
    
}
