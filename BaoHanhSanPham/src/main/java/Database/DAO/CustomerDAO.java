/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.DAO;

import Model.Customer;
import Model.Product;
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


    // Xóa sản phẩm
    public void deleteCustomer(String customer_id) {
        String query = "DELETE FROM customers WHERE customer_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(customer_id);
        session.execute(boundStatement);
    }
}
