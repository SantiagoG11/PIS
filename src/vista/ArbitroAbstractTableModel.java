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
    private String[] titleColumns;
    private List<Arbitro> lista;

    public ArbitroAbstractTableModel(List<Arbitro> lista){
        super();
        this.lista = lista;
        this.titleColumns = new String[]{"Apellido"};
    }
    
    @Override
    public int getRowCount() {
       return getLista().size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Arbitro arbitro = getLista().get(rowIndex);
        switch(columnIndex){
            case 0:
                return arbitro.getApellidos();    
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
}
