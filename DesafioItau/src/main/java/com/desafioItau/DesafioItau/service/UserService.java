package com.desafioItau.DesafioItau.service;

import com.desafioItau.DesafioItau.Entity.User;
import com.desafioItau.DesafioItau.dto.UserDto;
import com.desafioItau.DesafioItau.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public void create(@RequestBody User user){

        userRepository.save(user);
    }



    public List<UserDto> findAll(){
        List<User> user = userRepository.findAll();
        List<UserDto> res = user.stream().map(x -> new UserDto(x)).toList();
        return res;
    }



}
