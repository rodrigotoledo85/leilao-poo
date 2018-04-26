/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leilao.ui.usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import leilao.modelo.Usuario;


/**
 *
 * @author rodrigo
 */
public class UsuarioModel extends AbstractTableModel{
    
    private List<Usuario> listaUsuarios;
    
    public UsuarioModel() {
        this(new ArrayList<>());
    }
    
    public UsuarioModel(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    @Override
    public int getRowCount() {
        return listaUsuarios.size();
    }

    @Override
    public int getColumnCount() {
        return NUMERO_DE_COLUNAS;
    }
    
    private static final int NUMERO_DE_COLUNAS = 10;

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Usuario u = listaUsuarios.get(rowIndex);

        //corrigir o preenchimento da tabela com usuarios
        switch(columnIndex) {
            case 0: return u.getId();                
            case 1: return u.getNome();
            case 2: return u.getEmail();
            case 3: return u.getSenha();
            case 4: return u.getClassificacao();
            case 5: return u.getCriadoEm().getTime();
            case 6: return u.getEndereco().getLogradouro();
            case 7: return u.getEndereco().getCidade();
            case 8: return u.getEndereco().getNumero();
            case 9: return u.getEndereco().getCep();
            default: return "Me quebrou!";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0: return "ID";
            case 1: return "Nome";
            case 2: return "E-mail";
            case 3: return "Senha";
            case 4: return "Classificacao";
            case 5: return "Data Criacao";
            case 6: return "Logradouro";
            case 7: return "Cidade";
            case 8: return "Numero";
            case 9: return "CEP";
            default: return "Me quebrou!";
        }
    }
    
    public Usuario getUsuario(int row) {
        return listaUsuarios.get(row);
    }
}
