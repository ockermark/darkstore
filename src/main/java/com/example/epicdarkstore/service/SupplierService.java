package com.example.epicdarkstore.service;

import com.example.epicdarkstore.entity.Supplier;

import java.util.List;

public class SupplierService {


    Supplier saveSupplier(Supplier supplier);

    void deleteSupplier (Integer id);

    Supplier findByName (String name);
    Supplier findById (Integer id);

    List<Supplier> findAll();

    }

