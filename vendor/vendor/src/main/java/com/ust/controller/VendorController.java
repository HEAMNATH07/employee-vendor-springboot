package com.ust.controller;


import com.ust.entity.Vendor;
import com.ust.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    VendorService service;

    @GetMapping("/getall")
    public List<Vendor> getAll(){
        return service.getAllVendors();
    }

    @PostMapping("/putone")
    public Vendor createVendor(Vendor vendor){
        return service.createVendor(vendor);
    }

}
