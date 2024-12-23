package com.ust.Feign;



import com.ust.config.Employeeinfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Employee",url = "http://localhost:9097/")
public interface Employeedetails {
    @GetMapping("vendor/{vendorid}")
    List<Employeeinfo>findAllEmployeeinfoByVendorinfo(@PathVariable("employeeid") Long id);
}

