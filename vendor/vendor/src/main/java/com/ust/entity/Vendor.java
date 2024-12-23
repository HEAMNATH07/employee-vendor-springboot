package com.ust.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendor_details")
public class Vendor {
    @Id
    public Long id;
    public String vendorname;
    public Long vendorno;
    public String address;

    public Vendor() {
    }

    public Vendor(Long id, String vendorname, Long vendorno, String address) {
        this.id = id;
        this.vendorname = vendorname;
        this.vendorno = vendorno;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVendorname() {
        return vendorname;
    }

    public void setVendorname(String vendorname) {
        this.vendorname = vendorname;
    }

    public Long getVendorno() {
        return vendorno;
    }

    public void setVendorno(Long vendorno) {
        this.vendorno = vendorno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}


