package com.example.search_demo.service;

import com.example.search_demo.dao.SupplierDao;
import com.example.search_demo.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierDao supplierDao;

    public List<Supplier> querySuppliers(String location, String natureOfBusiness, String manufacturingProcess, int page, int size) {
        return supplierDao.findSuppliers(location, natureOfBusiness, manufacturingProcess, page, size);
    }
}
