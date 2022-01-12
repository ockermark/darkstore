package com.example.epicdarkstore.repository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import com.example.epicdarkstore.entity.Supplier;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SupplierRepository extends CrudRepository<Supplier,String> {
    List<Supplier> findByName(String name);
}
