/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import modelo.Jugador;

/**
 *
 * @author santi
 */
public class JugadoresAbstractTableModel extends AbstractTableModel{
    private String[] titleColumns;
    private List<Jugador> lista;
    
    public JugadoresAbstractTableModel(List<Jugador> lista){
        super();
        this.lista = lista;
        this.titleColumns = new String[]{"Nombres", "Apellidos", "Cedula", "Nacionalidad", "Edad", "Dorsal", "Posicion"};
    }
    
     public void actualizar(List<Jugador> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }
    
    /**
     * @return the lista
     */
    public List<Jugador> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Jugador> lista) {
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
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Jugador jugador = getLista().get(rowIndex);
        switch(columnIndex){
            case 0:
                return jugador.getNombres();
            case 1:
                return jugador.getApellidos();
            case 2:
                return jugador.getCedula();
            
            case 3:
                return jugador.getNacionalidad();
            case 4:
                return jugador.getEdad();
            case 5:
                return jugador.getDorsal();
            case 6:
                return jugador.getPosicion();    
        }
        return null;
    }
    @Override
    public String getColumnName(int columns){
        return getTitleColumns()[columns];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 4: 
//                lista.get(rowIndex).getCantidad();
            return true;
        }
        return false;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 4:
                ItemProducto iProducto = getLista().get(rowIndex);
                if (Integer.parseInt(o.toString()) < iProducto.getProducto().getStock()) 
                    lista.get(rowIndex).setCantidad(Integer.parseInt(o.toString()));
                else
                    JOptionPane.showMessageDialog(null, "No hay suficiente Stock");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
    public ItemProducto getProducto(int fila){
        return lista.get(fila);
    }
}
