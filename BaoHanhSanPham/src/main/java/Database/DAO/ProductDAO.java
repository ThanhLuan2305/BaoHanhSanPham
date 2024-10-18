package Database.DAO;

import Model.Product;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private final CqlSession session;

    public ProductDAO(CqlSession session) {
        this.session = session;
    }

    // Thêm sản phẩm
    public void addProduct(Product product) {
        String query = "INSERT INTO products (product_id, serial_number, product_name, product_type, manufacturer, purchase_date, warranty_start_date, warranty_end_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
            product.getProductId(),
            product.getSerialNumber(),
            product.getProductName(),
            product.getProductType(),
            product.getManufacturer(),
            product.getPurchaseDate(),         
            product.getWarrantyStartDate(),    
            product.getWarrantyEndDate()       
        );
        session.execute(boundStatement);
    }

    // Cập nhật sản phẩm
    public void updateProduct(Product product) {
        String query = "UPDATE products SET serial_number = ?, product_name = ?,product_type = ?, manufacturer = ?, purchase_date = ?, warranty_start_date = ?, warranty_end_date = ? WHERE product_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
            product.getSerialNumber(),
            product.getProductName(),
            product.getProductType(),
            product.getManufacturer(),
            product.getPurchaseDate(),          
            product.getWarrantyStartDate(),    
            product.getWarrantyEndDate(),      
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
                row.getString("product_name"),
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
        String query = "SELECT * FROM products WHERE serial_number = ? ALLOW FILTERING";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(serialNumber);
        ResultSet resultSet = session.execute(boundStatement);
        Row row = resultSet.one();
        if (row != null) {
            return new Product(
                row.getString("product_id"),
                row.getString("serial_number"),
                row.getString("product_name"),
                row.getString("product_type"),
                row.getString("manufacturer"),
                row.getLocalDate("purchase_date"),          
                row.getLocalDate("warranty_start_date"),     
                row.getLocalDate("warranty_end_date")        
            );
        }
        return null; 
    }
    
        // Hàm lấy tất cả productType và productName từ bảng products
    public List<String[]> getProductTypesAndNames() {
        List<String[]> productTypesAndNames = new ArrayList<>();

        String query = "SELECT product_type, product_name FROM products";  // Truy vấn chỉ lấy 2 cột product_type và product_name
        ResultSet resultSet = session.execute(query);

        for (Row row : resultSet) {
            String productType = row.getString("product_type");
            String productName = row.getString("product_name");
            productTypesAndNames.add(new String[] { productType, productName });
        }

        return productTypesAndNames;
    public List<Product> getProductByTypeProduct(String typeProduct) {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM products WHERE product_type = ? ALLOW FILTERING";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(typeProduct);
        ResultSet resultSet = session.execute(boundStatement);
        for (Row row : resultSet) {
            products.add(new Product(
                row.getString("product_id"),
                row.getString("serial_number"),
                row.getString("product_name"),
                row.getString("product_type"),
                row.getString("manufacturer"),
                row.getLocalDate("purchase_date"),          
                row.getLocalDate("warranty_start_date"),     
                row.getLocalDate("warranty_end_date")        
            ));
        }
        return products;
    }
}
