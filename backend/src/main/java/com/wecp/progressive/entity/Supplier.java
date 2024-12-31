package com.wecp.progressive.entity;

public class Supplier  implements Comparable<Supplier> {
    int supplierId;
    String supplierName;
    String contactEmail;
    String contactPhone;
    String address;
    private String username;
    private String password;
    String role;
    public Supplier() {
    }
    public Supplier(int supplierId, String supplierName, String contactEmail, String contactPhone, String address, String username, String password,
            String role) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.address = address;
        this.username=username;
        this.password=password;
        this.role = role;
    }
    
    public int getSupplierId() {
        return supplierId;
    }
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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

    