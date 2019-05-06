package com.example.demo.dao.repository;

import com.example.demo.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDao, String> {
    UserDao findByName(String name);
}
