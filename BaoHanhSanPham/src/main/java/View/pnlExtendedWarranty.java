/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Database.Service.ExtendedWarrantyService;
import com.datastax.oss.driver.api.core.CqlSession;
import javax.swing.table.DefaultTableModel;
import static Database.ConnectCassandra.createSession;
import Database.Service.ExtendedWarrantyService;
import Model.ExtendedWarranty;
import java.time.LocalDate;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.TableModel;
/**
 *
 * @author ACER
 */
public class pnlExtendedWarranty extends javax.swing.JPanel {

    /**
     * Creates new form pnlExtendedWarranty
     */
    private DefaultTableModel tableModel;
    private ExtendedWarrantyService extendedWarrantyService;
    CqlSession cqlSession = createSession();
    public pnlExtendedWarranty() {
        extendedWarrantyService = new ExtendedWarrantyService(cqlSession);
        initComponents();
        loadAllExtendedWarrantíe();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGiaHanBaoHanh = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSearchMaBH = new javax.swing.JTextField();
        btnTimkiemBH = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMagiahan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMasanpham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhigiahan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNgayketthuc = new javax.swing.JTextField();
        btnThemBH = new javax.swing.JButton();
        btnLoadBH = new javax.swing.JButton();
        btnThemUpdate = new javax.swing.JButton();
        btnXoaBH = new javax.swing.JButton();
        btnXuatFile = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        tblGiaHanBaoHanh.setBackground(new java.awt.Color(242, 242, 242));
        tblGiaHanBaoHanh.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblGiaHanBaoHanh);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nhập mã gia hạn ");

        btnTimkiemBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimkiemBH.setText("TÌM KIẾM");
        btnTimkiemBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemBHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimkiemBH)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchMaBH, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchMaBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTimkiemBH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("THÔNG TIN");

        jLabel3.setText("Mã gia hạn :");

        jLabel6.setText("Mã sản phẩm :");

        jLabel4.setText("Phí gia hạn :");

        jLabel5.setText("Ngày kết thúc : ");

        btnThemBH.setBackground(new java.awt.Color(242, 242, 242));
        btnThemBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemBH.setText("THÊM");
        btnThemBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemBHActionPerformed(evt);
            }
        });

        btnLoadBH.setBackground(new java.awt.Color(242, 242, 242));
        btnLoadBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoadBH.setText("LOAD");
        btnLoadBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadBHActionPerformed(evt);
            }
        });

        btnThemUpdate.setBackground(new java.awt.Color(242, 242, 242));
        btnThemUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemUpdate.setText("UPDATE");
        btnThemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemUpdateActionPerformed(evt);
            }
        });

        btnXoaBH.setBackground(new java.awt.Color(242, 242, 242));
        btnXoaBH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaBH.setText("XÓA");
        btnXoaBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaBHActionPerformed(evt);
            }
        });

        btnXuatFile.setBackground(new java.awt.Color(242, 242, 242));
        btnXuatFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatFile.setText("Xuất file");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPhigiahan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNgayketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMagiahan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtMasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThemBH)
                        .addGap(18, 18, 18)
                        .addComponent(btnLoadBH)
                        .addGap(18, 18, 18)
                        .addComponent(btnThemUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaBH)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatFile)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMagiahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txtMasanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhigiahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNgayketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXuatFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemBH)
                        .addComponent(btnLoadBH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThemUpdate)
                        .addComponent(btnXoaBH)))
                .addGap(20, 20, 20))
        );

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("GIA HẠN BẢO HÀNH");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(123, 123, 123))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimkiemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemBHActionPerformed
    String warrantyId = txtSearchMaBH.getText().trim(); // Lấy mã bảo hành từ TextField

        // Kiểm tra xem mã bảo hành có rỗng không
        if (warrantyId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã bảo hành để tìm kiếm", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy tất cả dữ liệu từ dịch vụ
        List<ExtendedWarranty> extendedWarranties = extendedWarrantyService.getAllExtendedWarranties();

        // Tạo một danh sách để lưu kết quả tìm kiếm
        List<ExtendedWarranty> searchResults = new ArrayList<>();

        // Tìm kiếm bảo hành theo mã
        for (ExtendedWarranty extendedWarranty : extendedWarranties) {
            if (extendedWarranty.getExtendedWarrantyId().equalsIgnoreCase(warrantyId)) {
                searchResults.add(extendedWarranty);
            }
        }

        // Kiểm tra xem có kết quả nào không
        if (searchResults.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy bảo hành nào với mã: " + warrantyId, "Kết quả tìm kiếm", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Cập nhật bảng với kết quả tìm kiếm
        String[] columnNames = {"Mã gia hạn BH","Mã sản phẩm","Giá gia hạn","Ngày kết thúc GH mới"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tblGiaHanBaoHanh.setModel(tableModel);

        // Xóa dữ liệu cũ trên bảng
        tableModel.setRowCount(0);

        // Thêm kết quả tìm kiếm vào bảng
        for (ExtendedWarranty extendedWarranty : searchResults) {
            Object[] rowData = {
                extendedWarranty.getExtendedWarrantyId(),
                extendedWarranty.getProductId(),
                extendedWarranty.getExtensionFee(),
                extendedWarranty.getNewWarrantyEndDate()
            };
            tableModel.addRow(rowData);
        }
    }//GEN-LAST:event_btnTimkiemBHActionPerformed

    private void btnLoadBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadBHActionPerformed

        List<ExtendedWarranty> extendedWarranties = extendedWarrantyService.getAllExtendedWarranties();
        extendedWarranties.sort((ew1, ew2) -> ew1.getExtendedWarrantyId().compareTo(ew2.getExtendedWarrantyId()));

        String[] columnNames = {"Warranty ID", "Product ID", "Warranty Fee", "New Warranty End Date"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tblGiaHanBaoHanh.setModel(tableModel);

        // Xóa dữ liệu cũ trên bảng
        tableModel.setRowCount(0);

        // Thêm dữ liệu đã sắp xếp vào bảng
        for (ExtendedWarranty extendedWarranty : extendedWarranties) {
            Object[] rowData = {
                extendedWarranty.getExtendedWarrantyId(),
                extendedWarranty.getProductId(),
                extendedWarranty.getExtensionFee(),
                extendedWarranty.getNewWarrantyEndDate()
            };
            tableModel.addRow(rowData);
        }
    }//GEN-LAST:event_btnLoadBHActionPerformed

    private void btnXoaBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBHActionPerformed
        try {
            // Lấy chỉ số dòng được chọn
            int selectedRow = tblGiaHanBaoHanh.getSelectedRow();

            // Kiểm tra xem có dòng nào được chọn không
            if (selectedRow >= 0) {
                // Lấy Warranty ID từ dòng đã chọn
                String warrantyId = (String) tblGiaHanBaoHanh.getValueAt(selectedRow, 0); // Giả sử Warranty ID là cột đầu tiên

                // Gọi phương thức xóa từ ExtendedWarrantyService
                extendedWarrantyService.deleteExtendedWarranty(warrantyId);

                // Thông báo thành công
                JOptionPane.showMessageDialog(this, "Xóa bảo hành thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                // Xóa dòng khỏi bảng
                tableModel.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xóa bảo hành: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnXoaBHActionPerformed

    private void btnThemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemUpdateActionPerformed
        try {
            // Lấy chỉ số dòng được chọn
            int selectedRow = tblGiaHanBaoHanh.getSelectedRow();

            // Kiểm tra xem có dòng nào được chọn không
            if (selectedRow >= 0) {
                // Lấy dữ liệu từ bảng
                String warrantyId = (String) tblGiaHanBaoHanh.getValueAt(selectedRow, 0); // Giả sử Warranty ID là cột đầu tiên

                // Lấy dữ liệu từ các TextField
                String productId = txtMasanpham.getText().trim();
                double warrantyFee = Double.parseDouble(txtPhigiahan.getText().trim()); // Chuyển chuỗi sang double
                LocalDate expirationDate = LocalDate.parse(txtNgayketthuc.getText().trim()); // Chuyển chuỗi sang LocalDate

                // Kiểm tra dữ liệu đầu vào
                if (productId.isEmpty() || txtPhigiahan.getText().trim().isEmpty() || txtNgayketthuc.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Tạo đối tượng ExtendedWarranty mới với dữ liệu cập nhật
                ExtendedWarranty updatedWarranty = new ExtendedWarranty(warrantyId, productId, warrantyFee, expirationDate);

                // Gọi phương thức cập nhật từ ExtendedWarrantyService
                extendedWarrantyService.updateExtendedWarranty(updatedWarranty);

                // Cập nhật dữ liệu trong bảng
                tblGiaHanBaoHanh.setValueAt(updatedWarranty.getExtendedWarrantyId(), selectedRow, 0);
                tblGiaHanBaoHanh.setValueAt(updatedWarranty.getProductId(), selectedRow, 1);
                tblGiaHanBaoHanh.setValueAt(updatedWarranty.getExtensionFee(), selectedRow, 2);
                tblGiaHanBaoHanh.setValueAt(updatedWarranty.getNewWarrantyEndDate(), selectedRow, 3);

                // Thông báo thành công
                JOptionPane.showMessageDialog(this, "Cập nhật bảo hành thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                // Làm trắng các trường nhập sau khi cập nhật thành công
                txtMagiahan.setText("");
                txtMasanpham.setText("");
                txtPhigiahan.setText("");
                txtNgayketthuc.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa", "Thông báo", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi cập nhật bảo hành: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemUpdateActionPerformed

    private void btnThemBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemBHActionPerformed
        // TODO add your handling code here:
        try {
            // Lấy dữ liệu từ các TextField
            String warrantyId = txtMagiahan.getText().trim();
            String productId = txtMasanpham.getText().trim();
            double warrantyFee = Double.parseDouble(txtPhigiahan.getText().trim()); // Chuyển chuỗi sang double
            LocalDate expirationDate = LocalDate.parse(txtNgayketthuc.getText().trim()); // Chuyển chuỗi sang LocalDate

            // Kiểm tra dữ liệu đầu vào
            if (warrantyId.isEmpty() || productId.isEmpty() || txtPhigiahan.getText().trim().isEmpty() || txtNgayketthuc.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Tạo đối tượng ExtendedWarranty mới
            ExtendedWarranty extendedWarranty = new ExtendedWarranty(warrantyId, productId, warrantyFee, expirationDate);

            // Gọi phương thức thêm từ ExtendedWarrantyService
            extendedWarrantyService.addExtendedWarranty(extendedWarranty);

            // Thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm bảo hành thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            // Thêm trực tiếp vào bảng thay vì load lại toàn bộ
            Object[] rowData = {
                extendedWarranty.getExtendedWarrantyId(),
                extendedWarranty.getProductId(),
                extendedWarranty.getExtensionFee(),
                extendedWarranty.getNewWarrantyEndDate(),
            };
            tableModel.addRow(rowData); // Thêm dòng vào cuối bảng

            // Làm trắng các trường nhập sau khi thêm thành công
            txtMagiahan.setText("");
            txtMasanpham.setText("");
            txtPhigiahan.setText("");
            txtNgayketthuc.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thêm bảo hành: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemBHActionPerformed

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        // Chọn vị trí để lưu file Excel
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Chọn vị trí lưu file Excel");
    
    int userSelection = fileChooser.showSaveDialog(null);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        // Lấy đường dẫn file được chọn và thêm đuôi .xlsx
        String filePath = fileChooser.getSelectedFile().getAbsolutePath();
        if (!filePath.endsWith(".xlsx")) {
            filePath += ".xlsx";
        }
        
        try (Workbook workbook = new XSSFWorkbook()) { // Tạo một workbook mới
            Sheet sheet = workbook.createSheet("Extended Warranty Data"); // Tạo sheet mới
            
            // Lấy model của JTable
            TableModel model = tblGiaHanBaoHanh.getModel();
            
            // Ghi tiêu đề cột vào dòng đầu tiên
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < model.getColumnCount(); i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(model.getColumnName(i));
            }
            
            // Ghi dữ liệu từ JTable vào file Excel
            for (int row = 0; row < model.getRowCount(); row++) {
                Row excelRow = sheet.createRow(row + 1);
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Cell cell = excelRow.createCell(col);
                    cell.setCellValue(model.getValueAt(row, col).toString());
                }
            }
            
            // Căn chỉnh các cột để vừa với nội dung
            for (int i = 0; i < model.getColumnCount(); i++) {
                // Tự động căn chỉnh độ rộng của các cột dựa trên dữ liệu
                sheet.autoSizeColumn(i);
            }
            
            // Ghi file ra đĩa
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
                JOptionPane.showMessageDialog(null, "Xuất dữ liệu thành công ra file Excel", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xuất dữ liệu: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnXuatFileActionPerformed


    private void loadAllExtendedWarrantíe(){
        //Lấy all dữ liệu từ dịch vụ
        List<ExtendedWarranty> warranties = extendedWarrantyService.getAllExtendedWarranties();
        //Đặt tên cho bảng
        String[] columnNames = {"Mã gia hạn BH","Mã sản phẩm","Giá gia hạn","Ngày kết thúc GH mới"};
        //Khởi tạo tên cột 
        tableModel = new DefaultTableModel(columnNames, 0);
        //Gán model cho Jtable
        tblGiaHanBaoHanh.setModel(tableModel);
       //Xóa hàng cũ trong bảng 
       tableModel.setRowCount(0);
       //Duyệt qua dữ liệu và thêm vào bảng tương ứng với cột
        for(ExtendedWarranty warranty : warranties) {
            Object[] rowData = {
                warranty.getExtendedWarrantyId(),
                warranty.getProductId(),
                warranty.getExtensionFee(),
                warranty.getNewWarrantyEndDate()
            };
            //Thêm hàng mới vào model 
            tableModel.addRow(rowData);
        }       
        tblGiaHanBaoHanh.addMouseListener(new java.awt.event.MouseAdapter(){
            public void  mouseClicked(java.awt.event.MouseEvent evt){
                int selectedRow = tblGiaHanBaoHanh.getSelectedRow();
                if(selectedRow >= 0){
                    txtMagiahan.setText((String) tblGiaHanBaoHanh.getValueAt(selectedRow, 0));
                    txtMasanpham.setText((String) tblGiaHanBaoHanh.getValueAt(selectedRow, 1));
                    txtPhigiahan.setText(String.valueOf(tblGiaHanBaoHanh.getValueAt(selectedRow, 2))); // Chuyển số thành chuỗi
                    txtNgayketthuc.setText(tblGiaHanBaoHanh.getValueAt(selectedRow, 3).toString()); // Chuyển LocalDate thành chuỗi
                }
            }
        });
       
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoadBH;
    private javax.swing.JButton btnThemBH;
    private javax.swing.JButton btnThemUpdate;
    private javax.swing.JButton btnTimkiemBH;
    private javax.swing.JButton btnXoaBH;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGiaHanBaoHanh;
    private javax.swing.JTextField txtMagiahan;
    private javax.swing.JTextField txtMasanpham;
    private javax.swing.JTextField txtNgayketthuc;
    private javax.swing.JTextField txtPhigiahan;
    private javax.swing.JTextField txtSearchMaBH;
    // End of variables declaration//GEN-END:variables
}
