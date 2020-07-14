package com.example.demo.dao;

import com.example.demo.entity.User;
import com.example.demo.entity.UserParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    void insert(UserParam params);
    void delete(int Id);
    void update(UserParam params);
    List<User> select();

}
