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

        String query = "SELECT product_type, product_name FROM products";  
        ResultSet resultSet = session.execute(query);

        for (Row row : resultSet) {
            String productType = row.getString("product_type");
            String productName = row.getString("product_name");
            productTypesAndNames.add(new String[] { productType, productName });
        }

        return productTypesAndNames;
    }
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
    
    public List<Product> getProductByID(String product_ID) {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM products WHERE product_ID = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(product_ID);
        ResultSet resultSet = session.execute(boundStatement);
        for (Row row : resultSet) {
            products.add(new Product(
                    row.getString("product_id"),
                    row.getString("serial_number"),
                    row.getString("product_type"),
                    row.getString("product_name"),
                    row.getString("manufacturer"),
                    row.getLocalDate("purchase_date"),
                    row.getLocalDate("warranty_start_date"),
                    row.getLocalDate("warranty_end_date")
            ));
        }
        return products;
    }

    public List<String> getAllProducListID() {
        String query = "SELECT product_id FROM products";
        List<String> productIDs = new ArrayList<String>();
        try {
            ResultSet resultSet = session.execute(query);

            if (!resultSet.iterator().hasNext()) {
                System.out.println("Không có khách hàng nào được tìm thấy.");
                return productIDs; // Trả về danh sách rỗng nếu không có kết quả
            }

            for (Row row : resultSet) {
                productIDs.add(row.getString("product_id"));
            }
        } catch (Exception e) {
            System.err.println("Có lỗi xảy ra khi thực hiện truy vấn: " + e.getMessage());
            e.printStackTrace();
        }

        return productIDs; // Trả về danh sách customer_id
    }

    public List<Product> getProductByIDCustomer(String customer_ID) {
        List<Product> products = new ArrayList<>();
        String query1 = "SELECT product_id FROM customer_products WHERE customer_id = ?";
        PreparedStatement preparedStatement1 = session.prepare(query1);
        BoundStatement boundStatement1 = preparedStatement1.bind(customer_ID);
        ResultSet resultSet1 = session.execute(boundStatement1);

        // Lưu trữ các product_id vào danh sách
        List<String> productIds = new ArrayList<>();
        for (Row row : resultSet1) {
            productIds.add(row.getString("product_id"));
        }

        if (!productIds.isEmpty()) {
            // Tạo câu truy vấn với danh sách product_id
            StringBuilder query2 = new StringBuilder("SELECT * FROM products WHERE product_id IN (");
            for (int i = 0; i < productIds.size(); i++) {
                query2.append("?");
                if (i < productIds.size() - 1) {
                    query2.append(", ");
                }
            }
            query2.append(")");

            // Chuẩn bị câu lệnh truy vấn thứ hai
            PreparedStatement preparedStatement2 = session.prepare(query2.toString());
            BoundStatement boundStatement2 = preparedStatement2.bind(productIds.toArray());

            // Thực thi truy vấn
            ResultSet resultSet2 = session.execute(boundStatement2);

            // Thêm các sản phẩm vào danh sách
            for (Row row : resultSet2) {
                products.add(new Product(
                        row.getString("product_id"),
                        row.getString("serial_number"),
                        row.getString("product_type"),
                        row.getString("product_name"),
                        row.getString("manufacturer"),
                        row.getLocalDate("purchase_date"),
                        row.getLocalDate("warranty_start_date"),
                        row.getLocalDate("warranty_end_date")
                ));
            }
        }

        return products;
    }
    
    
}
