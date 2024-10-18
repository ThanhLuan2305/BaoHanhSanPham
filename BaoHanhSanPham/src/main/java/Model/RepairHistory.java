/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

public class RepairHistory {
    private String repairId;
    private String productId;
    private LocalDate repairDate;
    private String repairDescription;
    private String status;
    private String technician;

    // Constructor
    public RepairHistory(String repairId, String productId, LocalDate repairDate, String repairDescription, String status, String technician) {
        this.repairId = repairId;
        this.productId = productId;
        this.repairDate = repairDate;
        this.repairDescription = repairDescription;
        this.status = status;
        this.technician = technician;
    }

    // Getter và Setter
    public String getRepairId() {
        return repairId;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LocalDate getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(LocalDate repairDate) {
        this.repairDate = repairDate;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;      // Setter cho status
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }
}

