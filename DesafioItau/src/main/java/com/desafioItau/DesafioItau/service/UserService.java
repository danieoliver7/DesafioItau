package com.desafioItau.DesafioItau.service;

import com.desafioItau.DesafioItau.Entity.User;
import com.desafioItau.DesafioItau.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void create(@RequestBody User user){
        userRepository.save(user);
    }
}
