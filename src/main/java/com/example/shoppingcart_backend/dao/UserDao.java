package com.example.shoppingcart_backend.dao;

import com.example.shoppingcart_backend.model.Shopping;
import com.example.shoppingcart_backend.model.UserRegister;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserRegister,Integer> {
}
