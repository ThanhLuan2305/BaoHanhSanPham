package Database.DAO;

import Model.RepairHistory;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepairHistoryDAO {
    private final CqlSession session;
    
    public RepairHistoryDAO(CqlSession session){
        this.session = session;
    }
    
    //Thêm lịch sửa chữa. 
    public void addRepairHistory(RepairHistory repairHistory){
        String query = "INSERT INTO repair_history (repair_id, product_id, repair_date, repair_description, status, technician) VALUES (?, ?, ? , ?, ?, ?)";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
                repairHistory.getRepairId(),
                repairHistory.getProductId(),
                repairHistory.getRepairDate(),
                repairHistory.getRepairDescription(),
                repairHistory.getStatus(),
                repairHistory.getTechnician()
        );
        session.execute(boundStatement); 
    }
    
    // Cập nhật lịch sử sửa chữa
    public void updateRepairHistory(RepairHistory repairHistory) {
        String query = "UPDATE repair_history SET product_id = ?, repair_date = ?, repair_description = ?, status = ?,technician = ? WHERE repair_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(
            repairHistory.getProductId(),
            repairHistory.getRepairDate(),          
            repairHistory.getRepairDescription(),
            repairHistory.getStatus(),
            repairHistory.getTechnician(),
            repairHistory.getRepairId()
        );
        session.execute(boundStatement);
    }
    
    // Xóa lịch sử sửa chữa
    public void deleteRepairHistory(String repairId) {
        String query = "DELETE FROM repair_history WHERE repair_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(repairId);
        session.execute(boundStatement);
    }

    // Lấy tất cả lịch sử sửa chữa
    public List<RepairHistory> getAllRepairHistories() {
        List<RepairHistory> repairHistories = new ArrayList<>();
        String query = "SELECT * FROM repair_history";
        ResultSet resultSet = session.execute(query);
        for (Row row : resultSet) {
            repairHistories.add(new RepairHistory(
                row.getString("repair_id"),
                row.getString("product_id"),
                row.getLocalDate("repair_date"),           
                row.getString("repair_description"),
                row.getString("status"),
                row.getString("technician")
            ));
        }
        return repairHistories;
    }

    // Lấy lịch sử sửa chữa theo repair_id
    public List<RepairHistory> getRepairHistoryByRepairId(String repairId) {
        List<RepairHistory> repairHistories = new ArrayList<>();
        String query = "SELECT * FROM repair_history WHERE repair_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(repairId);
        ResultSet resultSet = session.execute(boundStatement);
        for (Row row : resultSet) {
            repairHistories.add(new RepairHistory(
                row.getString("repair_id"),
                row.getString("product_id"),
                row.getLocalDate("repair_date"),
                row.getString("repair_description"),
                row.getString("status"),
                row.getString("technician")
            ));
        }
        return repairHistories;
    }

    public List<RepairHistory> getRepairHistoryByProductId(String productId) {
        List<RepairHistory> repairHistories = new ArrayList<>();
        String query = "SELECT * FROM repair_history WHERE product_id = ?";
        PreparedStatement preparedStatement = session.prepare(query);
        BoundStatement boundStatement = preparedStatement.bind(productId);
        ResultSet resultSet = session.execute(boundStatement);
        for (Row row : resultSet) {
            repairHistories.add(new RepairHistory(
                row.getString("repair_id"),
                row.getString("product_id"),
                row.getLocalDate("repair_date"),
                row.getString("repair_description"),
                row.getString("status"),
                row.getString("technician")
            ));
        }
        return repairHistories;
    }
     
}   
