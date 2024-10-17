/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Database.Service.ProductService;
import com.datastax.oss.driver.api.core.CqlSession;
import javax.swing.table.DefaultTableModel;
import static Database.ConnectCassandra.createSession;
import Database.Service.TypeProductService;
import Model.Product;
import Model.TypeProduct;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class pnlProduct extends javax.swing.JPanel {

    /**
     * Creates new form pnlProduct
     */
    private DefaultTableModel tableModel;
    private final ProductService productService;
    private final TypeProductService typeProductService;
    CqlSession cqlSession = createSession();
    public pnlProduct() {
        initComponents();
        productService = new ProductService(cqlSession);
        typeProductService = new TypeProductService(cqlSession);
        loadAllProducts();
        loadAllTypeProduct();
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
        tblProduct = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCSV = new javax.swing.JButton();
        cbbAscending = new javax.swing.JComboBox<>();
        cbbField = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductType = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProduct);

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Tìm kiếm");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Sản Phẩm");

        btnCSV.setText("Xuất CSV");
        btnCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVActionPerformed(evt);
            }
        });

        cbbAscending.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng", "Giảm" }));
        cbbAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbAscendingActionPerformed(evt);
            }
        });

        cbbField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại sản phẩm", "Nhà sản xuất", "Ngày mua", "Ngày sản xuất", "Ngáy hết hạn", "Tên sản phẩm" }));
        cbbField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbFieldActionPerformed(evt);
            }
        });

        tblProductType.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProductType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductTypeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductType);

        jLabel3.setText("Loại sản phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbAscending, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch)))))
                .addGap(0, 24, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbAscending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCSV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //tblProductType
    private void loadAllTypeProduct() {
        List<TypeProduct> typeproducts = typeProductService.getTypeProduct();
        String[] columnNames = {"Mã Sản Phẩm", "Mô Tả"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tblProductType.setModel(tableModel);
        tableModel.setRowCount(0); 
        for (TypeProduct tp : typeproducts) {
            Object[] rowData = {
                tp.getProductType(),
                tp.getDescription(),
            };
            tableModel.addRow(rowData);
        }
    }
    private void loadAllProducts() {
        List<Product> products = productService.getAllProducts();
        String[] columnNames = {"Mã Sản Phẩm", "Số Serial", "Tên Sản Phẩm", "Loại Sản Phẩm", "Nhà Sản Xuất", "Ngày Mua", "Ngãy sản xuất", "Ngày hết hạn"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tblProduct.setModel(tableModel);
        tableModel.setRowCount(0); 
        for (Product product : products) {
            Object[] rowData = {
                product.getProductId(),
                product.getSerialNumber(),
                product.getProductName(),
                product.getProductType(),
                product.getManufacturer(),
                product.getPurchaseDate(),
                product.getWarrantyStartDate(),
                product.getWarrantyEndDate()
            };
            tableModel.addRow(rowData);
        }
    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = txtSearch.getText();
        if(!search.equals("")) {
            Product product = productService.getProductBySerialNumber(txtSearch.getText());
            if(product == null ) {
                JOptionPane.showMessageDialog(this, "Không có sản phẩm phù hợp." , "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                String[] columnNames = {"Mã Sản Phẩm", "Số Serial", "Tên Sản Phẩm", "Loại Sản Phẩm", "Nhà Sản Xuất", "Ngày Mua", "Ngãy sản xuất", "Ngày hết hạn"};
                tableModel = new DefaultTableModel(columnNames, 0);
                tblProduct.setModel(tableModel);
                tableModel.setRowCount(0); 
                    Object[] rowData = {
                        product.getProductId(),
                        product.getSerialNumber(),
                        product.getProductName(),
                        product.getProductType(),
                        product.getManufacturer(),
                        product.getPurchaseDate(),
                        product.getWarrantyStartDate(),
                        product.getWarrantyEndDate()
                    };
                tableModel.addRow(rowData);
            }
        }
        else {
            loadAllProducts();
            JOptionPane.showMessageDialog(this, "Hãy điền Số serial để tìm kiếm." , "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save As");

        fileChooser.setSelectedFile(new File("SaoLuuSP.csv"));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "csv");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            if (!fileToSave.getAbsolutePath().endsWith(".csv")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".csv");
            }

            String filePath = fileToSave.getAbsolutePath();
            try {
                productService.exportProductsToCSV(filePath);
                JOptionPane.showMessageDialog(this, "Xuất file CSV thành công tại: " + filePath, "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Không thể xuất file: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Người dùng đã hủy bỏ việc lưu file." , "Hủy bỏ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCSVActionPerformed

    private void cbbFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbFieldActionPerformed
        
    }//GEN-LAST:event_cbbFieldActionPerformed

    private void cbbAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbAscendingActionPerformed
        // TODO add your handling code here:
        String field = cbbField.getSelectedItem().toString();
        boolean isAscending = cbbAscending.getSelectedItem().toString().equals("Tăng");

        List<Product> products = productService.getAllProducts();

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                int result = 0;
                switch (field) {
                    case "Loại sản phẩm":
                        result = p1.getProductType().compareTo(p2.getProductType());
                        break;
                    case "Tên sản phẩm":
                        result = p1.getProductName().compareTo(p2.getProductName());
                        break;
                    case "Nhà sản xuất":
                        result = p1.getManufacturer().compareTo(p2.getManufacturer());
                        break;
                    case "Ngày mua":
                        result = p1.getPurchaseDate().compareTo(p2.getPurchaseDate());
                        break;
                    case "Ngày sản xuất":
                        result = p1.getWarrantyStartDate().compareTo(p2.getWarrantyStartDate());
                        break;
                    case "Ngày hết hạn":
                        result = p1.getWarrantyEndDate().compareTo(p2.getWarrantyEndDate());
                        break;
                    default:
                        break;
                }
                return isAscending ? result : -result;
            }
        });
        updateProductTable(products);
    }//GEN-LAST:event_cbbAscendingActionPerformed

    private void tblProductTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductTypeMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblProductType.getSelectedRow();
    
        if (selectedRow != -1) {
            String selectedId = tblProductType.getValueAt(selectedRow, 0).toString();
            List<Product> prs = productService.getProductByTypeProduct(selectedId);
            updateProductTable(prs);
        }
    }//GEN-LAST:event_tblProductTypeMouseClicked
    private void updateProductTable(List<Product> products) {
        String[] columnNames = {"Mã Sản Phẩm", "Số Serial", "Tên Sản Phẩm", "Loại Sản Phẩm", "Nhà Sản Xuất", "Ngày Mua", "Ngày sản xuất", "Ngày hết hạn"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        tblProduct.setModel(tableModel);

        // Thêm từng sản phẩm vào bảng
        for (Product product : products) {
            Object[] rowData = {
                product.getProductId(),
                product.getSerialNumber(),
                product.getProductName(),
                product.getProductType(),
                product.getManufacturer(),
                product.getPurchaseDate(),
                product.getWarrantyStartDate(),
                product.getWarrantyEndDate()
            };
            tableModel.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCSV;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbbAscending;
    private javax.swing.JComboBox<String> cbbField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTable tblProductType;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
