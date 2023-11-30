package com.desafioItau.DesafioItau.controller;

import com.desafioItau.DesafioItau.Entity.User;
import com.desafioItau.DesafioItau.dto.UserDto;
import com.desafioItau.DesafioItau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> findAll(){
        List<UserDto> user = userService.findAll();
        return user;
    }

    @PostMapping
    public void save(@RequestBody User user){
        if(user == null){
            ResponseEntity.badRequest();
        }else {
            userService.create(user);
        }
    }

}
