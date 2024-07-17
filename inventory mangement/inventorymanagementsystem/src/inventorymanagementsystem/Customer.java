/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iqbal
 */
public class Customer extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public Customer() {
        initComponents();
        SelectCust();
    }
    Connection Con = null;
    Statement St = null;
    Statement St1 = null;
    ResultSet Rs = null;  
    ResultSet Rs1 = null;
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CustomerID = new javax.swing.JLabel();
        CustomerIDText = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        PhoneText = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        CustomerLists = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        OrderNumber = new javax.swing.JLabel();

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
        jLabel10.setText("CUSTOMER PRODUCT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(416, 416, 416)
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

        CustomerID.setBackground(new java.awt.Color(255, 255, 255));
        CustomerID.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerID.setText("Customer ID");

        CustomerIDText.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Name.setText("Name");

        Phone.setBackground(new java.awt.Color(255, 255, 255));
        Phone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Phone.setText("Phone");

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

        CustomerTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerID", "Name", "Phone"
            }
        ));
        CustomerTable.setRowHeight(25);
        CustomerTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerTable);

        CustomerLists.setBackground(new java.awt.Color(255, 255, 255));
        CustomerLists.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerLists.setText("Customers List");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Amount");

        Amount.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Amount.setForeground(new java.awt.Color(255, 255, 255));
        Amount.setText("     X  ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(Amount)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(Amount)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Orders");

        OrderNumber.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        OrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        OrderNumber.setText("X");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name)
                                    .addComponent(Phone)
                                    .addComponent(CustomerID))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PhoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(NameText)
                                    .addComponent(CustomerIDText)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CustomerLists)
                .addGap(188, 188, 188))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CustomerLists)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerID)
                            .addComponent(CustomerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name)
                            .addComponent(NameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Phone)
                            .addComponent(PhoneText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    public void SelectCust(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from CUSTOMERTBL");
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

            CustomerTable.setModel(model);

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
        if(CustomerIDText.getText().isEmpty()||NameText.getText().isEmpty()||Phone.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter the full details");
        }
        else{
        
        try{
         
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
         PreparedStatement add = Con.prepareStatement("insert into CUSTOMERTBL values(?,?,?)");
         add.setInt(1, Integer.valueOf(CustomerIDText.getText()));
         add.setString(2, NameText.getText());
         add.setString(3, PhoneText.getText());
         int row = add.executeUpdate();
         JOptionPane.showMessageDialog(this,"product successfully Added");
         Con.close();
         CustomerIDText.setText("");
         NameText.setText("");
         PhoneText.setText("");
         SelectCust();
         
     }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        if(CustomerIDText.getText().isEmpty()||NameText.getText().isEmpty()||PhoneText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information");   
        }
        else{
            try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
               String UpdateQuery = "update inventorydb.CUSTOMERTBL set Name = '"+NameText.getText()+"'"+",Phone = '"+PhoneText.getText()+"'"+"where CustomerID = "+CustomerIDText.getText();
               Statement Add = Con.createStatement();
               Add.executeUpdate(UpdateQuery);
               JOptionPane.showMessageDialog(this, "Product Updated Successfully");
                CustomerIDText.setText("");
                NameText.setText("");
                PhoneText.setText("");
               SelectCust();
               
            }
            catch(Exception e){
                e.printStackTrace();     
            }
        }
    }//GEN-LAST:event_EditMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        if(CustomerIDText.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter the customer to be deleted");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
                String id = CustomerIDText.getText();
                String Query = "delete from inventorydb.CUSTOMERTBL where CustomerID="+id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"Customer deleted successfully ");
                CustomerIDText.setText("");
                NameText.setText("");
                PhoneText.setText("");
                SelectCust();
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

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
         DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
        int Myindex = CustomerTable.getSelectedRow();
        CustomerIDText.setText(model.getValueAt(Myindex,0).toString());
        NameText.setText(model.getValueAt(Myindex,1).toString());
        PhoneText.setText(model.getValueAt(Myindex,2).toString());
        
       try{
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
             St = Con.createStatement();
             St1 = Con.createStatement();
             Rs = St.executeQuery("select count(*) from inventorydb.ORDERTBL where CustName='"+model.getValueAt(Myindex,1).toString()+"'");
             Rs1 = St1.executeQuery("select sum(Amount) from inventorydb.ORDERTBL where CustName='"+model.getValueAt(Myindex,1).toString()+"'");
             while (Rs.next()){
                 OrderNumber.setText(""+Rs.getInt(1));
             }
             while (Rs1.next()){
                 Amount.setText(""+Rs1.getInt(1));
             }
        }catch(SQLException e)
        {
        e.printStackTrace();
        }
             
             
        
        
    }//GEN-LAST:event_CustomerTableMouseClicked

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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Amount;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JTextField CustomerIDText;
    private javax.swing.JLabel CustomerLists;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameText;
    private javax.swing.JLabel OrderNumber;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
