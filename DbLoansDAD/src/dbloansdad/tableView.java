package dbloansdad;

//@author Pleymo

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

public class tableView extends AbstractTableModel{
   
    private ResultSet result;
    private ResultSetMetaData metaData; 
    private int numColumns;
    private int numRows;
    
    public tableView (ResultSet res) {
        result = res;
        try {
            metaData = result.getMetaData();
            result.last();
            numRows = result.getRow();
            numColumns = metaData.getColumnCount();  
        } catch ( SQLException exc) { }
    }

    @Override
    public Object getValueAt (int rowIndex, int columnIndex) {
        try {
            result.absolute((rowIndex+1));
            Object obj = result.getObject((columnIndex+1));
            return obj;
        }catch (SQLException exc) {
            return exc.toString();
        }   
    } 
    
    @Override
    public int getRowCount(){
        return numRows;   
    }

    @Override
    public int getColumnCount(){
        return numColumns;
    } 
}

