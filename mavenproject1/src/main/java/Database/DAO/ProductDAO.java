package Database.DAO;

import Model.Product;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

public class ProductDAO {
    private final CqlSession session;

    public ProductDAO(CqlSession session) {
        this.session = session;
    }

    // Thêm sản phẩm
    public void addProduct(Product product) {
        String query = "INSERT INTO products (product_id, serial_number, product_type, manufacturer, purchase_date, warranty_start_date, warranty_end_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
            product.getProductId(),
            product.getSerialNumber(),
            product.getProductType(),
            product.getManufacturer(),
            product.getPurchaseDate(),          // LocalDate
            product.getWarrantyStartDate(),     // LocalDate
            product.getWarrantyEndDate()        // LocalDate
        );
        session.execute(boundStatement);
    }

    // Cập nhật sản phẩm
    public void updateProduct(Product product) {
        String query = "UPDATE products SET serial_number = ?, product_type = ?, manufacturer = ?, purchase_date = ?, warranty_start_date = ?, warranty_end_date = ? WHERE product_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
            product.getSerialNumber(),
            product.getProductType(),
            product.getManufacturer(),
            product.getPurchaseDate(),          // LocalDate
            product.getWarrantyStartDate(),     // LocalDate
            product.getWarrantyEndDate(),       // LocalDate
            product.getProductId()
        );
        session.execute(boundStatement);
    }

    // Xóa sản phẩm
    public void deleteProduct(String productId) {
        String query = "DELETE FROM products WHERE product_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(productId);
        session.execute(boundStatement);
    }

    // Lấy tất cả sản phẩm
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM products";
        ResultSet resultSet = session.execute(query);
        for (Row row : resultSet) {
            products.add(new Product(
                row.getString("product_id"),
                row.getString("serial_number"),
                row.getString("product_type"),
                row.getString("manufacturer"),
                row.getLocalDate("purchase_date"),          
                row.getLocalDate("warranty_start_date"),     
                row.getLocalDate("warranty_end_date")        
            ));
        }
        return products;
    }

    // Lấy sản phẩm theo serial number
    public Product getProductBySerialNumber(String serialNumber) {
        String query = "SELECT * FROM products WHERE serial_number = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(serialNumber);
        ResultSet resultSet = session.execute(boundStatement);
        Row row = resultSet.one();
        if (row != null) {
            return new Product(
                row.getString("product_id"),
                row.getString("serial_number"),
                row.getString("product_type"),
                row.getString("manufacturer"),
                row.getLocalDate("purchase_date"),         
                row.getLocalDate("warranty_start_date"),     
                row.getLocalDate("warranty_end_date")        
            );
        }
        return null; 
    }
}
