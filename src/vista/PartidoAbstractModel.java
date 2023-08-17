/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Equipo;
import modelo.Partido;

/**
 *
 * @author Usuario iTC
 */
public class PartidoAbstractModel extends AbstractTableModel{
    private String[] titleColumns;
    private List<Partido> listaPartidos;

public PartidoAbstractModel(List<Partido> listaPartidos){
        super();
        this.listaPartidos = listaPartidos;
        this.titleColumns = new String[]{"Fecha", "Estadio", "Estado"};
    }
    
 public void actualizar(List<Partido> listaPartidos) {
     this.setListaPartidos(listaPartidos);
        fireTableDataChanged();
    }   
    
   @Override
    public int getRowCount() {
        return getListaPartidos().size();

    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Partido partido = getListaPartidos().get(rowIndex);
        switch(columnIndex){
            case 0:
                return partido.getFecha();
            case 1:
                return partido.getEstadio();
            case 2:
                return partido.getEstado(); 
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
    
}
