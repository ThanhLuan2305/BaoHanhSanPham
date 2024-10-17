/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import static Database.ConnectCassandra.createSession;
import Database.Service.CustomerService;
import Database.Service.ProductService;
import Database.Service.WarrantyClaimService;
import Database.Service.WarrantyPolicyService;
import Model.Customer;
import Model.Product;
import Model.WarrantyClaim;
import Model.WarrantyPolicy;
import com.datastax.oss.driver.api.core.CqlSession;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author ADMIN
 */
public class pnlDashboard extends javax.swing.JPanel {

    /**
     * Creates new form pnlHome
     */
    CustomerService customerService;
    ProductService productService;
    WarrantyClaimService claimService;
    WarrantyPolicyService policyService;
    static List<WarrantyPolicy> lstPolicy = new ArrayList<>() ; 
    CqlSession cqlSession = createSession();
    public pnlDashboard() {
        initComponents();
        productService = new ProductService(cqlSession);
        customerService = new CustomerService(cqlSession);
        claimService = new WarrantyClaimService(cqlSession);
        policyService = new WarrantyPolicyService(cqlSession);
        List<Product>lstPr = productService.getAllProducts();
        List<Customer>lstCus = customerService.getAll();
        List<WarrantyClaim> lstClaim = claimService.getAllWarrantyClaims();
        txtSanPham.setText(lstPr.size()+"");
        txtSoKH.setText(lstCus.size()+"");
        txtSoYC.setText(lstClaim.size()+"");
        lstPolicy = policyService.getAllWarrantyPolicies();
        if (lstPolicy.isEmpty()) {
            System.out.println("Danh sách chính sách bảo hành rỗng!");
        } else {
            drawChart(pnlPolicy);
        }
        if (lstPolicy.isEmpty()) {
            System.out.println("Danh sách chính sách bảo hành rỗng!");
        } else {
            drawLineChart(pnlRepair);
        }
    }
    
    public static void drawChart(JPanel pnlPolicy) {
        DefaultCategoryDataset dataset = createDataset();

        JFreeChart barChart = ChartFactory.createBarChart(
                "BIỂU ĐỒ CHÍNH SÁCH BẢO HÀNH",
                "Loại sản phẩm",
                "Tháng",
                dataset
        );

        barChart.setBackgroundPaint(Color.white);
        barChart.getTitle().setFont(new Font("Arial", Font.BOLD, 18));

        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setRangeGridlinePaint(Color.white);
        plot.setDomainGridlinePaint(Color.white);

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setSeriesPaint(0, new Color(64, 224, 208));
        renderer.setDrawBarOutline(false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(690, 210));

        pnlPolicy.removeAll();
        pnlPolicy.setLayout(new BorderLayout());
        pnlPolicy.add(chartPanel, BorderLayout.CENTER);

        pnlPolicy.revalidate();
        pnlPolicy.repaint();
    }


    private static DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (WarrantyPolicy policy : lstPolicy) {
            dataset.addValue(policy.getWarrantyDuration(),  "Thời gian bảo hành", policy.getProductType());
        }

        return dataset;
    }
    
    public static void drawLineChart(JPanel pnlPolicy) {
        XYSeriesCollection dataset = createDatasetLineChart();

        JFreeChart lineChart = ChartFactory.createXYLineChart(
                "BIỂU ĐỒ CHÍNH SÁCH BẢO HÀNH",
                "Số lượng loại sản phẩm",
                "Tháng",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false 
        );

        lineChart.setBackgroundPaint(Color.white);
        lineChart.getTitle().setFont(new Font("Arial", Font.BOLD, 18));

        XYPlot plot = lineChart.getXYPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new Dimension(690, 210));

        pnlPolicy.removeAll();
        pnlPolicy.setLayout(new BorderLayout());
        pnlPolicy.add(chartPanel, BorderLayout.CENTER);

        pnlPolicy.revalidate();
        pnlPolicy.repaint();
    }

    private static XYSeriesCollection createDatasetLineChart() {
        XYSeriesCollection dataset = new XYSeriesCollection();

        Map<Integer, Integer> monthCountMap = new HashMap<>();

        for (WarrantyPolicy policy : lstPolicy) {
            int warrantyDuration = policy.getWarrantyDuration();
            monthCountMap.put(warrantyDuration, monthCountMap.getOrDefault(warrantyDuration, 0) + 1);
        }

        XYSeries series = new XYSeries("Tháng theo số lượng sản phẩm");

        for (Map.Entry<Integer, Integer> entry : monthCountMap.entrySet()) {
            int month = entry.getKey();
            int count = entry.getValue();
            series.add(count, month);
        }

        dataset.addSeries(series);

        return dataset;
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtSanPham = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSoKH = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtSoYC = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        pnlPolicy = new javax.swing.JPanel();
        pnlRepair = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(735, 610));

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 70));

        jSeparator1.setForeground(new java.awt.Color(0, 51, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Sản phẩm");

        txtSanPham.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txtSanPham.setForeground(new java.awt.Color(0, 51, 204));
        txtSanPham.setText("Null");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtSanPham))
                .addGap(0, 127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSanPham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 70));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Khách hàng");

        txtSoKH.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txtSoKH.setForeground(new java.awt.Color(51, 204, 0));
        txtSoKH.setText("Null");

        jSeparator2.setForeground(new java.awt.Color(51, 204, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSoKH))
                .addGap(0, 117, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoKH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(200, 0));

        txtSoYC.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        txtSoYC.setForeground(new java.awt.Color(255, 204, 0));
        txtSoYC.setText("Null");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Yêu cầu bảo hành");

        jSeparator3.setForeground(new java.awt.Color(255, 204, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtSoYC))
                .addGap(0, 78, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoYC))
        );

        javax.swing.GroupLayout pnlPolicyLayout = new javax.swing.GroupLayout(pnlPolicy);
        pnlPolicy.setLayout(pnlPolicyLayout);
        pnlPolicyLayout.setHorizontalGroup(
            pnlPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlPolicyLayout.setVerticalGroup(
            pnlPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlRepairLayout = new javax.swing.GroupLayout(pnlRepair);
        pnlRepair.setLayout(pnlRepairLayout);
        pnlRepairLayout.setHorizontalGroup(
            pnlRepairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlRepairLayout.setVerticalGroup(
            pnlRepairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlRepair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPolicy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(pnlPolicy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlRepair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel pnlPolicy;
    private javax.swing.JPanel pnlRepair;
    private javax.swing.JLabel txtSanPham;
    private javax.swing.JLabel txtSoKH;
    private javax.swing.JLabel txtSoYC;
    // End of variables declaration//GEN-END:variables
}
