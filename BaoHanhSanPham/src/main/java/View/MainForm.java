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
        chillPn = new pnlDashboard();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
        this.setLocationRelativeTo(null);
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
        btnLichSuaChua = new javax.swing.JButton();
        btnGiaHanBaoHanh = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnPrCus = new javax.swing.JButton();
        btnWarrantyPolicy = new javax.swing.JButton();
        btnWarrantyClaim = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QLSP");

        pnlParent.setBackground(new java.awt.Color(255, 255, 255));
        pnlParent.setForeground(new java.awt.Color(255, 255, 255));
        pnlParent.setVerifyInputWhenFocusTarget(false);
        pnlParent.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btnSanPham.setText("Sản Phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnLichSuaChua.setText("Lịch Sửa Chữa");
        btnLichSuaChua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuaChuaActionPerformed(evt);
            }
        });

        btnGiaHanBaoHanh.setText("Gia Hạn Bảo Hành");
        btnGiaHanBaoHanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaHanBaoHanhActionPerformed(evt);
            }
        });

        btnCustomer.setText("Khách Hàng");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnPrCus.setText("<html>Sản Phẩm<br>Và Khách Hàng</html>");
        btnPrCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrCusActionPerformed(evt);
            }
        });

        btnWarrantyPolicy.setText("Chính sách bảo hành");
        btnWarrantyPolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarrantyPolicyActionPerformed(evt);
            }
        });

        btnWarrantyClaim.setText("Yêu cầu bảo hành");
        btnWarrantyClaim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWarrantyClaimActionPerformed(evt);
            }
        });

        btnDashboard.setText("Trang chủ");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnWarrantyPolicy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnWarrantyClaim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLichSuaChua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGiaHanBaoHanh, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(btnPrCus)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrCus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnWarrantyClaim, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLichSuaChua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnWarrantyPolicy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGiaHanBaoHanh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlParent, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlParent, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnLichSuaChuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuaChuaActionPerformed
        // TODO add your handling code here:
        chillPn = new pnlRepairHistory();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnLichSuaChuaActionPerformed

    private void btnGiaHanBaoHanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaHanBaoHanhActionPerformed
        // TODO add your handling code here:
        chillPn = new pnlExtendedWarranty();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnGiaHanBaoHanhActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        chillPn = new pnlCustomer();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnPrCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrCusActionPerformed
        // TODO add your handling code here:
        chillPn = new pnlCustomer_Product();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnPrCusActionPerformed

    private void btnWarrantyPolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarrantyPolicyActionPerformed
        chillPn = new pnlWarrantyPolicy();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnWarrantyPolicyActionPerformed

    private void btnWarrantyClaimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWarrantyClaimActionPerformed
        chillPn = new pnlWarrantyClaim();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnWarrantyClaimActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        chillPn = new pnlDashboard();
        pnlParent.removeAll();
        pnlParent.add(chillPn);
        pnlParent.repaint();
        pnlParent.revalidate();
    }//GEN-LAST:event_btnDashboardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnGiaHanBaoHanh;
    private javax.swing.JButton btnLichSuaChua;
    private javax.swing.JButton btnPrCus;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnWarrantyClaim;
    private javax.swing.JButton btnWarrantyPolicy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlParent;
    // End of variables declaration//GEN-END:variables
}
