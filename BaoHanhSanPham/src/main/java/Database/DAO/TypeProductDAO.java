/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.DAO;

import Model.TypeProduct;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ADMIN
 */
public class TypeProductDAO {
     private final CqlSession session;
     public TypeProductDAO(CqlSession session) {
        this.session = session;
    }
     public List<TypeProduct> getAllTypeProducts() {
        List<TypeProduct> tproducts = new ArrayList<>();
        String query = "SELECT * FROM products";
        ResultSet resultSet = session.execute(query);
        for (Row row : resultSet) {
            tproducts.add(new TypeProduct(
                row.getString("productType"),   
                row.getString("description")
            ));
        }
        return tproducts;
    }
}
