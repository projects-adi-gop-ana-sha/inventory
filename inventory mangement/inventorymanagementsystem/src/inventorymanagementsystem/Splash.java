/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventorymanagementsystem;

/**
 *
 * @author iqbal
 */
public class Splash extends javax.swing.JFrame {
    public Splash() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Invys = new javax.swing.JLabel();
        Percentage = new javax.swing.JLabel();
        Progressionbar = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 26)); // NOI18N
        jLabel2.setText("Inventory  Management System");

        Invys.setBackground(new java.awt.Color(255, 255, 255));
        Invys.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        Invys.setText("InvSys");

        Percentage.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        Percentage.setText("%");

        Progressionbar.setBackground(new java.awt.Color(255, 255, 255));
        Progressionbar.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\s6adi\\OneDrive\\Desktop\\inventory mangement\\f40b68a1-25ad-4e65-9de1-c8635d12ecdf.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(Percentage))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Invys)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addComponent(Progressionbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(Invys)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Percentage)
                .addGap(40, 40, 40)
                .addComponent(Progressionbar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        Splash MysSplash = new Splash();
        MysSplash.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                    Thread.sleep(40);
                    MysSplash.Progressionbar.setValue(i);
                    MysSplash.Percentage.setText(Integer.valueOf(i)+"%");
                    
            }
        }
        catch(Exception e){
        }
        new Login().setVisible(true);
        MysSplash.dispose();
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Invys;
    private javax.swing.JLabel Percentage;
    private javax.swing.JProgressBar Progressionbar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
