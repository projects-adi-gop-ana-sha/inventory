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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author iqbal
 */
public class Product extends javax.swing.JFrame {

    /**
     * Creates new form Product
     */
    public Product() {
        initComponents();
        SelectProd();
        GetCat();
        
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
        ProductID = new javax.swing.JLabel();
        ProductIDText = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        DescriptionText = new javax.swing.JTextField();
        Quantity = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        Category = new javax.swing.JLabel();
        QuantityText = new javax.swing.JTextField();
        Description = new javax.swing.JLabel();
        CategoryJCombo = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        ProductsLists = new javax.swing.JLabel();

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
        jLabel10.setText("Manage products");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(324, 324, 324)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(435, 435, 435)
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
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProductID.setBackground(new java.awt.Color(255, 255, 255));
        ProductID.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ProductID.setText("Product ID");

        ProductIDText.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Name.setText("Name");

        Quantity.setBackground(new java.awt.Color(255, 255, 255));
        Quantity.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Quantity.setText("Quantity");

        Category.setBackground(new java.awt.Color(255, 255, 255));
        Category.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Category.setText("Category");

        Description.setBackground(new java.awt.Color(255, 255, 255));
        Description.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Description.setText("Description");

        CategoryJCombo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CategoryJCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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

        ProductTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Name", "Quantity", "Description", "Category"
            }
        ));
        ProductTable.setRowHeight(25);
        ProductTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        ProductsLists.setBackground(new java.awt.Color(255, 255, 255));
        ProductsLists.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ProductsLists.setText("Products Lists");

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
                            .addComponent(Name)
                            .addComponent(Quantity)
                            .addComponent(ProductID))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(QuantityText, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(NameText)
                            .addComponent(ProductIDText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Description)
                            .addComponent(Category))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DescriptionText)
                            .addComponent(CategoryJCombo, 0, 215, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(ProductsLists)
                        .addGap(207, 207, 207))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(ProductsLists)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductID)
                            .addComponent(ProductIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Quantity)
                            .addComponent(QuantityText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Description)
                            .addComponent(DescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Category)
                            .addComponent(CategoryJCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
       
    }//GEN-LAST:event_EditActionPerformed
    public void SelectProd() {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from PRODUCTTBL");
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

         ProductTable.setModel(model);

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
    private void GetCat(){
        try{
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
         St = Con.createStatement();
         String Query = "select * from inventorydb.CATEGORYTBL";
         Rs = St.executeQuery(Query); 
         while(Rs.next())
         {
             String Mycat = Rs.getString("CategoryName");
             CategoryJCombo.addItem(Mycat);
             
         }
        }
         catch(Exception e){
             e.printStackTrace();
                 }         
    }
            
    
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        if(ProductIDText.getText().isEmpty()||NameText.getText().isEmpty()||QuantityText.getText().isEmpty()||DescriptionText.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter the full details");
        }
        else{
        
        try{
         
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
         PreparedStatement add = Con.prepareStatement("insert into PRODUCTTBL values(?,?,?,?,?)");
         add.setInt(1, Integer.valueOf(ProductIDText.getText()));
         add.setString(2, NameText.getText());
         add.setInt(3, Integer.valueOf(QuantityText.getText()));
         add.setString(4, DescriptionText.getText());
         add.setString(5, CategoryJCombo.getSelectedItem().toString());
         int row = add.executeUpdate();
         JOptionPane.showMessageDialog(this,"product successfully Added");
         Con.close();
         ProductIDText.setText("");
         NameText.setText("");
         DescriptionText.setText("");
         QuantityText.setText("");
         SelectProd();
         
     }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        if(ProductIDText.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter the product to be deleted");
        }
        else{
            try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
                String id = ProductIDText.getText();
                String Query = "delete from inventorydb.PRODUCTTBL where ProductID="+id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"Product deleted successfully ");
                ProductIDText.setText("");
                NameText.setText("");
                DescriptionText.setText("");
                QuantityText.setText("");
                SelectProd();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            
        
        }
            
    }//GEN-LAST:event_DeleteMouseClicked

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        ProductIDText.setText(model.getValueAt(Myindex,0).toString());
        NameText.setText(model.getValueAt(Myindex,1).toString());
        QuantityText.setText(model.getValueAt(Myindex,2).toString());
        DescriptionText.setText(model.getValueAt(Myindex,3).toString());
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);   
    }//GEN-LAST:event_jLabel1MouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        if(ProductIDText.getText().isEmpty()||NameText.getText().isEmpty()||QuantityText.getText().isEmpty()||DescriptionText.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing information");   
        }
        else{
            try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
               String UpdateQuery = "update inventorydb.PRODUCTTBL set Name = '"+NameText.getText()+"',Quantity = "+QuantityText.getText()+",Description = '"+DescriptionText.getText()+"',Category = '"+CategoryJCombo.getSelectedItem().toString()+"'"+"where ProductID = "+ProductIDText.getText();
               Statement Add = Con.createStatement();
               Add.executeUpdate(UpdateQuery);
               JOptionPane.showMessageDialog(this, "Product Updated Successfully");
               ProductIDText.setText("");
               NameText.setText("");
               DescriptionText.setText("");
               QuantityText.setText("");
               SelectProd();
               
            }
            catch(Exception e){
                e.printStackTrace();     
            }
        }
            
            
    }//GEN-LAST:event_EditMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
       new Homeform().setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_HomeMouseClicked

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Category;
    private javax.swing.JComboBox<String> CategoryJCombo;
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Description;
    private javax.swing.JTextField DescriptionText;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameText;
    private javax.swing.JLabel ProductID;
    private javax.swing.JTextField ProductIDText;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel ProductsLists;
    private javax.swing.JLabel Quantity;
    private javax.swing.JTextField QuantityText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
