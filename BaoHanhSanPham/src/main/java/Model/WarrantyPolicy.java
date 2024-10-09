/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nganh
 */
public class WarrantyPolicy {

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getPolicyDescription() {
        return policyDescription;
    }

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }

    public int getWarrantyDuration() {
        return warrantyDuration;
    }

    public void setWarrantyDuration(int warrantyDuration) {
        this.warrantyDuration = warrantyDuration;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }
    private String policyId;
    private String productType;
    private String policyDescription;
    private int warrantyDuration;
    private String conditions;

    public WarrantyPolicy() {
    }

    public WarrantyPolicy(String policyId, String productType, String policyDescription, int warrantyDuration, String conditions) {
        this.policyId = policyId;
        this.productType = productType;
        this.policyDescription = policyDescription;
        this.warrantyDuration = warrantyDuration;
        this.conditions = conditions;
    }
}
