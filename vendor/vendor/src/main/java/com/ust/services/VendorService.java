package com.ust.services;



import com.ust.Feign.Employeedetails;
import com.ust.config.Employeeinfo;
import com.ust.config.FullResponse;
import com.ust.entity.Vendor;
import com.ust.repository.Vendorrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {
    @Autowired
    private Vendorrepository repo;
    @Autowired
    private Employeedetails info;

    public Vendor createVendor(Vendor vendor){
        return repo.save(vendor);
    }
    public List<Vendor> getAllVendors(){
        return repo.findAll();
    }

    public FullResponse getVendorById(Long id){
        Vendor vendor = repo.findById(id).orElse(null);
        if (vendor == null) {
            return null; // or throw some custom exception
        }
        List<Employeeinfo> emp = info.findAllEmployeeinfoByVendorinfo(id);
        FullResponse response = new FullResponse();
        response.setVendorname(vendor.getVendorname());
        response.setAddress(vendor.getAddress());
        response.setVendorno(vendor.getVendorno());
        response.setEmployeeinfo(emp);
        return response;
    }

}

