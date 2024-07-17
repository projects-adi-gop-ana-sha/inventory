/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s6adi
 */
public class Orderview extends javax.swing.JFrame {

   
    public Orderview() {
        initComponents();
        SelectOrder();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        Home = new javax.swing.JButton();
        orders = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(ProductTable);

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        jLabel10.setText("Order View");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(309, 309, 309)
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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        OrderTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "CustName", "OrderDate", "Amount", "ProductName"
            }
        ));
        OrderTable.setRowHeight(25);
        OrderTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(OrderTable);

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

        orders.setBackground(new java.awt.Color(0, 0, 0));
        orders.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        orders.setForeground(new java.awt.Color(255, 255, 255));
        orders.setText("Orders");
        orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersMouseClicked(evt);
            }
        });
        orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(orders, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(257, 257, 257))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orders, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     public void SelectOrder() {
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from ORDERTBL");
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

            OrderTable.setModel(model);

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
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked

    }//GEN-LAST:event_OrderTableMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        new Homeform().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_HomeMouseClicked

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseClicked
        new Order().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ordersMouseClicked

    private void ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordersActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orderview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JTable OrderTable;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton orders;
    // End of variables declaration//GEN-END:variables
}
