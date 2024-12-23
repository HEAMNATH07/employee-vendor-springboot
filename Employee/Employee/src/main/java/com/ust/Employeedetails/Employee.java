package com.ust.Employeedetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    public long Employeeid;

    public Employee() {
    }

    public Employee(long employeeid, String employeename, String employeeAddress, String employeephoneno, long vendorid) {
        Employeeid = employeeid;
        Employeename = employeename;
        EmployeeAddress = employeeAddress;
        Employeephoneno = employeephoneno;
        this.vendorid = vendorid;
    }

    public String getEmployeename() {
        return Employeename;
    }

    public void setEmployeename(String employeename) {
        Employeename = employeename;
    }

    public long getEmployeeid() {
        return Employeeid;
    }

    public void setEmployeeid(long employeeid) {
        Employeeid = employeeid;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    public String getEmployeephoneno() {
        return Employeephoneno;
    }

    public void setEmployeephoneno(String employeephoneno) {
        Employeephoneno = employeephoneno;
    }

    public long getVendorid() {
        return vendorid;
    }

    public void setVendorid(long vendorid) {
        this.vendorid = vendorid;
    }

    public String Employeename;
    public   String EmployeeAddress;
    public String Employeephoneno;
    public long vendorid;


}
