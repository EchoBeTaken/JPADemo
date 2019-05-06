package com.example.demo.controllers;

import com.example.demo.dao.UserDao;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/getUser")
    public UserDao getUser() {
        return userService.getUserByName("222");
    }
}
