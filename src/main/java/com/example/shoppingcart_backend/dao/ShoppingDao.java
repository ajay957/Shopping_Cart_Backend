package com.example.shoppingcart_backend.dao;

import com.example.shoppingcart_backend.model.Shopping;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShoppingDao extends CrudRepository<Shopping,Integer> {
    @Query(value = "SELECT `id`, `category`, `description`, `image`, `price` FROM `shoppingcart` WHERE `category` LIKE %:category",nativeQuery = true)
    List<Shopping> SearchProduct(@Param("category") String category);
}
