package com.example.demo.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class User implements Serializable {

    private String name;
    private String sex;
    private Integer age;

}
