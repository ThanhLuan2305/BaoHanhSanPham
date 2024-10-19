/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Database.DAO.CustomerDAO;
import Model.Customer;
import com.datastax.oss.driver.api.core.CqlSession;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CustomerService {

    private final CustomerDAO customerDAO;

    public CustomerService(CqlSession session) {
        this.customerDAO = new CustomerDAO(session);
    }

    public List<Customer> getAll() {
        return customerDAO.getAllCsCustomers();
    }
    // Thêm sản phẩm

    public void addCustomer(Customer customer) {
        customerDAO.addCustomer(customer);
    }

    // Cập nhật sản phẩm
    public void updateCustomer(Customer customer) {
        customerDAO.updateCustomer(customer);
    }

    //Cập nhật khách hàng theo ID
    public void updateCustomerByID(String newName, String customerID) {
        customerDAO.updateCustomerByID(newName, customerID);
    }

    // Xóa sản phẩm
    public void deleteCustomer(String customerId) {
        customerDAO.deleteCustomer(customerId);
    }

    public Customer getCustomerById(String customerID) {
        return customerDAO.getCustomerById(customerID);

    }

    public List<String> getAllCustomerIDs() {
        return customerDAO.getAllCustomerIDs();
    }

}
