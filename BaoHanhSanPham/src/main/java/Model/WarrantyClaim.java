/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author nganh
 */
public class WarrantyClaim {

    private String claimId;

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LocalDate getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(LocalDate claimDate) {
        this.claimDate = claimDate;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    private String customerId;
    private String productId;
    private LocalDate claimDate;
    private String issueDescription;
    private String claimStatus;

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public WarrantyClaim() {
    }

    public WarrantyClaim(String claimId, String customerId, String productId, LocalDate claimDate, String issueDescription, String claimStatus) {
        this.claimId = claimId;
        this.customerId = customerId;
        this.productId = productId;
        this.claimDate = claimDate;
        this.issueDescription = issueDescription;
        this.claimStatus = claimStatus;
    }

}
