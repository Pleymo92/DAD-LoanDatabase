package dbloansdad;

//@author Pleymo

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmView extends javax.swing.JFrame {
        
    private eventClass events;
    private tableView table;

    public FrmView(eventClass event) {
        initComponents();
        events=event;
        // Buttons Events
        btnNewLoan.addActionListener(events);
        btnModify.addActionListener(events);
        btnDeleteLoan.addActionListener(events);
        btnExit.addActionListener(events);
        // Table Events
        loansTable.addMouseListener(this.events);
        // Document Event
        txtFieldSearcher.getDocument().addDocumentListener(events);
        
    }
    
    // WARNING: Do NOT modify this code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DbLoansPanel = new javax.swing.JPanel();
        loansScrollPanel = new javax.swing.JScrollPane();
        loansTable = new javax.swing.JTable();
        ButtonsPanel = new javax.swing.JPanel();
        btnNewLoan = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDeleteLoan = new javax.swing.JButton();
        txtFieldSearcher = new javax.swing.JTextField();
        TxtFieldsPanel = new javax.swing.JPanel();
        txtFieldId = new javax.swing.JTextField();
        txtFieldCodeStudent = new javax.swing.JTextField();
        txtFieldCodeBook = new javax.swing.JTextField();
        txtFieldDateLoan = new javax.swing.JTextField();
        txtFieldDateReturn = new javax.swing.JTextField();
        txtFieldStatus = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblCodeStudent = new javax.swing.JLabel();
        lblCodeBook = new javax.swing.JLabel();
        lblDateLoan = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblDateReturn = new javax.swing.JLabel();
        lblSearcher = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loansTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        loansScrollPanel.setViewportView(loansTable);

        btnNewLoan.setText("Nuevo Prestamo");

        btnModify.setText("Modificar");

        btnExit.setText("Salir");

        btnDeleteLoan.setText("Borrar Prestamo");

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNewLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewLoan)
                    .addComponent(btnDeleteLoan))
                .addGap(34, 34, 34)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnModify))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        lblId.setText("ID");

        lblCodeStudent.setText("Cod. Alumno");

        lblCodeBook.setText("Cod. Libro");

        lblDateLoan.setText("Fecha Prestamo");

        lblStatus.setText("Estado");

        lblDateReturn.setText("Fecha Devolución");

        javax.swing.GroupLayout TxtFieldsPanelLayout = new javax.swing.GroupLayout(TxtFieldsPanel);
        TxtFieldsPanel.setLayout(TxtFieldsPanelLayout);
        TxtFieldsPanelLayout.setHorizontalGroup(
            TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TxtFieldsPanelLayout.createSequentialGroup()
                        .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodeStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldCodeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TxtFieldsPanelLayout.createSequentialGroup()
                        .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCodeBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateLoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDateReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldDateLoan)
                            .addComponent(txtFieldDateReturn)
                            .addComponent(txtFieldStatus)
                            .addComponent(txtFieldCodeBook))))
                .addGap(6, 6, 6))
        );
        TxtFieldsPanelLayout.setVerticalGroup(
            TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtFieldsPanelLayout.createSequentialGroup()
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCodeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodeStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodeBook)
                    .addComponent(txtFieldCodeBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldDateLoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateLoan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldDateReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateReturn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblSearcher.setText("Buscar:");

        javax.swing.GroupLayout DbLoansPanelLayout = new javax.swing.GroupLayout(DbLoansPanel);
        DbLoansPanel.setLayout(DbLoansPanelLayout);
        DbLoansPanelLayout.setHorizontalGroup(
            DbLoansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DbLoansPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFieldSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DbLoansPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(TxtFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(121, 121, 121))
            .addGroup(DbLoansPanelLayout.createSequentialGroup()
                .addComponent(loansScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DbLoansPanelLayout.setVerticalGroup(
            DbLoansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DbLoansPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(DbLoansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(loansScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DbLoansPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DbLoansPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TxtFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DbLoansPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DbLoansPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JPanel DbLoansPanel;
    private javax.swing.JPanel TxtFieldsPanel;
    private javax.swing.JButton btnDeleteLoan;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNewLoan;
    private javax.swing.JLabel lblCodeBook;
    private javax.swing.JLabel lblCodeStudent;
    private javax.swing.JLabel lblDateLoan;
    private javax.swing.JLabel lblDateReturn;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblSearcher;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JScrollPane loansScrollPanel;
    private javax.swing.JTable loansTable;
    private javax.swing.JTextField txtFieldCodeBook;
    private javax.swing.JTextField txtFieldCodeStudent;
    private javax.swing.JTextField txtFieldDateLoan;
    private javax.swing.JTextField txtFieldDateReturn;
    private javax.swing.JTextField txtFieldId;
    private javax.swing.JTextField txtFieldSearcher;
    private javax.swing.JTextField txtFieldStatus;
    // End of variables declaration//GEN-END:variables
           
    
    // Buttons getters

    public JButton getBtnNewLoan() {
        return btnNewLoan;
    }
    
    public JButton getBtnDeleteLoan() {
        return btnDeleteLoan;
    }

    public JButton getBtnModify() {
        return btnModify;
    }

    public JButton getBtnExit() {
        return btnExit;
    }
    
  
    // Text Fields getters

    public JTextField getTxtFieldSearcher() {
        return txtFieldSearcher;
    }

    public JTextField getTxtFieldId() {
        return txtFieldId;
    }

    public JTextField getTxtFieldCodeStudent() {
        return txtFieldCodeStudent;
    }

    public JTextField getTxtFieldCodeBook() {
        return txtFieldCodeBook;
    }

    public JTextField getTxtFieldDateLoan() {
        return txtFieldDateLoan;
    }

    public JTextField getTxtFieldDateReturn() {
        return txtFieldDateReturn;
    }

    public JTextField getTxtFieldStatus() {
        return txtFieldStatus;
    }
    
    
    // Table getters
    
    public JTable getLoansTable() {
        return loansTable;
    }
    
    public tableView getTable() {
        return table;
    }
   
}
