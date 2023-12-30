/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinetuto;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author afwadmin
 */
public class Passengers extends javax.swing.JFrame {

    /**
     * Creates new form Passengers
     */
    public Passengers() {
        initComponents();
        DisplayPassengers();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NatCb = new javax.swing.JComboBox();
        GenCb = new javax.swing.JComboBox();
        PAddressTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SaveBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PassengersTable = new javax.swing.JTable();
        PassNumTb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PPhoneTb = new javax.swing.JTextField();

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
        jLabel3.setText("Manage Passengers");

        jLabel4.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Passenger Name");

        PNameTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Nationality");

        jLabel6.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Passport Number");

        jLabel8.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Address");

        NatCb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N
        NatCb.setForeground(new java.awt.Color(255, 0, 0));
        NatCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "India", "USA", "England", "France", "Congo", "Spain", "Namibia", "Mexico", "China" }));

        GenCb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N
        GenCb.setForeground(new java.awt.Color(255, 0, 0));
        GenCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        PAddressTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Passengers List");

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

        PassengersTable.setFont(new java.awt.Font("Averia", 0, 14)); // NOI18N
        PassengersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        PassengersTable.setRowHeight(25);
        PassengersTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        PassengersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PassengersTable);

        PassNumTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Phone");

        PPhoneTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(NatCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel5)))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(GenCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PAddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PPhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NatCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GenCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PAddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PPhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
Connection Con = null;
PreparedStatement pst = null;
ResultSet Rs = null,Rs1=null;
Statement St = null,St1=null;
private void DisplayPassengers()
{
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from PassengersTbl");
        PassengersTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
    }
}
int PassId = 0;
private void CountPassengers()
{
    try {
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select Max(PId) from PassengersTbl");
        Rs1.next();
        PassId = Rs1.getInt(1)+1;
    } catch (Exception e) {
    }
}
private void Clear()
{
    PNameTb.setText("");
    PassNumTb.setText("");
    PAddressTb.setText("");
    PPhoneTb.setText("");
    
}
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        if(PNameTb.getText().isEmpty() || PassNumTb.getText().isEmpty() || PAddressTb.getText().isEmpty() || PPhoneTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
            try {
                CountPassengers();             
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into PassengersTbl values(?,?,?,?,?,?,?)");
                Add.setInt(1, PassId);
                Add.setString(2, PNameTb.getText());
                Add.setString(3, NatCb.getSelectedItem().toString());
                Add.setString(4, GenCb.getSelectedItem().toString());
                Add.setString(5, PassNumTb.getText());
                Add.setString(6, PAddressTb.getText());
                Add.setString(7, PPhoneTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Passenger Added");
                Con.close();
                DisplayPassengers();
                Clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
       if(Key == 0){
           JOptionPane.showMessageDialog(this, "select a Passenger");
       }else{
           try {
              Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
              String Query = "Delete from PassengersTbl where PId="+Key;
              Statement Del = Con.createStatement();
              Del.executeUpdate(Query);
              JOptionPane.showMessageDialog(this, "Passenger Deleted");
              DisplayPassengers();
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
           }
       }
    }//GEN-LAST:event_DeleteBtnMouseClicked
    int Key = 0;
    private void PassengersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengersTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)PassengersTable.getModel();
        int MyIndex = PassengersTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        PNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        NatCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
        GenCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        PassNumTb.setText(model.getValueAt(MyIndex, 4).toString());
        PAddressTb.setText(model.getValueAt(MyIndex, 5).toString());
        PPhoneTb.setText(model.getValueAt(MyIndex, 6).toString());
    }//GEN-LAST:event_PassengersTableMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(Key == 0)
        {
            JOptionPane.showMessageDialog(this, "Select A Passenger");
        }else{
            try {
              //  CountPassengers();             
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                String Query = "Update PassengersTbl set PName=?,PNat=?,PGen=?,Ppass=?,PAdd=?,Pphone=? where PId=?";
                PreparedStatement Add = Con.prepareStatement(Query);
                Add.setInt(7, Key);
                Add.setString(1, PNameTb.getText());
                Add.setString(2, NatCb.getSelectedItem().toString());
                Add.setString(3, GenCb.getSelectedItem().toString());
                Add.setString(4, PassNumTb.getText());
                Add.setString(5, PAddressTb.getText());
                Add.setString(6, PPhoneTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Passenger Updated");
                Con.close();
                DisplayPassengers();
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
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passengers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passengers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox GenCb;
    private javax.swing.JComboBox NatCb;
    private javax.swing.JTextField PAddressTb;
    private javax.swing.JTextField PNameTb;
    private javax.swing.JTextField PPhoneTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JTable PassengersTable;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel10;
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
