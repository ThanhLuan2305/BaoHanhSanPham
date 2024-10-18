/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Database.DAO.ProductDAO;
import Model.Product;
import com.datastax.oss.driver.api.core.CqlSession;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ProductService {
    private final ProductDAO productDAO;

    public ProductService(CqlSession session) {
        this.productDAO = new ProductDAO(session);
    }

    // Thêm sản phẩm
    public void addProduct(Product product) {
        productDAO.addProduct(product);
    }

    // Cập nhật sản phẩm
    public void updateProduct(Product product) {
        productDAO.updateProduct(product);
    }

    // Xóa sản phẩm
    public void deleteProduct(String productId) {
        productDAO.deleteProduct(productId);
    }

    // Lấy tất cả sản phẩm
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    // Lấy sản phẩm theo số serial
    public Product getProductBySerialNumber(String serialNumber) {
        return productDAO.getProductBySerialNumber(serialNumber);
    }
    public List<Product> getProductByTypeProduct(String typeProduct) {
        return productDAO.getProductByTypeProduct(typeProduct);
    }

    public void exportProductsToCSV(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);

        CSVWriter csvWriter = new CSVWriter(fileWriter);

        String[] header = {"Mã Sản Phẩm", "Số Serial", "Tên Sản Phẩm", "Loại Sản Phẩm", "Nhà Sản Xuất", "Ngày Mua", "Ngày sản xuất", "Ngày hết hạn"};
        csvWriter.writeNext(header);

        List<Product> products = getAllProducts(); 
        for (Product product : products) {
            String[] productData = {
                product.getProductId(),
                product.getSerialNumber(),
                product.getProductName(),
                product.getProductType(),
                product.getManufacturer(),
                product.getPurchaseDate().toString(),
                product.getWarrantyStartDate().toString(),
                product.getWarrantyEndDate().toString()
            };
            csvWriter.writeNext(productData);
        }

        csvWriter.close();
        fileWriter.close();
    }
    public List<String[]>getProductTypesAndNames(){
        return productDAO.getProductTypesAndNames();
    }
}
