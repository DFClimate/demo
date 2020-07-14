package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao dao;

    public void insert(UserParam params){
        dao.insert(params);
    }

    public void delete(int id){
        dao.delete(id);
    }

    public void update(UserParam params){
        dao.update(params);
    }

    public List<User> select(){
        return dao.select();
    }
}
