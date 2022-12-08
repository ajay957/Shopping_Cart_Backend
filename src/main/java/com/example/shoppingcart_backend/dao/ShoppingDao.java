package com.example.shoppingcart_backend.dao;

import com.example.shoppingcart_backend.model.Shopping;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingDao extends CrudRepository<Shopping,Integer> {
}
