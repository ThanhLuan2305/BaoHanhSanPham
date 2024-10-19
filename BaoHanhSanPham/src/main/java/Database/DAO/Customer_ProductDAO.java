/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.DAO;

import Model.Customer_Product;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.BoundStatement;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import java.util.ArrayList;
import java.util.List;
import Model.Customer;
import Model.Product;

/**
 *
 * @author LENOVO
 */
public class Customer_ProductDAO {

    private final CqlSession session;

    public Customer_ProductDAO(CqlSession session) {
        this.session = session;
    }

    public List<Customer_Product> getAllCustomer_Products() {
        String query = "SELECT * FROM customer_products ";
        List<Customer_Product> customer_products = new ArrayList<>();
        ResultSet resultSet = session.execute(query);
        for (Row row : resultSet) {
            customer_products.add(new Customer_Product(
                    row.getString("customer_id"),
                    row.getString("product_id")
            ));
        }
        return customer_products;
    }

    // Thêm khách hàng
    public void addCustomer_Products(Customer_Product customer_Product) {
        String query = "INSERT INTO customer_products  (customer_id,product_id) VALUES (?, ?)";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                customer_Product.customer_id,
                customer_Product.product_id
        );
        session.execute(boundStatement);
    }

    // Cập nhật khách hàng 
    public void updateCustomer_Products(Customer_Product customer_Product) {
        String query = "UPDATE customer_products SET name = ?, address = ?, phone_number = ? WHERE customer_id = ?";

        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                customer_Product.customer_id,
                customer_Product.product_id
        );

        session.execute(boundStatement);
    }

    // Xóa sản phẩm
    public void deleteCustomer_Products(String customer_id) {
        String query = "DELETE FROM customer_products WHERE customer_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(customer_id);
        session.execute(boundStatement);
    }

    // Lấy khách hàng theo ID
    public Customer getCustomerByID(String customer_ID) {
        String query = "SELECT * FROM customers WHERE customer_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(customer_ID);
        ResultSet resultSet = session.execute(boundStatement);

        if (resultSet.iterator().hasNext()) {
            Row row = resultSet.one();
            return new Customer(
                    row.getString("customer_id"),
                    row.getString("name"),
                    row.getString("address"),
                    row.getString("phone_number")
            );
        }
        return null;
    }
//    Load dữ liệu vào combobox

    public List<String> getAllCustomerIDs() {
        String query = "SELECT customer_id FROM customers";
        List<String> customerIDs = new ArrayList<>();

        try {
            ResultSet resultSet = session.execute(query);

            // Kiểm tra xem có ít nhất một hàng trong ResultSet
            if (!resultSet.iterator().hasNext()) {
                System.out.println("Không có khách hàng nào được tìm thấy.");
                return customerIDs; // Trả về danh sách rỗng nếu không có kết quả
            }

            // Duyệt qua các hàng kết quả và chỉ lấy customer_id
            for (Row row : resultSet) {
                customerIDs.add(row.getString("customer_id")); // Lấy mỗi customer_id
            }
        } catch (Exception e) {
            System.err.println("Có lỗi xảy ra khi thực hiện truy vấn: " + e.getMessage());
            e.printStackTrace(); // In ra thông tin lỗi
        }

        return customerIDs; // Trả về danh sách customer_id
    }

}
