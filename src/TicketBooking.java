
package airlinetuto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class TicketBooking extends javax.swing.JFrame {

 
    public TicketBooking() {
        initComponents();
        GetPassenger();
        NationalityTb.setEditable(false);
        PassNameTb.setEditable(false);
        PassNumTb.setEditable(false);
        GenTb.setEditable(false);
        GetFlights();
        DisplayBooking();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PassNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BookBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingTable = new javax.swing.JTable();
        PassNumTb = new javax.swing.JTextField();
        NationalityTb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PassIdCb = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        FCodeCb = new javax.swing.JComboBox();
        GenTb = new javax.swing.JTextField();

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
        jLabel3.setText("Tickets Booking");

        jLabel4.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Passenger Name");

        PassNameTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

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
        jLabel8.setText("Amount");

        AmountTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Averia", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Bookings");

        BookBtn.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        BookBtn.setForeground(new java.awt.Color(255, 0, 0));
        BookBtn.setText("Book");
        BookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookBtnMouseClicked(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(255, 0, 0));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
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

        BookingTable.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N
        BookingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        BookingTable.setRowHeight(25);
        BookingTable.setSelectionBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(BookingTable);

        PassNumTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        NationalityTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Passenger Id");

        PassIdCb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N
        PassIdCb.setForeground(new java.awt.Color(255, 0, 0));
        PassIdCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdCbMouseClicked(evt);
            }
        });
        PassIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdCbActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Averia", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Flight Code");

        FCodeCb.setFont(new java.awt.Font("Averia", 0, 16)); // NOI18N
        FCodeCb.setForeground(new java.awt.Color(255, 0, 0));

        GenTb.setFont(new java.awt.Font("Averia", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(PassIdCb, 0, 117, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(FCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GenTb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel5))
                            .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(BookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(495, 495, 495))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GenTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FCodeCb))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PassIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BookBtn)
                    .addComponent(BackBtn)
                    .addComponent(ResetBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
private  void GetPassenger()
{
    try {
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
         St = Con.createStatement();
         String Query = "select * from PassengersTbl";
         Rs = St.executeQuery(Query);
         while(Rs.next())
         {
            String PId = String.valueOf(Rs.getInt("PId"));
            PassIdCb.addItem(PId);
         }
    } catch (Exception e) {
    }    
}
private  void GetFlights()
{
    try {
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
         St = Con.createStatement();
         String Query = "select * from FlightTbl";
         Rs = St.executeQuery(Query);
         while(Rs.next())
         {
            String FCode = Rs.getString("FlCode");
            FCodeCb.addItem(FCode);
         }
    } catch (Exception e) {
    }    
}
private  void GetPassengerData()
{
    String Query = "select * from PassengersTbl where PId ="+PassIdCb.getSelectedItem().toString();
    Statement St;
    ResultSet Rs;
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery(Query);
        if(Rs.next())
        {
            PassNameTb.setText(Rs.getString("PName"));
            GenTb.setText(Rs.getString("PGen"));
            PassNumTb.setText(Rs.getString("Ppass"));
            NationalityTb.setText(Rs.getString("PNat"));
        }
    } catch (Exception e) {
    }
}
private void DisplayBooking()
{
    try {
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St = Con.createStatement();
        Rs = St.executeQuery("select * from BookingTbl");
        BookingTable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
    }
}
int TId = 0;
private void CountFlights()
{
    try {
        St1 = Con.createStatement();
        Rs1 = St1.executeQuery("select Max(TicketId) from BookingTbl");
        Rs1.next();
        TId = Rs1.getInt(1)+1;
    } catch (Exception e) {
    }
}
    private void BookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookBtnMouseClicked
         if(PassIdCb.getSelectedIndex()==-1 || FCodeCb.getSelectedIndex() == -1 || AmountTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
            try {
                CountFlights();             
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into BookingTbl values(?,?,?,?,?,?,?)");
                Add.setInt(1, TId);
                Add.setString(2, PassNameTb.getText());
                Add.setString(3, FCodeCb.getSelectedItem().toString());
                Add.setString(4, GenTb.getText());
                Add.setString(5, PassNumTb.getText());
                Add.setInt(6, Integer.valueOf(AmountTb.getText()));
                Add.setString(7, NationalityTb.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Ticket Booked");
                Con.close();
                DisplayBooking();
                Clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_BookBtnMouseClicked

    private void PassIdCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdCbMouseClicked
        
    }//GEN-LAST:event_PassIdCbMouseClicked

    private void PassIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdCbActionPerformed
        GetPassengerData();
    }//GEN-LAST:event_PassIdCbActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked
private void Clear()
{
     FCodeCb.setSelectedIndex(-1);
       // PassIdCb.setSelectedIndex(-1);
        PassNameTb.setText("");
        PassNumTb.setText("");
        GenTb.setText("");
        NationalityTb.setText("");
        AmountTb.setText("");
}
    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
       Clear();
    }//GEN-LAST:event_ResetBtnMouseClicked

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BookBtn;
    private javax.swing.JTable BookingTable;
    private javax.swing.JComboBox FCodeCb;
    private javax.swing.JTextField GenTb;
    private javax.swing.JTextField NationalityTb;
    private javax.swing.JComboBox PassIdCb;
    private javax.swing.JTextField PassNameTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
