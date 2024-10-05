/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.DAO;

import Model.WarrantyClaim;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author nganh
 */
public class WarrantyClaimDAO {

    private final CqlSession session;

    public WarrantyClaimDAO(CqlSession session) {
        this.session = session;
    }

    // Thêm yêu cầu bảo hành
    public void addWarrantyClaim(WarrantyClaim claim) {
        String query = "INSERT INTO warranty_claims (claim_id, customer_id, product_id, claim_date, issue_description, claim_status) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(claim.getClaimId(), claim.getCustomerId(),
                claim.getProductId(), claim.getClaimDate(), claim.getIssueDescription(), claim.getClaimStatus());
        session.execute(boundStatement);
    }

    // Cập nhật yêu cầu bảo hành
    public void updateWarrantyClaim(WarrantyClaim claim) {
        String query = "UPDATE warranty_claims SET customer_id = ?, product_id = ?, claim_date = ?, issue_description = ?, claim_status = ? WHERE claim_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                claim.getCustomerId(),
                claim.getProductId(),
                claim.getClaimDate(),
                claim.getIssueDescription(),
                claim.getClaimStatus(),
                claim.getClaimId()
        );
        session.execute(boundStatement);
    }

    // Xóa yêu cầu bảo hành
    public void deleteWarrantyClaim(String claimId) {
        String query = "DELETE FROM warranty_claims WHERE claim_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(claimId);
        session.execute(boundStatement);
    }

    // Lấy tất cả yêu cầu bảo hành
    public List<WarrantyClaim> getAllWarrantyClaims() {
        List<WarrantyClaim> claims = new ArrayList<>();
        String query = "SELECT * FROM warranty_claims";
        ResultSet resultSet = session.execute(query);
        for (Row row : resultSet) {
            claims.add(new WarrantyClaim(
                    row.getString("claim_id"),
                    row.getString("customer_id"),
                    row.getString("product_id"),
                    row.getLocalDate("claim_date"),
                    row.getString("issue_description"),
                    row.getString("claim_status")
            ));
        }
        return claims;
    }

    // Lấy yêu cầu bảo hành theo ID
    public WarrantyClaim getWarrantyClaimById(String claimId) {
        String query = "SELECT * FROM warranty_claims WHERE claim_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(claimId);
        ResultSet resultSet = session.execute(boundStatement);

        if (resultSet.iterator().hasNext()) {
            Row row = resultSet.one();
            return new WarrantyClaim(
                    row.getString("claim_id"),
                    row.getString("customer_id"),
                    row.getString("product_id"),
                    row.getLocalDate("claim_date"),
                    row.getString("issue_description"),
                    row.getString("claim_status")
            );
        }
        return null;
    }
}
