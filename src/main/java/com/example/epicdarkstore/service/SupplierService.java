package com.example.epicdarkstore.service;

import com.example.epicdarkstore.entity.Supplier;

import java.util.List;

public interface SupplierService {

    List<Supplier> findAll();

    Supplier findById(Integer id);


    Supplier saveSupplier(Supplier supplier);

    void delete(int id);

}