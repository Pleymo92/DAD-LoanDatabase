package dbloansdad;

//@author Pleymo

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class manageLoans {
    
    private connectionClass clConnect;
    private ResultSet result;
    
    public manageLoans (connectionClass connection) throws SQLException {
        clConnect = connection;
    }
    
    public void newLoan(Loan loan) throws SQLException{
        String querry = "INSERT INTO prestamos(codAlumno, codLibros, FechaPrestamo, FechaDevolucion, estado) VALUES ('"
                                                  +loan.getCodeStudent()
                                           +"', '"+loan.getCodeBook()
                                           +"', '"+loan.getDateLoan()
                                           +"', '"+loan.getDateReturn()
                                           +"', '"+loan.getStatus()+"');";
        if(clConnect.ExecSqlUpdate(querry) > 0) {
            JOptionPane.showMessageDialog(null, "Nuevo Prestamo añadido Correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }
  
    public void deleteLoan(Loan loan) throws SQLException{
        String querry = "delete from prestamos where id = " + loan.getId();
        if (clConnect.ExecSqlUpdate(querry) > 0) {
            JOptionPane.showMessageDialog(null, "Prestamo Eliminado Correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }
    
    public void Modify(Loan loan) throws SQLException {
        String querry = "update libros set codAlumno = '" + loan.getCodeStudent()
                                    + "', codLibros = '" + loan.getCodeBook()
                                    + "', FechaPrestamo = '" + loan.getDateLoan()
                                    + "', FechaDevolucion = '" + loan.getDateReturn()
                                    + "', estado = '" + loan.getStatus()
                                    + "' where id = " + loan.getId();
        if(clConnect.ExecSqlUpdate(querry) > 0) {
            JOptionPane.showMessageDialog(null, "Modificación Correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }
    
    public Loan showLoan(String id) throws SQLException{
        Loan loan = new Loan();
        String querry = "select * from prestamos where id = " + id;
        clConnect.execQuerry(querry);
        result = clConnect.getResult();
        result.next();
        //
        loan.setId(id);
        loan.setCodeStudent(result.getString("codAlumno"));
        loan.setCodeBook(result.getString("codLibros"));
        loan.setDateLoan(result.getString("FechaPrestamo"));
        loan.setDateReturn(result.getString("FechaDevolucion"));
        loan.setStatus(result.getString("estado"));
        return loan;
    }
    
    public void fillTable(String querry){
        try {
            clConnect.execQuerry(querry);
            result = clConnect.getResult();
        } catch (SQLException exc) {
            Logger.getLogger(manageLoans.class.getName()).log(Level.SEVERE, null, exc);
        }
    }
    
    public void fillTableQuerry(String querry){
        try {
                clConnect.execQuerry("SELECT * from prestamos where id like '%" + querry
                                                            +"%' or codAlumno like '%" + querry
                                                            +"%' or codLibros like '%" + querry
                                                            +"%' or FechaPrestamo like '%" + querry
                                                            +"%' or FechaDevolucion like '%" + querry
                                                            +"%' or estado like'%" + querry + "%'");
                result = clConnect.getResult();
            
        } catch (SQLException exc) {
            Logger.getLogger(manageLoans.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    public ResultSet getRespondSQL() {
        return result;
    }
    
}
