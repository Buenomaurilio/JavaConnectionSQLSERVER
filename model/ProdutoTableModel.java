package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;



public class ProdutoTableModel extends AbstractTableModel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private final List<Produto> dados = new ArrayList<>();
    private final String[] colunas = { "Nome", "Preço", "qtd" };

    @Override
    public String getColumnName(final int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(final int linha, final int coluna) {
        
        switch(coluna){
            case 0:
               return dados.get(linha).getNome();
            case 1:
                return dados.get(linha).getPreco();
            case 2:
                return dados.get(linha).getQtd();
                
        }
       return null;  
    }  
    
}
