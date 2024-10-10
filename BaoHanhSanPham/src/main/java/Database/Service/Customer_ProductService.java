/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;
import Database.DAO.Customer_ProductDAO;
import Model.Customer_Product;
import com.datastax.oss.driver.api.core.CqlSession;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Customer_ProductService {
    private final Customer_ProductDAO customer_ProductDAO;
    
    public Customer_ProductService(CqlSession session) {
        this.customer_ProductDAO = new Customer_ProductDAO(session);
    }
    
    public List<Customer_Product> getAll() {
        return customer_ProductDAO.getAllCustomer_Products();
    }
       // Thêm sản phẩm
    public void addCustomer_Product(Customer_Product customer_Product) {
        customer_ProductDAO.addCustomer_Products(customer_Product);
    }

    // Cập nhật sản phẩm
    public void updateCustomer_Product(Customer_Product customer_Product) {
        customer_ProductDAO.updateCustomer_Products(customer_Product);
    }

    // Xóa sản phẩm
    public void deleteCustomer_Product(String customerId) {
        customer_ProductDAO.deleteCustomer_Products(customerId);
    }
}
