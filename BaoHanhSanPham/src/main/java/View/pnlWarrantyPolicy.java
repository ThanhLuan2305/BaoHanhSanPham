/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import static Database.ConnectCassandra.createSession;
import Database.Service.WarrantyPolicyService;
import com.datastax.oss.driver.api.core.CqlSession;
import Model.WarrantyPolicy;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nganh
 */
public class pnlWarrantyPolicy extends javax.swing.JPanel {

    /**
     * Creates new form pnlWarrantyPolicyy
     */
    private WarrantyPolicyService warrantyPolicyService;
    CqlSession cqlSession = createSession();

    public pnlWarrantyPolicy() {
        initComponents();
        warrantyPolicyService = new WarrantyPolicyService(cqlSession);
        loadWarrantyPolicies();
        loadProductTypesIntoComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaCS = new javax.swing.JTextField();
        CbbLoaiSP = new javax.swing.JComboBox<>();
        txtTGBH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDK = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableCSBH = new javax.swing.JTable();
        btnPDF = new javax.swing.JButton();

        jPanel1.setPreferredSize(new java.awt.Dimension(735, 610));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ CHÍNH SÁCH BẢO HÀNH");

        jLabel2.setText("Mã chính sách:");

        jLabel3.setText("Loại sản phẩm:");

        txtMaCS.setName("txtMa"); // NOI18N

        CbbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbbLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbbLoaiSPActionPerformed(evt);
            }
        });

        txtTGBH.setName("txtTime"); // NOI18N

        jLabel4.setText("Thời hạn bảo hành:");

        jLabel5.setText("Điều kiện:");

        txtDK.setColumns(20);
        txtDK.setRows(5);
        txtDK.setName("txtDK"); // NOI18N
        jScrollPane1.setViewportView(txtDK);

        btnThem.setText("Thêm Chính sách");
        btnThem.setName("btnThem"); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa Chính Sách");
        btnXoa.setName("btnXoa"); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Cập nhật chính sách ");
        btnSua.setName("btnSua"); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        TableCSBH.setModel(new javax.swing.table.DefaultTableModel(
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
        TableCSBH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCSBHMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableCSBH);

        btnPDF.setText("Xuất File PDF");
        btnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addGap(52, 52, 52)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTGBH)
                            .addComponent(CbbLoaiSP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaCS)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSua)
                                        .addGap(69, 69, 69)
                                        .addComponent(btnPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 5, Short.MAX_VALUE)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(52, 52, 52)
                        .addComponent(btnXoa)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CbbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTGBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnPDF))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CbbLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbbLoaiSPActionPerformed
        filterTableByProductType();
    }//GEN-LAST:event_CbbLoaiSPActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        addWarrantyPolicy();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        deleteWarrantyPolicy();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        updateWarrantyPolicy();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void TableCSBHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCSBHMouseClicked
        tableRowClicked(evt);
    }//GEN-LAST:event_TableCSBHMouseClicked

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }
            try {
                exportTableToPDF(TableCSBH, filePath);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(pnlWarrantyPolicy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPDFActionPerformed

    private void loadProductTypesIntoComboBox() {
        List<WarrantyPolicy> policies = warrantyPolicyService.getAllWarrantyPolicies();
        CbbLoaiSP.removeAllItems();
        CbbLoaiSP.addItem("Tất cả");
        Set<String> productTypes = new HashSet<>();
        for (WarrantyPolicy policy : policies) {
            productTypes.add(policy.getProductType());
        }
        for (String type : productTypes) {
            CbbLoaiSP.addItem(type);
        }
    }

    public void loadWarrantyPolicies() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Chính Sách");
        model.addColumn("Loại Sản Phẩm");
        model.addColumn("Mô Tả Chính Sách");
        model.addColumn("Thời Gian Bảo Hành (năm)");
        model.addColumn("Điều Kiện");

        List<WarrantyPolicy> policies = warrantyPolicyService.getAllWarrantyPolicies();

        for (WarrantyPolicy policy : policies) {
            model.addRow(new Object[]{
                policy.getPolicyId(),
                policy.getProductType(),
                policy.getPolicyDescription(),
                policy.getWarrantyDuration(),
                policy.getConditions()
            });
        }

        TableCSBH.setModel(model);
    }

    private void filterTableByProductType() {
        String selectedProductType = (String) CbbLoaiSP.getSelectedItem();
        if (selectedProductType == null) {
            return;
        }
        List<WarrantyPolicy> allPolicies = warrantyPolicyService.getAllWarrantyPolicies();
        DefaultTableModel model = (DefaultTableModel) TableCSBH.getModel();
        model.setRowCount(0);

        if (selectedProductType.equals("Tất cả")) {
            for (WarrantyPolicy policy : allPolicies) {
                model.addRow(new Object[]{
                    policy.getPolicyId(),
                    policy.getProductType(),
                    policy.getPolicyDescription(),
                    policy.getWarrantyDuration(),
                    policy.getConditions()
                });
            }
        } else {
            for (WarrantyPolicy policy : allPolicies) {
                if (policy.getProductType().equals(selectedProductType)) {
                    model.addRow(new Object[]{
                        policy.getPolicyId(),
                        policy.getProductType(),
                        policy.getPolicyDescription(),
                        policy.getWarrantyDuration(),
                        policy.getConditions()
                    });
                }
            }
        }
    }

    private void tableRowClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = TableCSBH.getSelectedRow();

        if (selectedRow != -1) {
            String policyId = TableCSBH.getValueAt(selectedRow, 0).toString();
            String productType = TableCSBH.getValueAt(selectedRow, 1).toString();
            String policyDescription = TableCSBH.getValueAt(selectedRow, 2).toString();
            int warrantyDuration = Integer.parseInt(TableCSBH.getValueAt(selectedRow, 3).toString());
            String conditions = TableCSBH.getValueAt(selectedRow, 4).toString();

            txtMaCS.setText(policyId);
            CbbLoaiSP.setSelectedItem(productType);
            txtDK.setText(conditions);
            txtTGBH.setText(String.valueOf(warrantyDuration));
        }
    }

    private void addWarrantyPolicy() {
        try {
            String policyId = txtMaCS.getText();
            String productType = (String) CbbLoaiSP.getSelectedItem();
            String description = txtDK.getText();
            int duration = Integer.parseInt(txtTGBH.getText());

            WarrantyPolicy newPolicy = new WarrantyPolicy(policyId, productType, description, duration, "Các điều kiện áp dụng");
            warrantyPolicyService.addWarrantyPolicy(newPolicy);

            loadWarrantyPolicies();
            clearForm();
            JOptionPane.showMessageDialog(this, "Thêm chính sách thành công!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi thêm chính sách: " + ex.getMessage());
        }
    }

    private void updateWarrantyPolicy() {
        try {
            String policyId = txtMaCS.getText();
            String productType = (String) CbbLoaiSP.getSelectedItem();
            String description = txtDK.getText();
            int duration = Integer.parseInt(txtTGBH.getText());

            WarrantyPolicy updatedPolicy = new WarrantyPolicy(policyId, productType, description, duration, "Các điều kiện áp dụng");
            warrantyPolicyService.updateWarrantyPolicy(updatedPolicy);

            loadWarrantyPolicies();
            clearForm();
            JOptionPane.showMessageDialog(this, "Cập nhật chính sách thành công!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật chính sách: " + ex.getMessage());
        }
    }

    private void deleteWarrantyPolicy() {
        try {
            String policyId = txtMaCS.getText();
            warrantyPolicyService.deleteWarrantyPolicy(policyId);
            int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa yêu cầu này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                loadWarrantyPolicies();
                clearForm();
                JOptionPane.showMessageDialog(this, "Xóa chính sách thành công!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi xóa chính sách: " + ex.getMessage());
        }
    }

    private void clearForm() {
        txtMaCS.setText("");
        txtTGBH.setText("");
        txtDK.setText("");
        CbbLoaiSP.setSelectedIndex(0);
    }

    public static void exportTableToPDF(JTable table, String filePath) throws FileNotFoundException {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
            BaseFont baseFont = BaseFont.createFont("c:/windows/fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font font = new Font(baseFont, 12, Font.NORMAL);
            PdfPTable pdfTable = new PdfPTable(table.getColumnCount());
            TableModel model = table.getModel();
            for (int col = 0; col < model.getColumnCount(); col++) {
                pdfTable.addCell(new PdfPCell(new Phrase(model.getColumnName(col), font)));
            }
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Object value = model.getValueAt(row, col);
                    if (value != null) {
                        pdfTable.addCell(new PdfPCell(new Phrase(value.toString(), font)));
                    } else {
                        pdfTable.addCell(new PdfPCell(new Phrase("", font)));
                    }
                }
            }
            document.add(pdfTable);
            JOptionPane.showMessageDialog(null, "Dữ liệu đã được xuất ra file PDF thành công!");
        } catch (DocumentException | FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất dữ liệu ra PDF: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khác: " + e.getMessage());
        } finally {
            if (document.isOpen()) {
                document.close();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbbLoaiSP;
    private javax.swing.JTable TableCSBH;
    private javax.swing.JButton btnPDF;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtDK;
    private javax.swing.JTextField txtMaCS;
    private javax.swing.JTextField txtTGBH;
    // End of variables declaration//GEN-END:variables
}
