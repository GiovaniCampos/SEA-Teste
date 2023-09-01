package com.SEA.Cadastramento.controller;

import com.SEA.Cadastramento.user.User;
import com.SEA.Cadastramento.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> getAll(){
        List<User> userList = repository.findAll();
        return userList;
    }
}
