package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//接口实现类
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    //查询所有的人员信息
    @Override
    public List<UserDao> getAllUser() {
        List<UserDao> userDaoList = new ArrayList<>();
        userDaoList = userRepository.findAll();
        return userDaoList;
    }

    @Override
    public UserDao addUser(UserDao userDao) {
        return userRepository.save(userDao);
    }

    @Override
    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDao updateUserById(UserDao userDao) {
        return userRepository.save(userDao);
    }

    @Override
    public UserDao getUserByName(String name) {
        return userRepository.findByName(name);
//        return null;
    }

    @Override
    public Optional<UserDao> getUserById(String id){
        return userRepository.findById(id);
    }

    @Override
    public Page<UserDao> getPageableUsers() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        Pageable pageable = new PageRequest(0 , 2, sort);
        return userRepository.findAll(pageable);
    }
}
