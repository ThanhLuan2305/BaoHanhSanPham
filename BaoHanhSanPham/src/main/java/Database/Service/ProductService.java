/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Database.DAO.ProductDAO;
import Model.Product;
import com.datastax.oss.driver.api.core.CqlSession;

import java.util.Date;
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
}
