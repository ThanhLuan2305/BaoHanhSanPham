/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Model.WarrantyClaim;
import Database.DAO.WarrantyClaimDAO;
import com.datastax.oss.driver.api.core.CqlSession;
import java.util.List;

public class WarrantyClaimService {

    private final WarrantyClaimDAO warrantyClaimDAO;

    public WarrantyClaimService(CqlSession session) {
        this.warrantyClaimDAO = new WarrantyClaimDAO(session);
    }

    // Thêm yêu cầu bảo hành
    public void submitWarrantyClaim(WarrantyClaim claim) {
        if (claim.getCustomerId() == null || claim.getProductId() == null || claim.getIssueDescription() == null) {
            throw new IllegalArgumentException("Thông tin không hợp lệ!");
        }
        warrantyClaimDAO.addWarrantyClaim(claim);
    }

    // Cập nhật yêu cầu bảo hành
    public void updateWarrantyClaim(WarrantyClaim claim) {
        WarrantyClaim existingClaim = warrantyClaimDAO.getWarrantyClaimById(claim.getClaimId());
        if (existingClaim == null) {
            throw new IllegalArgumentException("Claim ID không tồn tại.");
        }
        warrantyClaimDAO.updateWarrantyClaim(claim);
    }

    // Xóa yêu cầu bảo hành
    public void deleteWarrantyClaim(String claimId) {
        WarrantyClaim existingClaim = warrantyClaimDAO.getWarrantyClaimById(claimId);
        if (existingClaim == null) {
            throw new IllegalArgumentException("Claim ID không tồn tại.");
        }
        warrantyClaimDAO.deleteWarrantyClaim(claimId);
    }

    // Lấy tất cả yêu cầu bảo hành
    public List<WarrantyClaim> getAllWarrantyClaims() {
        return warrantyClaimDAO.getAllWarrantyClaims();
    }
}
