/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Database.DAO.TypeProductDAO;
import Model.TypeProduct;
import com.datastax.oss.driver.api.core.CqlSession;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TypeProductService {
    private final TypeProductDAO typeProductDAO;

    public TypeProductService(CqlSession session) {
        this.typeProductDAO = new TypeProductDAO(session);
    }
    public List<TypeProduct> getTypeProduct() {
        return typeProductDAO.getAllTypeProducts();
    }
}
