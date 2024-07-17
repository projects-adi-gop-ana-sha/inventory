
package inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class user extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public user() {
        initComponents();
        SelectUser();
        
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        UsernameText = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordText = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jscrollpane1 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        UsersList = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Inventory  Management System");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("USER LIST");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Username.setBackground(new java.awt.Color(255, 255, 255));
        Username.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Username.setText("Username");

        UsernameText.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Password.setText("Password");

        Add.setBackground(new java.awt.Color(0, 0, 0));
        Add.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(0, 0, 0));
        Delete.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.setActionCommand("Edit");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Home.setBackground(new java.awt.Color(0, 0, 0));
        Home.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(0, 0, 0));
        Edit.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Edit");
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        UserTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Phone"
            }
        ));
        UserTable.setRowHeight(25);
        UserTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jscrollpane1.setViewportView(UserTable);

        UsersList.setBackground(new java.awt.Color(255, 255, 255));
        UsersList.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        UsersList.setText("Users List");

        Phone.setBackground(new java.awt.Color(255, 255, 255));
        Phone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Phone.setText("Phone");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password)
                            .addComponent(Username)
                            .addComponent(Phone))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PhoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(PasswordText)
                            .addComponent(UsernameText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(UsersList)
                        .addGap(180, 180, 180)))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(UsersList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Username)
                            .addComponent(UsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password)
                            .addComponent(PasswordText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jscrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed
    
    public void SelectUser(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from USERTBL");
            DefaultTableModel model = new DefaultTableModel();


            
            int columnCount = Rs.getMetaData().getColumnCount();

           
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                model.addColumn(Rs.getMetaData().getColumnLabel(columnIndex));
            }

            
            while (Rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = Rs.getObject(i);
                }
                model.addRow(rowData);
            }

            UserTable.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
           
            try {
                if (Rs != null) {
                    Rs.close();
                }
                if (St != null) {
                    St.close();
                }
                if (Con != null) {
                    Con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
       if(UsernameText.getText().isEmpty()||PasswordText.getText().isEmpty()||PhoneText.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter the full details");
        }
        else{
        
        try{
         
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
         PreparedStatement add = Con.prepareStatement("insert into USERTBL values(?,?,?)");
         add.setString(1, UsernameText.getText());
         add.setString(2, PasswordText.getText());
         add.setString(3, PhoneText.getText());
         int row = add.executeUpdate();
         JOptionPane.showMessageDialog(this,"User successfully Added");
         Con.close();
         UsernameText.setText("");
         PasswordText.setText("");
         PhoneText.setText("");
         SelectUser();
          }
        /*catch(SQLIntegrityConstraintViolationException e)
        {
             JOptionPane.showMessageDialog(this,"check Username");
        }*/
        catch(SQLException e)
        {
             JOptionPane.showMessageDialog(this,"Enter different Username");
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_AddMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        if(UsernameText.getText().isEmpty()||PasswordText.getText().isEmpty()||PhoneText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information");   
        }
        else{
            try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
               String UpdateQuery = "update inventorydb.USERTBL set Username = '"+UsernameText.getText()+"',Password = '"+PasswordText.getText()+"' where Phone = '"+PhoneText.getText()+"'";
               Statement Add = Con.createStatement();
               Add.executeUpdate(UpdateQuery);
               JOptionPane.showMessageDialog(this, "Product Updated Successfully");
               UsernameText.setText("");
               PasswordText.setText("");
               PhoneText.setText("");
               SelectUser();
               
            }
            catch(Exception e){
                e.printStackTrace();     
            }
        }
    }//GEN-LAST:event_EditMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        if(PhoneText.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter the Username of user to be deleted");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
                String id = UsernameText.getText();
                String Query = "delete from inventorydb.USERTBL where Username= '"+id+"'";
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"User deleted successfully ");
                UsernameText.setText("");
                PasswordText.setText("");
                PhoneText.setText("");
                SelectUser();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            
        
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
         new Homeform().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)UserTable.getModel();
        int Myindex = UserTable.getSelectedRow();
        UsernameText.setText(model.getValueAt(Myindex,0).toString());
        PasswordText.setText(model.getValueAt(Myindex,1).toString());
        PhoneText.setText(model.getValueAt(Myindex,2).toString());
       
    }//GEN-LAST:event_UserTableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         System.exit(0); 
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField PasswordText;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JTable UserTable;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel UsersList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jscrollpane1;
    // End of variables declaration//GEN-END:variables
}
