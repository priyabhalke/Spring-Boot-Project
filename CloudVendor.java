package com.infy.rest_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {

    @Id
    private String VendorId;
    private String VendorName;
    private  String VendorAddress;
    private  String VendorPhoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
        this.VendorId = vendorId;
        this.VendorName = vendorName;
        this.VendorAddress = vendorAddress;
        this.VendorPhoneNumber = vendorPhoneNumber;


    }

    public String getVendorId() {
        return VendorId;
    }

    public void setVendorId(String vendorId) {
        this.VendorId = vendorId;
    }

    public String getVendorName() {
        return VendorName;
    }

    public void setVendorName(String vendorName) {
        this.VendorName = vendorName;
    }

    public String getVendorAddress() {
        return VendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.VendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return VendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.VendorPhoneNumber = vendorPhoneNumber;
    }

}
