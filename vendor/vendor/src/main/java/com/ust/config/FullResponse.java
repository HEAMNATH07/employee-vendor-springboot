package com.ust.config;

import java.util.List;


public class FullResponse {
    public String vendorname;
    public Long vendorno;
    public String address;
    List<Employeeinfo>employeeinfo;

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

    public List<Employeeinfo> getEmployeeinfo() {
        return employeeinfo;
    }

    public void setEmployeeinfo(List<Employeeinfo> employeeinfo) {
        this.employeeinfo = employeeinfo;
    }
}

