package dbloansdad;

//@author Pleymo

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connectionClass {
    
    private Connection connect = null;
    private ResultSet result = null;

    public connectionClass() {
        openConnection();
    }
    
    private void openConnection() {
        try {
            String sUrl = "jdbc:mysql://localhost:3306/biblioteca";
            connect = DriverManager.getConnection(sUrl, "root", "");
            JOptionPane.showMessageDialog(null, "Conectado!!!!");
        }catch(SQLException ex) {
            connect = null;
        throw new RuntimeException("Error con la conexión!!!");
        }
    }
    
    public void execQuerry(String sql) throws SQLException {
        Statement stmt = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        result = stmt.executeQuery(sql);
    }

    public int ExecSqlUpdate(String sql) throws SQLException {
        int i=0;
        Statement stmt = connect.createStatement();
        i = stmt.executeUpdate(sql);
        return i;
    }

    public Connection getConnect() {
        return connect;
    }

    public ResultSet getResult() {
        return result;
    }
    
}
