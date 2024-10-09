package Database.DAO;

import Model.ExtendedWarranty;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.BoundStatement;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;


public class ExtendedWarrantyDAO {
    private final CqlSession session;

    public ExtendedWarrantyDAO(CqlSession session) {
        this.session = session;
    }

    // Thêm extended warranty
    public void addExtendedWarranty(ExtendedWarranty extendedWarranty) {
        String query = "INSERT INTO extended_warranty (extended_warranty_id, product_id, extension_fee, new_warranty_end_date) " +
                "VALUES (?, ?, ?, ?)";
        PreparedStatement prepared = session.prepare(query);
        BoundStatement bound = prepared.bind(
                extendedWarranty.getExtendedWarrantyId(),
                extendedWarranty.getProductId(),
                extendedWarranty.getExtensionFee(),
                extendedWarranty.getNewWarrantyEndDate()
        );
        session.execute(bound);
    }

    // Cập nhật extended warranty
    public void updateExtendedWarranty(ExtendedWarranty extendedWarranty) {
        String query = "UPDATE extended_warranty SET product_id = ?, extension_fee = ?, new_warranty_end_date = ? WHERE extended_warranty_id = ?";
        PreparedStatement prepared = session.prepare(query);
        BoundStatement bound = prepared.bind(
                extendedWarranty.getProductId(),
                extendedWarranty.getExtensionFee(),
                extendedWarranty.getNewWarrantyEndDate(),
                extendedWarranty.getExtendedWarrantyId()
        );
        session.execute(bound);
    }

    // Xóa extended warranty theo ID
    public void deleteExtendedWarranty(String extendedWarrantyId) {
        String query = "DELETE FROM extended_warranty WHERE extended_warranty_id = ?";
        PreparedStatement prepared = session.prepare(query);
        BoundStatement bound = prepared.bind(extendedWarrantyId);
        session.execute(bound);
    }

    public ExtendedWarranty getExtendedWarrantyById(String extendedWarrantyId) {
    String query = "SELECT * FROM extended_warranty WHERE extended_warranty_id = ?";
    PreparedStatement prepared = session.prepare(query);
    BoundStatement bound = prepared.bind(extendedWarrantyId);
    ResultSet resultSet = session.execute(bound);
    Row row = resultSet.one();

    if (row != null) {
        return new ExtendedWarranty(
                row.getString("extended_warranty_id"),
                row.getString("product_id"),
                row.getDouble("extension_fee"),  // Sử dụng getDouble cho kiểu double
                row.getLocalDate("new_warranty_end_date")
        );
    } else {
        return null; // Không tìm thấy bản ghi
    }
}

// Lấy tất cả extended warranties
    public List<ExtendedWarranty> getAllExtendedWarranties() {
        String query = "SELECT * FROM extended_warranty";
        ResultSet resultSet = session.execute(query);
        List<ExtendedWarranty> warranties = new ArrayList<>();

    for (Row row : resultSet) {
        ExtendedWarranty warranty = new ExtendedWarranty(
                row.getString("extended_warranty_id"),
                row.getString("product_id"),
                row.getDouble("extension_fee"),  // Sử dụng getDouble cho kiểu double
                row.getLocalDate("new_warranty_end_date")
        );
        warranties.add(warranty);
    }

    return warranties;
    }
}


