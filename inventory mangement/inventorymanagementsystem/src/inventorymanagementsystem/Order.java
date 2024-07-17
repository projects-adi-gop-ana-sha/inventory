
package inventorymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Order extends javax.swing.JFrame {

    
    public Order() {
        initComponents();
        SelectProd();
        SelectCust();
        GetToday();
    }
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null; 
    public void SelectProd(){
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
    
     private void GetToday(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        DateLabel.setText(dtf.format(now));
    }
    private void Update(){
        int newqty = oldqty - Integer.valueOf(QuantityText.getText());
       try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
               String UpdateQuery = "update inventorydb.PRODUCTTBL set Quantity = "+newqty+" where ProductID = "+productid;
               Statement Add = Con.createStatement();
               Add.executeUpdate(UpdateQuery);
               SelectProd();   
            }
            catch(Exception e){
                e.printStackTrace();     
            }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        OrderID = new javax.swing.JLabel();
        OrderIDText = new javax.swing.JTextField();
        Quantity = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        QuantityText = new javax.swing.JTextField();
        CustomerName = new javax.swing.JLabel();
        AddOrder = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        ViewOrders = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        CustomersList = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        ProductsList = new javax.swing.JLabel();
        CustomerNameLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        Rupees = new javax.swing.JLabel();
        PriceText = new javax.swing.JTextField();
        Productname = new javax.swing.JLabel();
        AddToOrders = new javax.swing.JButton();
        Amount = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        ProductnameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
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
        jLabel10.setText("MANAGE ORDERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(373, 373, 373))))
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

        OrderID.setBackground(new java.awt.Color(255, 255, 255));
        OrderID.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        OrderID.setText("Order ID");

        OrderIDText.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        Quantity.setBackground(new java.awt.Color(255, 255, 255));
        Quantity.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Quantity.setText("Quantity");

        Date.setBackground(new java.awt.Color(255, 255, 255));
        Date.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Date.setText("Date");

        QuantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityTextActionPerformed(evt);
            }
        });

        CustomerName.setBackground(new java.awt.Color(255, 255, 255));
        CustomerName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomerName.setText("Customer Name");

        AddOrder.setBackground(new java.awt.Color(0, 0, 0));
        AddOrder.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddOrder.setForeground(new java.awt.Color(255, 255, 255));
        AddOrder.setText("Add Order");
        AddOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddOrderMouseClicked(evt);
            }
        });

        Print.setBackground(new java.awt.Color(0, 0, 0));
        Print.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Print.setForeground(new java.awt.Color(255, 255, 255));
        Print.setText("Print");
        Print.setActionCommand("Edit");
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
        });
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
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

        ViewOrders.setBackground(new java.awt.Color(0, 0, 0));
        ViewOrders.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ViewOrders.setForeground(new java.awt.Color(255, 255, 255));
        ViewOrders.setText("View Orders");
        ViewOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewOrdersMouseClicked(evt);
            }
        });
        ViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrdersActionPerformed(evt);
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
        ProductTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        CustomersList.setBackground(new java.awt.Color(255, 255, 255));
        CustomersList.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        CustomersList.setText("Customers List");

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
        CustomerTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        CustomerTable.setShowGrid(false);
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTable);

        ProductsList.setBackground(new java.awt.Color(255, 255, 255));
        ProductsList.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ProductsList.setText("Products Lists");

        CustomerNameLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CustomerNameLabel.setText("CustName\n");

        DateLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DateLabel.setText("Date");

        OrderTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "ProductName", "Quantity", "Uprice", "Total"
            }
        ));
        OrderTable.setRowHeight(25);
        OrderTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        OrderTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(OrderTable);

        Rupees.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Rupees.setText("Rs");
        Rupees.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        PriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTextActionPerformed(evt);
            }
        });

        Productname.setBackground(new java.awt.Color(255, 255, 255));
        Productname.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Productname.setText("Product name");

        AddToOrders.setBackground(new java.awt.Color(0, 0, 0));
        AddToOrders.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        AddToOrders.setForeground(new java.awt.Color(255, 255, 255));
        AddToOrders.setText("AddToOrders");
        AddToOrders.setActionCommand("Edit");
        AddToOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToOrdersMouseClicked(evt);
            }
        });
        AddToOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToOrdersActionPerformed(evt);
            }
        });

        Amount.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Amount.setText("Amount");

        Price.setBackground(new java.awt.Color(255, 255, 255));
        Price.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Price.setText("Price");

        ProductnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductnameTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(OrderID)
                                .addGap(18, 18, 18)
                                .addComponent(OrderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Productname))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(AddOrder)
                                .addGap(18, 18, 18)
                                .addComponent(ViewOrders)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Home))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustomerName))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CustomerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(CustomersList)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(ProductsList)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ProductnameText, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(Price)
                                .addGap(18, 18, 18)
                                .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Quantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(AddToOrders)
                                .addGap(28, 28, 28)))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rupees, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Amount)
                .addGap(143, 143, 143)
                .addComponent(Print)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomersList)
                    .addComponent(ProductsList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrderID)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Quantity)
                        .addComponent(QuantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddToOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ProductnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Price)
                        .addComponent(Productname)
                        .addComponent(OrderIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerName)
                            .addComponent(CustomerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Date)
                            .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rupees, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount)
                    .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void ViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrdersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewOrdersActionPerformed

    private void QuantityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityTextActionPerformed
     
   
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
         System.exit(0); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void AddOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddOrderMouseClicked
        if(OrderIDText.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Enter the OrderID");
        }
        else{
        try{ 
         Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorydb?zeroDateTimeBehavior=CONVERT_TO_NULL","root","1234@");
         PreparedStatement add = Con.prepareStatement("insert into ORDERTBL values(?,?,?,?,?)");
         add.setInt(1, Integer.valueOf(OrderIDText.getText()));
         add.setString(2, CustomerNameLabel.getText());
         add.setString(3, DateLabel.getText());
         add.setInt(4, Integer.valueOf(Amount.getText()));
         add.setString(5, ProductnameText.getText());
         int row = add.executeUpdate();
         JOptionPane.showMessageDialog(this,"product successfully Added");
         Con.close();
        }
        catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddOrderMouseClicked

    private void ViewOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewOrdersMouseClicked
       new Orderview().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewOrdersMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
       new Homeform().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_HomeMouseClicked
   
    
    int i = 1,Uprice,tot ,total = 0;
    String Prodname;
    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
      try{
          OrderTable.print();
      }
      catch(Exception exp)
      {
          exp.printStackTrace();
      }
    }//GEN-LAST:event_PrintMouseClicked

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
        int Myindex = CustomerTable.getSelectedRow();
       // CustomerIDText.setText(model.getValueAt(Myindex,0).toString());
        CustomerNameLabel.setText(model.getValueAt(Myindex,1).toString());
       // PhoneText.setText(model.getValueAt(Myindex,2).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked
    
    
    int flag = 0,productid,oldqty;
    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)ProductTable.getModel();
        int Myindex = ProductTable.getSelectedRow();
        productid = Integer.valueOf(model.getValueAt(Myindex, 0).toString());
        Prodname = model.getValueAt(Myindex,1).toString();
        ProductnameText.setText(model.getValueAt(Myindex,1).toString());
        oldqty = Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        //DescriptionText.setText(model.getValueAt(Myindex,3).toString());
        flag = 1;
    }//GEN-LAST:event_ProductTableMouseClicked

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked
        
    }//GEN-LAST:event_OrderTableMouseClicked

    private void PriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextActionPerformed

    private void AddToOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToOrdersMouseClicked
         if(flag == 0||QuantityText.getText().isEmpty()||PriceText.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Select product and enter quantity");
       }
       else
       {
       
        Uprice = Integer.valueOf(PriceText.getText());
        tot = Uprice * Integer.valueOf(QuantityText.getText());
        Vector v = new Vector();
        v.add(i);
        v.add(Prodname);
        v.add(QuantityText.getText());
        v.add(Uprice);
        v.add(tot);
        DefaultTableModel dt = (DefaultTableModel)OrderTable.getModel();
        dt.addRow(v);
        total = total + tot;
        Amount.setText(""+total);
        Update();
        i++;
        
    }
    }//GEN-LAST:event_AddToOrdersMouseClicked

    private void AddToOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToOrdersActionPerformed

    }//GEN-LAST:event_AddToOrdersActionPerformed

    private void ProductnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductnameTextActionPerformed

   
            
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddOrder;
    private javax.swing.JButton AddToOrders;
    private javax.swing.JLabel Amount;
    private javax.swing.JLabel CustomerName;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel CustomersList;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton Home;
    private javax.swing.JLabel OrderID;
    private javax.swing.JTextField OrderIDText;
    private javax.swing.JTable OrderTable;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField PriceText;
    private javax.swing.JButton Print;
    private javax.swing.JTable ProductTable;
    private javax.swing.JLabel Productname;
    private javax.swing.JTextField ProductnameText;
    private javax.swing.JLabel ProductsList;
    private javax.swing.JLabel Quantity;
    private javax.swing.JTextField QuantityText;
    private javax.swing.JLabel Rupees;
    private javax.swing.JButton ViewOrders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
