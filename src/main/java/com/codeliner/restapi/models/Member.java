package com.codeliner.restapi.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private long id;
    private String name;
    private int age;
    private String address;
    private Date created;
}