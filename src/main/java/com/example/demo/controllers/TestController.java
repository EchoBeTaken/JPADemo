package com.example.demo.controllers;

import com.example.demo.dao.UserDao;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/{userId}")
    public Optional<UserDao> getUser(@PathVariable String userId) {
        return userService.getUserById(userId);
    }

    @RequestMapping("/page")
    public Page<UserDao> getUsers() {
        return userService.getPageableUsers();
    }
}
