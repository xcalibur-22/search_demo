package com.example.search_demo.controller;

import com.example.search_demo.dto.SearchRequest;
import com.example.search_demo.entity.Supplier;
import com.example.search_demo.service.SupplierService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/query")
    public List<Supplier> querySuppliers(@RequestBody @Valid SearchRequest searchRequest) {
        return supplierService.querySuppliers(
                searchRequest.getLocation(),
                searchRequest.getNatureOfBusiness(),
                searchRequest.getManufacturingProcess(),
                searchRequest.getPage(),
                searchRequest.getSize()
        );
    }
}
