package com.example.shoppingcart_backend.controller;
import com.example.shoppingcart_backend.dao.ShoppingDao;
import com.example.shoppingcart_backend.dao.UserDao;
import com.example.shoppingcart_backend.model.Shopping;
import com.example.shoppingcart_backend.model.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ShoppingController {
    @Autowired
    private ShoppingDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String HomePage(){
        return "welcome to home page";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> AddProduct(@RequestBody Shopping s){
        dao.save(s);
        HashMap<String,String > map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Shopping> ViewShop(){
        return (List<Shopping>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Shopping> SearchProduct(@RequestBody Shopping s){
        String category= String.valueOf(s.getCategory());
        System.out.println(category);
        return (List<Shopping>) dao.SearchProduct(s.getCategory());
    }
}
