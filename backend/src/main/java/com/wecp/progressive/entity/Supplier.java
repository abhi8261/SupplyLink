package com.wecp.progressive.entity;

public class Supplier  implements Comparable<Supplier> {
    int supplierId;
    String supplierName;
    String contactEmail;
    String contactPhone;
    String address;
    String role;
    public Supplier() {
    }
    public Supplier(int supplierId, String supplierName, String contactEmail, String contactPhone, String address,
            String role) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.address = address;
        this.role = role;
    }
    public int getSupplier_id() {
        return supplierId;
    }
    public void setSupplier_id(int supplierId) {
        this.supplierId = supplierId;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getContactEmail() {
        return contactEmail;
    }
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    public String getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public int compareTo(Supplier o) {
        // TODO Auto-generated method stub
        return this.getSupplierName().compareTo(o.getSupplierName());
    }
    

}