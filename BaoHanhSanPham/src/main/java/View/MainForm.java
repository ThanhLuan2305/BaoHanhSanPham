/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ADMIN
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    private JPanel chillPn;
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlParent = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnSanPham = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnCustomerProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlParent.setBackground(new java.awt.Color(204, 0, 0));
        pnlParent.setForeground(new java.awt.Color(255, 51, 51));
        pnlParent.setLayout(new java.awt.CardLayout());

        btnSanPham.setText("Sản Phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        jButton1.setText("Khách Hàng");
        jButton1.setName("btnCustomer"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCustomerProduct.setText("Sản phẩm-Khách hàng");
        btnCustomerProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomerProduct)
                    .addComponent(jButton1)
                    .addComponent(btnSanPham))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(btnSanPham)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addComponent(btnCustomerProduct)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlParent, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlParent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        chillPn = new pnlProduct();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        chillPn = new pnlCustomer();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCustomerProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerProductActionPerformed
        chillPn = new pnlCustomer_Product();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnCustomerProductActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerProduct;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlParent;
    // End of variables declaration//GEN-END:variables
}
