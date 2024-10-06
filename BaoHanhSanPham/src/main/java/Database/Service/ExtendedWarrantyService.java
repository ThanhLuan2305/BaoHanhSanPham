/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Database.DAO.ExtendedWarrantyDAO;
import Model.ExtendedWarranty; // Đảm bảo đã có model ExtendedWarranty
import com.datastax.oss.driver.api.core.CqlSession;

import java.util.List;

public class ExtendedWarrantyService {
    private final ExtendedWarrantyDAO extendedWarrantyDAO;

    public ExtendedWarrantyService(CqlSession session) {
        this.extendedWarrantyDAO = new ExtendedWarrantyDAO(session);
    }

    // Thêm extended warranty
    public void addExtendedWarranty(ExtendedWarranty extendedWarranty) {
        extendedWarrantyDAO.addExtendedWarranty(extendedWarranty);
    }

    // Cập nhật extended warranty
    public void updateExtendedWarranty(ExtendedWarranty extendedWarranty) {
        extendedWarrantyDAO.updateExtendedWarranty(extendedWarranty);
    }

    // Xóa extended warranty
    public void deleteExtendedWarranty(String extendedWarrantyId) {
        extendedWarrantyDAO.deleteExtendedWarranty(extendedWarrantyId);
    }

    // Lấy tất cả extended warranty
    public List<ExtendedWarranty> getAllExtendedWarranties() {
        return extendedWarrantyDAO.getAllExtendedWarranties();
    }

    // Lấy extended warranty theo extended_warranty_id
    public ExtendedWarranty getExtendedWarrantyById(String extendedWarrantyId) {
        return extendedWarrantyDAO.getExtendedWarrantyById(extendedWarrantyId);
    }
}
