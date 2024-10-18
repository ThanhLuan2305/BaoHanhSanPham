/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template

 */


package View;

import Database.ConnectCassandra;
import Database.Service.RepairHistoryService;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;
import java.net.InetSocketAddress;
import javax.swing.table.DefaultTableModel;
import static Database.ConnectCassandra.createSession;
import Database.DAO.RepairHistoryDAO;
import Database.Service.ProductService;
import Model.Product;
import Model.RepairHistory; 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Database.Service.ProductService;
import Model.RepairHistory;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;




/**
 *
 * @author ACER
 */
public class pnlRepairHistory extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    private RepairHistoryService repairHistoryService;
    private ProductService productService;
    
    CqlSession cqlSession = createSession();
    public pnlRepairHistory() {
        initComponents();
        repairHistoryService = new RepairHistoryService(cqlSession);
        productService = new ProductService(cqlSession);
        loadAllRepairHistories();
        loadProductsToTable();    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRepairHistory = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSuaLich = new javax.swing.JButton();
        btnThemLich = new javax.swing.JButton();
        btnXoaLich = new javax.swing.JButton();
        txtMaSP = new javax.swing.JTextField();
        txtNgay = new javax.swing.JTextField();
        txtNoiDungSua = new javax.swing.JTextField();
        txtNguoiSua = new javax.swing.JTextField();
        txtMaPhieu = new javax.swing.JTextField();
        btnLoad = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbTiendo = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnTimMaPhieu = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnXuat = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblRepairHistory.setBackground(new java.awt.Color(255, 204, 204));
        tblRepairHistory.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblRepairHistory);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setForeground(new java.awt.Color(51, 255, 51));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LỊCH SỬA CHỮA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Mã sản phẩm :");

        jLabel3.setText("Mã phiếu sửa :");

        jLabel4.setText("Ngày :");

        jLabel5.setText("Vấn đề cần sửa :");

        jLabel6.setText("Người sửa :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("THAY ĐỔI LỊCH");

        btnSuaLich.setBackground(new java.awt.Color(255, 153, 0));
        btnSuaLich.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaLich.setText("Sửa lịch");
        btnSuaLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaLichActionPerformed(evt);
            }
        });

        btnThemLich.setBackground(new java.awt.Color(255, 153, 0));
        btnThemLich.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemLich.setText("Thêm lịch");
        btnThemLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemLichActionPerformed(evt);
            }
        });

        btnXoaLich.setBackground(new java.awt.Color(255, 153, 0));
        btnXoaLich.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaLich.setText("Xóa lịch");
        btnXoaLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaLichActionPerformed(evt);
            }
        });

        btnLoad.setBackground(new java.awt.Color(255, 153, 0));
        btnLoad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLoad.setText("LOAD");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        jLabel9.setText("Tiến độ :");

        cbTiendo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang xử lý", "Hoàn thành" }));
        cbTiendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTiendoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaPhieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnThemLich)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSuaLich)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoaLich)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLoad)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNguoiSua)
                                    .addComponent(txtNoiDungSua)
                                    .addComponent(cbTiendo, 0, 237, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel7)))
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNoiDungSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNguoiSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbTiendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuaLich)
                    .addComponent(btnXoaLich)
                    .addComponent(btnThemLich)
                    .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("TÌM KIẾM LỊCH");

        btnTimMaPhieu.setBackground(new java.awt.Color(255, 153, 0));
        btnTimMaPhieu.setText("NHẬP MÃ PHIẾU");
        btnTimMaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimMaPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTimMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Xuất Excel");

        btnXuat.setBackground(new java.awt.Color(255, 153, 0));
        btnXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXuat.setText("Xuất");
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnXuat)
                        .addGap(25, 25, 25))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSanPham.setBackground(new java.awt.Color(255, 204, 204));
        tblSanPham.setForeground(new java.awt.Color(255, 204, 204));
        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemLichActionPerformed
        try{
            //Lấy dữ liệu từ text
            String repairId = txtMaPhieu.getText().trim();
            String productId = txtMaSP.getText().trim();
            LocalDate repairDate = LocalDate.parse(txtNgay.getText().trim()); // Chuyển chuỗi sang LocalDate.
            String repairDescription = txtNoiDungSua.getText().trim();
            String technician = txtNguoiSua.getText().trim();
            String status = cbTiendo.getSelectedItem().toString().trim(); // Thêm trường nhập cho status
            
            //Kiểm tra dữ liệu đầu vào.
            if(repairId.isEmpty() || productId.isEmpty() || repairDescription.isEmpty() || technician.isEmpty()){
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Tạo đối tượng RepairHistory mới
            RepairHistory repairHistory = new RepairHistory(repairId, productId, repairDate, repairDescription, status, technician);
            
            //Gọi phương thức thêm từ RepairHistoryService
            repairHistoryService.addRepairHistory(repairHistory);
            //Thông báo thành công
            JOptionPane.showMessageDialog(this, "Thêm lịch thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            
           // Thêm trực tiếp vào bảng thay vì load lại toàn bộ
            Object[] rowData = {
                repairHistory.getRepairId(),
                repairHistory.getProductId(),
                repairHistory.getRepairDate(),
                repairHistory.getRepairDescription(),
                repairHistory.getTechnician()
        };
            tableModel.addRow(rowData); // Thêm dòng vào cuối bảng
           // Làm trắng các trường nhập sau khi thêm thành công
                txtMaPhieu.setText("");
                txtMaSP.setText("");
                txtNgay.setText("");
                txtNoiDungSua.setText("");
                cbTiendo.setSelectedIndex(0);
                txtNguoiSua.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thêm lịch sửa chữa: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemLichActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        //Lấy tất cả dữ liệu
        List<RepairHistory> repairHistories = repairHistoryService.getAllRepairHistories();
        
        //Sắp xếp danh sách tăng dần
        repairHistories.sort((r1, r2) -> r1.getRepairId().compareTo(r2.getRepairId()));
        //Tải dữ liệu lên bảng
        String[] columnNames = {"Repair ID", "Product ID", "Repair Date", "Repair Description","status", "Technician"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tblRepairHistory.setModel(tableModel);
        
        //Xóa dữ liệu cũ trên bảng
        tableModel.setRowCount(0);
        //Them dữ liệu đã sắp xếp vào bảng.
        
        for (RepairHistory repairHistory : repairHistories) {
            Object[] rowData = {
                repairHistory.getRepairId(),
                repairHistory.getProductId(),
                repairHistory.getRepairDate(),
                repairHistory.getRepairDescription(),
                repairHistory.getStatus(),
                repairHistory.getTechnician()
            };
            tableModel.addRow(rowData);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnXoaLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaLichActionPerformed
    // Lấy chỉ số của dòng hiện tại được chọn trong bảng
        int selectedRow = tblRepairHistory.getSelectedRow();

    // Kiểm tra xem có dòng nào được chọn không
         if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để xóa", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
    }

    // Lấy RepairID từ dòng đã chọn (giả sử RepairID nằm ở cột đầu tiên)
        String repairId = (String) tblRepairHistory.getValueAt(selectedRow, 0);

    // Xác nhận trước khi xóa
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa lịch sửa chữa này?", "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                // Xoá lịch sửa chữa từ database thông qua service
                repairHistoryService.deleteRepairHistory(repairId);

                // Thông báo thành công
                JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

                // Cập nhật lại bảng sau khi xoá
                loadAllRepairHistories();
            } catch (Exception e) {
                // Hiển thị thông báo lỗi nếu xảy ra lỗi
                JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi xóa: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
    }
    }//GEN-LAST:event_btnXoaLichActionPerformed

//Hàm click vào JTable hiện lên TextField
    
    
    
    private void btnSuaLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaLichActionPerformed
        try {
        // Lấy dữ liệu từ các TextField
        String repairId = txtMaPhieu.getText().trim();
        String productId = txtMaSP.getText().trim();
        LocalDate repairDate = LocalDate.parse(txtNgay.getText().trim());
        String repairDescription = txtNoiDungSua.getText().trim();
        String technician = txtNguoiSua.getText().trim();
        String status = cbTiendo.getSelectedItem().toString().trim();

        // Kiểm tra dữ liệu đầu vào
        if (repairId.isEmpty() || productId.isEmpty() || repairDescription.isEmpty() || status.isEmpty() || technician.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Tạo đối tượng RepairHistory mới để cập nhật
        RepairHistory updatedRepairHistory = new RepairHistory(repairId, productId, repairDate, repairDescription, status, technician);

        // Gọi phương thức cập nhật từ RepairHistoryService
        repairHistoryService.updateRepairHistory(updatedRepairHistory);
        
        // Thông báo thành công
        JOptionPane.showMessageDialog(this, "Cập nhật lịch sửa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

        // Tải lại tất cả lịch sử sửa chữa
        loadAllRepairHistories();

        // Làm trống các TextField
        clearTextFields();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi cập nhật lịch sửa: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnSuaLichActionPerformed

    private void btnTimMaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimMaPhieuActionPerformed
        String repairID = txtSearch.getText().trim();
        if(repairID.isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ID để tìm kiếm", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //Gọi phương thức tìm kiếm
        List<RepairHistory> repairHistories =  repairHistoryService.getRepairHistoryByRepairId(repairID);
        
        //Cập nhật kết quả tìm kiếm
        String[] columnNames = {"Mã phiếu sửa", "Mã sản phẩm", "Ngày sửa", "Vấn đề cần sửa","Tiến độ", "Người phụ trách"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tblRepairHistory.setModel(tableModel);
        tableModel.setRowCount(0);
        //Kiểm tra có kết quả hay không.
        if(repairHistories.isEmpty()){
            JOptionPane.showMessageDialog(this, "Không tìm thấy lịch sửa chữa nào!!!!!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            //Thêm dữ liệu tìm thấy vào bảng
            for (RepairHistory repairHistory : repairHistories) {
            Object[] rowData = {
                repairHistory.getRepairId(),
                repairHistory.getProductId(),
                repairHistory.getRepairDate(),
                repairHistory.getRepairDescription(),
                repairHistory.getStatus(),
                repairHistory.getTechnician()
            };
            tableModel.addRow(rowData);
            }
        }
    }//GEN-LAST:event_btnTimMaPhieuActionPerformed

    private void cbTiendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTiendoActionPerformed

    }//GEN-LAST:event_cbTiendoActionPerformed

    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file + ".csv"))) {
                // Xác định độ dài tối đa của các cột để căn chỉnh
                int maxRepairIdLength = "Mã Phiếu Sửa".length();
                int maxProductIdLength = "Mã Sản Phẩm".length();
                int maxRepairDateLength = "Ngày sửa".length();
                int maxRepairDescriptionLength = "Vấn đề cần sửa".length();
                int maxTechnicianLength = "Người phụ trách".length();
                int maxStatusLength = "Tiến độ".length();

                // Lặp qua các hàng trong bảng để tính độ dài lớn nhất của từng cột
                for (int i = 0; i < tblRepairHistory.getRowCount(); i++) {
                    maxRepairIdLength = Math.max(maxRepairIdLength, tblRepairHistory.getValueAt(i, 0).toString().length());
                    maxProductIdLength = Math.max(maxProductIdLength, tblRepairHistory.getValueAt(i, 1).toString().length());
                    maxRepairDateLength = Math.max(maxRepairDateLength, tblRepairHistory.getValueAt(i, 2).toString().length());
                    maxRepairDescriptionLength = Math.max(maxRepairDescriptionLength, tblRepairHistory.getValueAt(i, 3).toString().length());
                    maxTechnicianLength = Math.max(maxTechnicianLength, tblRepairHistory.getValueAt(i, 5).toString().length());
                    maxStatusLength = Math.max(maxStatusLength, tblRepairHistory.getValueAt(i, 4).toString().length());
                }

                // Ghi tiêu đề các cột với căn chỉnh bằng nhau
                bw.write(String.format("%-" + maxRepairIdLength + "s,%-" + maxProductIdLength + "s,%-" + maxRepairDateLength + "s,%-" 
                        + maxRepairDescriptionLength + "s,%-" + maxStatusLength + "s,%-" + maxTechnicianLength + "s",
                        "Mã Phiếu sửa", "Mã sản phẩm", "Ngày sửa", "Vấn đề cần sửa", "Tiến độ", "Người phụ trách"));
                bw.newLine();

                // Ghi dữ liệu từ bảng vào file CSV với căn chỉnh bằng nhau
                for (int i = 0; i < tblRepairHistory.getRowCount(); i++) {
                    String repairId = tblRepairHistory.getValueAt(i, 0).toString();
                    String productId = tblRepairHistory.getValueAt(i, 1).toString();
                    String repairDate = tblRepairHistory.getValueAt(i, 2).toString();
                    String repairDescription = tblRepairHistory.getValueAt(i, 3).toString();
                    String technician = tblRepairHistory.getValueAt(i, 5).toString();
                    String status = tblRepairHistory.getValueAt(i, 4).toString();

                    // Ghi dữ liệu với độ dài các cột bằng nhau
                    bw.write(String.format("%-" + maxRepairIdLength + "s,%-" + maxProductIdLength + "s,%-" + maxRepairDateLength + "s,%-" 
                            + maxRepairDescriptionLength + "s,%-" + maxStatusLength + "s,%-" + maxTechnicianLength + "s",
                            repairId, productId, repairDate, repairDescription, status, technician));
                    bw.newLine();
                }

                // Thông báo khi xuất file thành công
                JOptionPane.showMessageDialog(this, "Xuất file thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Lỗi khi xuất file: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnXuatActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
       
            hienThiProductId();
            updateRepairHistoryTableFromTextField();
    }//GEN-LAST:event_tblSanPhamMouseClicked
   
    private void clearTextFields() {
    txtMaPhieu.setText("");
    txtMaSP.setText("");
    txtNgay.setText("");
    txtNoiDungSua.setText("");
    txtNguoiSua.setText("");
    cbTiendo.setSelectedIndex(0);
}

    
    
    private void loadAllRepairHistories(){
        List<RepairHistory> repairHistories = repairHistoryService.getAllRepairHistories();
        String[] columnNames = {"Mã phiếu sửa", "Mã sản phẩm", "Ngày sửa", "Vấn đề cần sửa", "Tiến độ", "Người phụ trách"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tblRepairHistory.setModel(tableModel);
        tableModel.setRowCount(0); 
        for (RepairHistory repairHistory : repairHistories) {
            Object[] rowData = {
                repairHistory.getRepairId(),
                repairHistory.getProductId(),
                repairHistory.getRepairDate(),
                repairHistory.getRepairDescription(),
                repairHistory.getStatus(),
                repairHistory.getTechnician()
            };
            tableModel.addRow(rowData);
        }
        
        // Thêm sự kiện click vào JTable
        tblRepairHistory.addMouseListener(new java.awt.event.MouseAdapter() {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            int selectedRow = tblRepairHistory.getSelectedRow();  // Lấy chỉ số dòng được chọn

            // Kiểm tra xem có dòng nào được chọn không
            if (selectedRow >= 0) {
                // Lấy dữ liệu từ bảng và đổ vào các TextField
                txtMaPhieu.setText((String) tblRepairHistory.getValueAt(selectedRow, 0));
                txtMaSP.setText((String) tblRepairHistory.getValueAt(selectedRow, 1));
                txtNgay.setText(tblRepairHistory.getValueAt(selectedRow, 2).toString()); // Chuyển LocalDate thành chuỗi
                txtNoiDungSua.setText((String) tblRepairHistory.getValueAt(selectedRow, 3));
                cbTiendo.setSelectedItem(tblRepairHistory.getValueAt(selectedRow, 4));
                txtNguoiSua.setText((String) tblRepairHistory.getValueAt(selectedRow, 5));
            }
        }
    });
    }
    
    //Load dữ liệu lên bảng sản phẩm
       private void loadProductsToTable() {
            DefaultTableModel model =  new DefaultTableModel();
            model.addColumn("Mã sản phẩm");
            model.addColumn("Loại sản phẩm");
//            model.addColumn("Tên sản phẩm");
            List<Product> products = productService.getAllProducts();
            for (Product product : products){
                model.addRow(new Object []{
                    product.getProductId(),
                    product.getProductType(),
//                    product.getProductName()
                });
            }
            tblSanPham.setModel(model);
        }
       
       //Hàm hiển thị productID
        private void hienThiProductId(){
            int selectedRow = tblSanPham.getSelectedRow();
            if (selectedRow != -1) {  // Kiểm tra nếu có dòng được chọn
            String selectedProductId = (String) tblSanPham.getValueAt(selectedRow, 0); // Lấy giá trị cột "productId"
            txtMaSP.setText(selectedProductId); // Hiển thị productId vào ô text
    }
}
       
       //Liên kết dữ liệu
        private void updateRepairHistoryTableFromTextField() {
            String productIdInput = txtMaSP.getText().trim();  // Lấy giá trị từ txtMaSP

//            if (productIdInput != null && !productIdInput.isEmpty()) {  // Kiểm tra txtMaSP không rỗng
            // Lấy danh sách lịch sử sửa chữa từ service
            List<RepairHistory> repairHistories = repairHistoryService.getAllRepairHistories();

            // Cập nhật bảng tblRepairHistory
            DefaultTableModel model = (DefaultTableModel) tblRepairHistory.getModel();
            model.setRowCount(0);  // Xóa các dòng cũ trong bảng
            //Thiết lập lại dòng.
            model.setColumnIdentifiers(new Object[]{
                "Mã sản phẩm",
                "Ngày Sửa",
                "Vấn đề cần sửa",
                "Tiến độ",
                "Người phụ trách"
            });

            // Duyệt qua tất cả lịch sử sửa chữa
            for (RepairHistory repairHistory : repairHistories) {
                // So sánh productId từ RepairHistory với giá trị trong txtMaSP
                if (repairHistory.getProductId().equals(productIdInput)) {
                    // Nếu khớp, thêm dữ liệu vào bảng
                    model.addRow(new Object[]{
                        repairHistory.getProductId(),
                        repairHistory.getRepairDate(),
                        repairHistory.getRepairDescription(),
                        repairHistory.getStatus(),
                        repairHistory.getTechnician()
                    });
                }
            }   
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSuaLich;
    private javax.swing.JButton btnThemLich;
    private javax.swing.JButton btnTimMaPhieu;
    private javax.swing.JButton btnXoaLich;
    private javax.swing.JButton btnXuat;
    private javax.swing.JComboBox<String> cbTiendo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblRepairHistory;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtNguoiSua;
    private javax.swing.JTextField txtNoiDungSua;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
