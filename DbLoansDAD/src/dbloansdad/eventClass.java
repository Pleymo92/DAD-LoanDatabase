package dbloansdad;

//@author Pleymo

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class eventClass implements ActionListener, MouseListener, DocumentListener{
    
    private connectionClass clConnect;
    private manageLoans manage;
    private FrmView frm;

    public eventClass(){
        try {
            clConnect = new connectionClass();      
            manage = new manageLoans(clConnect);
            frm = new FrmView(this);
            frm.setVisible(true);
            refreshTable();
        } catch (SQLException exc) {
            Logger.getLogger(eventClass.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    public void refreshTable(){
        manage.fillTable("select * from prestamos");
        frm.getLoansTable().setModel(new tableView(manage.getRespondSQL()));
    }
    
    public void refreshTableQuerry(String querry) {
        manage.fillTableQuerry(querry);
        frm.getLoansTable().setModel(new tableView(manage.getRespondSQL()));
    }
    
    @Override
    public void actionPerformed(ActionEvent actEvent) {
        // Button NewBook
        if(actEvent.getSource() == frm.getBtnNewLoan()) {
            try {
                Loan loan = new Loan();
                loan.setCodeStudent(frm.getTxtFieldCodeStudent().getText());
                loan.setCodeBook(frm.getTxtFieldCodeBook().getText());
                loan.setDateLoan(frm.getTxtFieldDateLoan().getText());
                loan.setDateReturn(frm.getTxtFieldDateReturn().getText());
                loan.setStatus(frm.getTxtFieldStatus().getText());
                manage.newLoan(loan);
                refreshTable();                              
            } catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // Button DeleteBook
        if(actEvent.getSource() == frm.getBtnDeleteLoan()) {
            try {
                Loan loan = new Loan();
                loan.setId(frm.getTxtFieldId().getText());
                manage.deleteLoan(loan);
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // Button Modify
        if(actEvent.getSource() == frm.getBtnModify()) {
            try {
                Loan loan = new Loan();
                loan.setId(frm.getTxtFieldId().getText());
                loan.setCodeStudent(frm.getTxtFieldCodeStudent().getText());
                loan.setCodeBook(frm.getTxtFieldCodeBook().getText());
                loan.setDateLoan(frm.getTxtFieldDateLoan().getText());
                loan.setDateReturn(frm.getTxtFieldDateReturn().getText());
                loan.setStatus(frm.getTxtFieldStatus().getText());
                manage.Modify(loan);
                refreshTable();                
            } catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // Button Exit
        if(actEvent.getSource() == frm.getBtnExit()) {
            System.exit(DISPOSE_ON_CLOSE);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mosEvent) {
        try {
            String id="";
            int row=0;
            row=frm.getLoansTable().getSelectedRow();
            id=String.valueOf(frm.getLoansTable().getValueAt(row, 0));
            //
            Loan loan = manage.showLoan(id);
            frm.getTxtFieldId().setText(loan.getId());
            frm.getTxtFieldCodeStudent().setText(loan.getCodeStudent());
            frm.getTxtFieldCodeBook().setText(loan.getCodeBook());
            frm.getTxtFieldDateLoan().setText(loan.getDateLoan());
            frm.getTxtFieldDateReturn().setText(loan.getDateReturn());
            frm.getTxtFieldStatus().setText(loan.getStatus());
        } catch (SQLException ex) {
            Logger.getLogger(eventClass.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    @Override
    public void mousePressed(MouseEvent mosEvent) { }

    @Override
    public void mouseReleased(MouseEvent mosEvent) { }

    @Override
    public void mouseEntered(MouseEvent mosEvent) { }

    @Override
    public void mouseExited(MouseEvent mosEvent) { }
    
    //Doc Listener
    @Override
    public void insertUpdate(DocumentEvent docEvent) {
        String txtfield="";
        txtfield = frm.getTxtFieldSearcher().getText();
        if(txtfield.equals("")){
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent docEvent) {
        String txtfield="";
        txtfield = frm.getTxtFieldSearcher().getText();
        if(txtfield.equals("")) {
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent docEvent) {
        String txtfield="";
        txtfield = frm.getTxtFieldSearcher().getText();
        if(txtfield.equals("")) {
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }
}
