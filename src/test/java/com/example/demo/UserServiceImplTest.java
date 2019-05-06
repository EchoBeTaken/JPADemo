package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.repository.UserRepository;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImpl userService;

//    @Before
//    public void before() {
//        UserDao userDao = new UserDao();
//        userDao.setId("005");
//        userDao.setName("555");
//        userDao.setAccount("00005");
//        userDao.setPassword("123");
//        userRepository.save(userDao);
//        userDao = new UserDao();
//        userDao.setId("002");
//        userDao.setName("222");
//        userDao.setAccount("00002");
//        userDao.setPassword("123456");
//        userRepository.save(userDao);
//        userDao = new UserDao();
//        userDao.setId("003");
//        userDao.setName("333");
//        userDao.setAccount("00003");
//        userDao.setPassword("123456");
//        userRepository.save(userDao);
//    }

    @Test
    public void test() {
//        UserDao userDao = new UserDao();
//        userDao.setId("004");
//        userDao.setName("444");
//        userDao.setAccount("00004");
//        userDao.setPassword("654321");
//        userRepository.save(userDao);
        System.out.println("password = " + userRepository.findByName("555").getPassword());

        userService.deleteUserById("001");

    }

//    @After
//    public void after() {
//        userRepository.deleteById("002");
//    }
}
