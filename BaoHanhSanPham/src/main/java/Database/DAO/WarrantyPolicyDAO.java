/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.DAO;

import Model.WarrantyPolicy;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;
import java.util.ArrayList;
import java.util.List;

public class WarrantyPolicyDAO {

    private final CqlSession session;

    public WarrantyPolicyDAO(CqlSession session) {
        this.session = session;
    }
    // Thêm chính sách bảo hành mới

    public void addWarrantyPolicy(WarrantyPolicy policy) {
        String query = "INSERT INTO warranty_policies (policy_id, product_type, policy_description, warranty_duration, conditions) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                policy.getPolicyId(),
                policy.getProductType(),
                policy.getPolicyDescription(),
                policy.getWarrantyDuration(),
                policy.getConditions()
        );
        session.execute(boundStatement);
    }

    // Cập nhật chính sách bảo hành
    public void updateWarrantyPolicy(WarrantyPolicy policy) {
        String query = "UPDATE warranty_policies SET product_type = ?, policy_description = ?, warranty_duration = ?, conditions = ? WHERE policy_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                policy.getProductType(),
                policy.getPolicyDescription(),
                policy.getWarrantyDuration(),
                policy.getConditions(),
                policy.getPolicyId()
        );
        session.execute(boundStatement);
    }

    // Xóa chính sách bảo hành
    public void deleteWarrantyPolicy(String policyId) {
        String query = "DELETE FROM warranty_policies WHERE policy_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(policyId);
        session.execute(boundStatement);
    }

    // Lấy thông tin chi tiết của tất cả chính sách bảo hành
    public List<WarrantyPolicy> getAllWarrantyPolicies() {
        List<WarrantyPolicy> policies = new ArrayList<>();
        String query = "SELECT * FROM warranty_policies";
        ResultSet resultSet = session.execute(query);

        for (Row row : resultSet) {
            policies.add(new WarrantyPolicy(
                    row.getString("policy_id"),
                    row.getString("product_type"),
                    row.getString("policy_description"),
                    row.getInt("warranty_duration"),
                    row.getString("conditions")
            ));
        }
        return policies;
    }
    // Lấy thông tin chi tiết của một chính sách bảo hành theo policy_id
    public WarrantyPolicy getWarrantyPolicyById(String policyId) {
        String query = "SELECT * FROM warranty_policies WHERE policy_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(policyId);

        ResultSet resultSet = session.execute(boundStatement);
        if (resultSet.iterator().hasNext()) {
            Row row = resultSet.one();
            return new WarrantyPolicy(
                    row.getString("policy_id"),
                    row.getString("product_type"),
                    row.getString("policy_description"),
                    row.getInt("warranty_duration"),
                    row.getString("conditions")
            );
        }
        return null;
    }

}
