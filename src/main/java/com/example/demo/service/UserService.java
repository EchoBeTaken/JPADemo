package com.example.demo.service;

import com.example.demo.dao.UserDao;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

//服务的接口

public interface UserService {
    List<UserDao> getAllUser();
    UserDao addUser(UserDao userDao);  //增删改查
    void deleteUserById(String id);
    UserDao updateUserById(UserDao userDao);
    UserDao getUserByName(String name);
    Optional<UserDao> getUserById(String id);
    Page<UserDao> getPageableUsers();

}
