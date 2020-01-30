package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void add(String Img,String Title,String Name,String Des,String Classify,Integer IsDownload,String Empower);
    void delect(Long id);
    User get(Long id);
    List<User> lists();
    void up(User user);
}
