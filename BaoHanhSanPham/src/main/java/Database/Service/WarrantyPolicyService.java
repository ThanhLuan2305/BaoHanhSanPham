/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Model.WarrantyPolicy;
import Database.DAO.WarrantyPolicyDAO;
import com.datastax.oss.driver.api.core.CqlSession;
import java.util.List;

public class WarrantyPolicyService {

    private final WarrantyPolicyDAO warrantyPolicyDAO;

    public WarrantyPolicyService(CqlSession session) {
        this.warrantyPolicyDAO = new WarrantyPolicyDAO(session);
    }

    // Thêm chính sách bảo hành mới, kèm kiểm tra trùng lặp policy_id
    public void addWarrantyPolicy(WarrantyPolicy policy) {
        WarrantyPolicy existingPolicy = warrantyPolicyDAO.getWarrantyPolicyById(policy.getPolicyId());
        if (existingPolicy != null) {
            throw new IllegalArgumentException("Policy ID đã tồn tại.");
        }
        warrantyPolicyDAO.addWarrantyPolicy(policy);
    }

    // Cập nhật chính sách bảo hành hiện có
    public void updateWarrantyPolicy(WarrantyPolicy policy) {
        WarrantyPolicy existingPolicy = warrantyPolicyDAO.getWarrantyPolicyById(policy.getPolicyId());
        if (existingPolicy == null) {
            throw new IllegalArgumentException("Policy ID không tồn tại.");
        }
        warrantyPolicyDAO.updateWarrantyPolicy(policy);
    }

    // Xóa chính sách bảo hành
    public void deleteWarrantyPolicy(String policyId) {
        WarrantyPolicy existingPolicy = warrantyPolicyDAO.getWarrantyPolicyById(policyId);
        if (existingPolicy == null) {
            throw new IllegalArgumentException("Policy ID không tồn tại.");
        }
        warrantyPolicyDAO.deleteWarrantyPolicy(policyId);
    }

    // Lấy thông tin chi tiết của tất cả chính sách bảo hành
    public List<WarrantyPolicy> getAllWarrantyPolicies() {
        return warrantyPolicyDAO.getAllWarrantyPolicies();
    }

}
