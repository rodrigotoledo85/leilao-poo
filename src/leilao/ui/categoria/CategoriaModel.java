/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.ui.categoria;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import leilao.modelo.Categoria;

/**
 *
 * @author tarle
 */
public class CategoriaModel extends AbstractTableModel {

    private List<Categoria> listaCategorias;
    
    public CategoriaModel() {
        this(new ArrayList<>());
    }
    
    public CategoriaModel(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }
    
    @Override
    public int getRowCount() {
        return listaCategorias.size();
    }

    @Override
    public int getColumnCount() {
        return NUMERO_DE_COLUNAS;
    }
    
    private static final int NUMERO_DE_COLUNAS = 3;

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Categoria c = listaCategorias.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return c.getId();                
            case 1: return c.getNome();                
            case 2: return c.getPai() != null ? c.getPai().getNome() : "N/A";                
            default: return "Me quebrou!";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "Categoria Pai";
            default: return "Me quebrou!";
        }
    }
    
    public Categoria getCategoria(int row) {
        return listaCategorias.get(row);
    }
}
