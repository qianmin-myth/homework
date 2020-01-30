package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/add")
    public String add( String Img,String Title,String Name,String Des,String Classify, @RequestParam("IsDownload") Integer IsDownload,String Empower){
        userService.add(Img, Title, Name, Des, Classify, IsDownload, Empower);
        return "添加成功";
    }
    @RequestMapping("/del")
    public String del(long Id){
        userService.delect(Id);
        return "删除成功";
    }
    @RequestMapping("/get")
    public User get(long Id){
        User user = userService.get(Id);
        return user;
    }
    @RequestMapping("/list")
    public List<User> lists(){
        List<User> users = userService.lists();
        return  users;
    }
    @RequestMapping("/up")
    public String up(long Id,String Img,String Title,String Name,String Des,String Classify,@RequestParam("IsDownload") Integer IsDownload,String Empower){
        User user=new User();
        user.setId(Id);
        user.setImg(Img);
        user.setTitle(Title);
        user.setName(Name);
        user.setDes(Des);
        user.setClassify(Classify);
        user.setISDownload(IsDownload);
        user.setEmpower(Empower);
        userService.up(user);
        return "更新成功";
    }

}