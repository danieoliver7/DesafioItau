package com.desafioItau.DesafioItau.controller;

import com.desafioItau.DesafioItau.Entity.User;
import com.desafioItau.DesafioItau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void save(@RequestBody User user){
        if(user == null){
            ResponseEntity.badRequest();
        }else {
            userService.create(user);
        }
    }

}
