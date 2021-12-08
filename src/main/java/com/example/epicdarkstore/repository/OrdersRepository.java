package com.example.epicdarkstore.repository;

import com.example.epicdarkstore.entity.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Integer> {


}
