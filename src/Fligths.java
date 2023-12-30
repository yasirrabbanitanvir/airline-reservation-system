/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinetuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author afwadmin
 */
public class Fligths extends javax.swing.JFrame {

 
    public Fligths() {
        initComponents();
        DisplayFlight();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FCodeTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FSrouceCb = new javax.swing.JComboBox();
        FDestCb = new javax.swing.JComboBox();
        FDate = new com.toedter.calendar.JDateChooser();
        SeatsTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("MyCodeSpace Airline");

        jLabel3.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Manage Fligths");

        jLabel4.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Fligth Code");

        FCodeTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Source");

        jLabel6.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Destination");

        jLabel7.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Takeof Date");

        jLabel8.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Number Of Seats");

        FSrouceCb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N
        FSrouceCb.setForeground(new java.awt.Color(255, 0, 0));
        FSrouceCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bangalore", "Delhy", "Mumbai", "Channai", "Maisoor", "Goa", "TamilNadu" }));

        FDestCb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N
        FDestCb.setForeground(new java.awt.Color(255, 0, 0));
        FDestCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bangalore", "Delhy", "Mumbai", "Channai", "Maisoor", "Goa", "TamilNadu" }));

        FDate.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        SeatsTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Fligths List");

        SaveBtn.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 0, 0));
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 0, 0));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 0, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 0, 0));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        FlightsTable.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        FlightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        FlightsTable.setRowHeight(25);
        FlightsTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        FlightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel4)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel5)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(77, 77, 77))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(FSrouceCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(FDestCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(SeatsTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 495, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(453, 453, 453))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FSrouceCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FDestCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(FDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SeatsTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(EditBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(BackBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked
Connection Con = null;
PreparedStatement pst = null;
ResultSet Rs = null,Rs1=null;
Statement St = null,St1=null;
private void DisplayFlight()
{
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from FlightTbl");
        FlightsTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
    }
}
private void Clear()
{
    FCodeTb.setText("");
    SeatsTb.setText("");   
}
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
         if(FCodeTb.getText().isEmpty() || SeatsTb.getText().isEmpty() || FSrouceCb.getSelectedIndex() == -1 || FDestCb.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
            try {
                            
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into FlightTbl values(?,?,?,?,?)");
                Add.setString(1, FCodeTb.getText());
                Add.setString(2, FSrouceCb.getSelectedItem().toString());
                Add.setString(3, FDestCb.getSelectedItem().toString());
                Add.setString(4, FDate.getDate().toString());
                Add.setInt(5, Integer.valueOf(SeatsTb.getText()));
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Flight Added");
                Con.close();
                DisplayFlight();
                Clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
         if(Key == ""){
           JOptionPane.showMessageDialog(this, "select a Flight");
       }else{
           try {
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
              String Query = "Delete from FlightTbl where FlCode='"+Key+"'";
              Statement Del = Con.createStatement();
              Del.executeUpdate(Query);
              JOptionPane.showMessageDialog(this, "Flight Deleted");
              DisplayFlight();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_DeleteBtnMouseClicked
String Key = "";
    private void FlightsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsTableMouseClicked
         DefaultTableModel model = (DefaultTableModel)FlightsTable.getModel();
        int MyIndex = FlightsTable.getSelectedRow();
        Key = model.getValueAt(MyIndex, 0).toString();
        FSrouceCb.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
        FDestCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        SeatsTb.setText(model.getValueAt(MyIndex, 4).toString());
     
    }//GEN-LAST:event_FlightsTableMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
         if(Key == "")
        {
            JOptionPane.showMessageDialog(this, "Select A Passenger");
        }else{
            try {
              //  CountPassengers();             
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String Query = "Update FlightTbl set FlSource=?,FlDest=?,FlDate=?,FlSeats=? where FlCode=?";
                PreparedStatement Add = Con.prepareStatement(Query);
                Add.setString(5, Key);
                Add.setString(1, FSrouceCb.getSelectedItem().toString());
                Add.setString(2, FDestCb.getSelectedItem().toString());
                Add.setString(3, FDate.getDate().toString());
                Add.setString(4, SeatsTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Flight Updated");
                Con.close();
                DisplayFlight();
                Clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fligths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fligths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fligths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fligths.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fligths().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField FCodeTb;
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JComboBox FDestCb;
    private javax.swing.JComboBox FSrouceCb;
    private javax.swing.JTable FlightsTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField SeatsTb;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
