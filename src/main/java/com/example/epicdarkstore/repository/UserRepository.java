package com.example.epicdarkstore.repository;

import com.example.epicdarkstore.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
