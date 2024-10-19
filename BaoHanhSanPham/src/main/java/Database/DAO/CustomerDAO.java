/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.DAO;

import Model.Customer;
import Model.Product;
import Model.WarrantyClaim;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.BoundStatement;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CustomerDAO {

    private final CqlSession session;

    public CustomerDAO(CqlSession session) {
        this.session = session;
    }

    public List<Customer> getAllCsCustomers() {
        String query = "SELECT * FROM customers";
        List<Customer> customers = new ArrayList<>();
        ResultSet resultSet = session.execute(query);
        for (Row row : resultSet) {
            customers.add(new Customer(
                    row.getString("customer_id"),
                    row.getString("name"),
                    row.getString("address"),
                    row.getString("phone_number")
            ));
        }
        return customers;
    }

    // Thêm khách hàng
    public void addCustomer(Customer customer) {
        String query = "INSERT INTO customers (customer_id, name, address, phone_number) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                customer.customer_id,
                customer.name,
                customer.address,
                customer.phone_number
        );
        session.execute(boundStatement);
    }

    // Cập nhật khách hàng 
    public void updateCustomer(Customer customer) {
        String query = "UPDATE customers SET name = ?, address = ?, phone_number = ? WHERE customer_id = ?";

        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                customer.name,
                customer.address,
                customer.phone_number,
                customer.customer_id// Chỉ định customer_id như điều kiện WHERE
        );
        session.execute(boundStatement);
    }
//    Hàm update khách theo ID

    public Customer updateCustomerByID(String newName, String customerID) {

        // Truy vấn lại thông tin khách hàng đã cập nhật
        String query2 = "SELECT customer_id, name, address, phone_number FROM customers WHERE customer_id = ?";
        PreparedStatement selectStatement = session.prepare(query2);
        BoundStatement selectBoundStatement = selectStatement.bind(customerID);
        ResultSet resultSet = session.execute(selectBoundStatement);

        // Kiểm tra nếu khách hàng tồn tại
        if (resultSet.iterator().hasNext()) {
            Row row = resultSet.one();

            // Lấy các giá trị hiện tại của các trường khác (address, phone_number)
            String currentAddress = row.getString("address");
            String currentPhoneNumber = row.getString("phone_number");

            // Cập nhật chỉ tên khách hàng
            String updateQuery = "UPDATE customers SET name = ? WHERE customer_id = ?";
            PreparedStatement updateStatement = session.prepare(updateQuery);
            BoundStatement updateBoundStatement = updateStatement.bind(newName, customerID);
            session.execute(updateBoundStatement);

            // Trả về đối tượng Customer đã cập nhật với tên mới và các trường khác giữ nguyên
            return new Customer(
                    row.getString("customer_id"),
                    newName, // Tên đã được cập nhật
                    currentAddress, // Giữ nguyên address hiện tại
                    currentPhoneNumber // Giữ nguyên phone_number hiện tại
            );
        }

        return null; // Trường hợp không tìm thấy khách hàng
    }

    // Xóa sản phẩm
    public void deleteCustomer(String customer_id) {
        String query = "DELETE FROM customers WHERE customer_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(customer_id);
        session.execute(boundStatement);
    }

    public Customer getCustomerById(String customerID) {
        String query = "SELECT * FROM customers WHERE customer_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(customerID);
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

    public List<String> getAllCustomerIDs() {
        String query = "SELECT customer_id FROM customers";
        List<String> customerIDs = new ArrayList<String>();
        try {
            ResultSet resultSet = session.execute(query);

            if (!resultSet.iterator().hasNext()) {
                System.out.println("Không có khách hàng nào được tìm thấy.");
                return customerIDs; // Trả về danh sách rỗng nếu không có kết quả
            }

            for (Row row : resultSet) {
                customerIDs.add(row.getString("customer_id"));
            }
        } catch (Exception e) {
            System.err.println("Có lỗi xảy ra khi thực hiện truy vấn: " + e.getMessage());
            e.printStackTrace();
        }

        return customerIDs; // Trả về danh sách customer_id
    }

}
