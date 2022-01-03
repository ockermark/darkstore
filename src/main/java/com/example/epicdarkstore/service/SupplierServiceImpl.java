package com.example.epicdarkstore.service;


import com.example.epicdarkstore.entity.Supplier;
import com.example.epicdarkstore.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional


@Service
public class SupplierServiceImpl implements SupplierService {


    SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImpl( SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }
    @Override
    public List<Supplier> findAll(){
        List<Supplier> list = new ArrayList<>();
        supplierRepository.findAll().iterator().forEachRemaining(list::add);
        return list;


    }

    @Override
    public Supplier findById(int id){
    Optional <Supplier> optionalSupplier = supplierRepository.findById(id);
    if (optionalSupplier.isPresent()) {
        return optionalSupplier.get();
    }
    return null;
    }
    }
}