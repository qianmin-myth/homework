package com.example.demo.service.impl;


import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@EnableTransactionManagement
@Service
public class UserServiceImpl implements UserService {
   @Autowired
UserDao userDao;
    @Override
    public void add(String Img,String Title,String Name,String Des,String Classify,Integer IsDownload,String Empower){
        userDao.add(Img, Title, Name, Des, Classify, IsDownload, Empower);
    }

    @Override
    public void delect(Long Id){ userDao.del(Id);}

    @Override
    public User get(Long Id){
        return userDao.get(Id);
    }

    @Override
    public void up(User user) { userDao.up(user); }

    @Override
    public List<User> lists(){
        return userDao.lists();
    }
}
