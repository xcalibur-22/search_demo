package com.example.search_demo.dao;

import com.example.search_demo.entity.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

@Repository
public class SupplierDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Supplier> findSuppliers(String location, String natureOfBusiness, String manufacturingProcess, int page, int size) {
        int offset = (page - 1) * size;
        String sql = "SELECT supplier_id, company_name, website, location, nature_of_business, manufacturing_processes " +
                "FROM supplier " +
                "WHERE location = ? " +
                "AND nature_of_business = ? " +
                "AND FIND_IN_SET(?, manufacturing_processes) > 0 " +
                "LIMIT ? OFFSET ?";

        return jdbcTemplate.query(sql, new Object[]{location, natureOfBusiness, manufacturingProcess, size, offset}, new SupplierRowMapper());
    }

    private static class SupplierRowMapper implements RowMapper<Supplier> {
        @Override
        public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
            Supplier supplier = new Supplier();
            supplier.setSupplierId(rs.getLong("supplier_id"));
            supplier.setCompanyName(rs.getString("company_name"));
            supplier.setWebsite(rs.getString("website"));
            supplier.setLocation(rs.getString("location"));
            supplier.setNatureOfBusiness(rs.getString("nature_of_business"));

            // Convert comma-separated string to Set<String>
            String[] processes = rs.getString("manufacturing_processes").split(",");
            Set<String> processSet = new HashSet<>();
            for (String process : processes) {
                processSet.add(process);
            }
            supplier.setManufacturingProcesses(processSet);

            return supplier;
        }
    }
}
