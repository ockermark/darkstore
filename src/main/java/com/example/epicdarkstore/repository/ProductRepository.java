package com.example.epicdarkstore.repository;

import com.example.epicdarkstore.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product>findByName(String Name);




}
