package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.entity.UserParam;
import com.example.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "用户管理",tags = {"用户增删改查"})
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "insert")
    @ApiOperation(value = "插入")
    @ApiOperationSupport(ignoreParameters = {"params.id"})//异常参数id
    public String insert(@RequestBody UserParam params){
        userService.insert(params);
        return "OK";
    }

    @GetMapping(value = "delete")
    @ApiOperation(value = "删除")
    public String delete(@RequestParam("id") int id){
        userService.delete(id);
        return "OK";
    }

    @PostMapping(value = "update")
    @ApiOperation(value = "修改")
    @ApiOperationSupport(ignoreParameters = {"params.id"})
    public String update(@RequestBody UserParam params){
        userService.update(params);
        return "OK";
    }

    @PostMapping(value = "select")
    @ApiOperation(value = "查询")
    public List<User> select(){
        return userService.select();
    }

}
