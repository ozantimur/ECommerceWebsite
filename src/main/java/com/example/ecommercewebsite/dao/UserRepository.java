package com.example.ecommercewebsite.dao;

import com.example.ecommercewebsite.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmailAndPassword(String email, String password);

}
