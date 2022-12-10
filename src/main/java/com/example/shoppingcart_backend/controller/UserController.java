package com.example.shoppingcart_backend.controller;
import com.example.shoppingcart_backend.dao.UserDao;
import com.example.shoppingcart_backend.model.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController
public class UserController {
    @Autowired
    private UserDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/register",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> UserRegister(@RequestBody UserRegister u)
    {
        System.out.println(u.getName().toString());
        System.out.println(u.getAddress().toString());
        System.out.println(u.getPhno());
        System.out.println(u.getEmail().toString());
        System.out.println(u.getPassword().toString());
        System.out.println(u.getConfirmPassword().toString());
        dao.save(u);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
}
