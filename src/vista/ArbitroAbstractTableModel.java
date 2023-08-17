/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Arbitro;

/**
 *
 * @author Santiagod
 */
public class ArbitroAbstractTableModel extends AbstractTableModel {
    public ArbitroAbstractTableModel(List<Arbitro> lista){
        super();
        this.lista = lista;
        this.titleColumns = new String[]{"Apellidos", "Nacionalidad"};
    }
    
    private List<Arbitro> lista;
    private String[] titleColumns;
    
     public void actualizar(List<Arbitro> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
    
    /**
     * @return the lista
     */
    public List<Arbitro> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Arbitro> lista) {
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
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Arbitro arbitro = getLista().get(rowIndex);
        switch(columnIndex){
            case 0:
                return arbitro.getApellidos();
            case 1:
                return arbitro.getNacionalidad();
        }
        return null;
    }
    @Override
    public String getColumnName(int columns){
        return getTitleColumns()[columns];
    }
    
    public Arbitro getArbitro(int fila){
        return lista.get(fila);
    }
}
