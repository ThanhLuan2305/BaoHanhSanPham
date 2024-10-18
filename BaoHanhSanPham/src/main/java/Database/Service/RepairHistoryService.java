/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database.Service;

import Database.DAO.RepairHistoryDAO;
import Model.RepairHistory; // Đảm bảo đã có model RepairHistory
import com.datastax.oss.driver.api.core.CqlSession;

import java.util.List;

public class RepairHistoryService {
    private final RepairHistoryDAO repairHistoryDAO;

    public RepairHistoryService(CqlSession session) {
        this.repairHistoryDAO = new RepairHistoryDAO(session);
    }

    // Thêm lịch sử sửa chữa
    public void addRepairHistory(RepairHistory repairHistory) {
        repairHistoryDAO.addRepairHistory(repairHistory);
    }

    // Cập nhật lịch sử sửa chữa
    public void updateRepairHistory(RepairHistory repairHistory) {
        repairHistoryDAO.updateRepairHistory(repairHistory);
    }

    // Xóa lịch sử sửa chữa
    public void deleteRepairHistory(String repairId) {
        repairHistoryDAO.deleteRepairHistory(repairId);
    }

    // Lấy tất cả lịch sử sửa chữa
    public List<RepairHistory> getAllRepairHistories() {
        return repairHistoryDAO.getAllRepairHistories();
    }

    
    // Lấy lịch sử sửa chữa theo repair_id
    public List<RepairHistory> getRepairHistoryByRepairId(String repairId) {
        return repairHistoryDAO.getRepairHistoryByRepairId(repairId);
    }
    //Lấy lịch sửa chữa theo product_id
    public List<RepairHistory> getRepairHistoryByProductId(String productId){
        return repairHistoryDAO.getRepairHistoryByProductId(productId);
    }

    public List<RepairHistory> getRepairHistoriesByProductId(String productId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



