/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

public class ExtendedWarranty {
    private String extendedWarrantyId;
    private String productId;
    private double extensionFee;
    private LocalDate newWarrantyEndDate;

    // Constructor
    public ExtendedWarranty(String extendedWarrantyId, String productId, double extensionFee, LocalDate newWarrantyEndDate) {
        this.extendedWarrantyId = extendedWarrantyId;
        this.productId = productId;
        this.extensionFee = extensionFee;
        this.newWarrantyEndDate = newWarrantyEndDate;
    }

    // Getter và Setter
    public String getExtendedWarrantyId() {
        return extendedWarrantyId;
    }

    public void setExtendedWarrantyId(String extendedWarrantyId) {
        this.extendedWarrantyId = extendedWarrantyId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getExtensionFee() {
        return extensionFee;
    }

    public void setExtensionFee(double extensionFee) {
        this.extensionFee = extensionFee;
    }

    public LocalDate getNewWarrantyEndDate() {
        return newWarrantyEndDate;
    }

    public void setNewWarrantyEndDate(LocalDate newWarrantyEndDate) {
        this.newWarrantyEndDate = newWarrantyEndDate;
    }

    public Object getWarrantyId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getWarrantyFee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getExpirationDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
