package com.lifepill.posinventoryservice.service.APIClient;

import com.lifepill.posinventoryservice.dto.SupplierAndSupplierCompanyDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*@FeignClient(
        url = "http://localhost:8082/lifepill/v1",
        value = "SUPPLIER-SERVICE"
)*/
@FeignClient(name = "SUPPLIER-SERVICE/lifepill/v1")
public interface APIClientSupplierService {

    @GetMapping(path ="/supplier/get-supplier-with-company/{supplierId}")
    SupplierAndSupplierCompanyDTO getSupplierAndCompanyBySupplierId(
            @PathVariable("supplierId") long supplierId
    );
}
