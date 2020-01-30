package com.example.demo.dao;


import com.example.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
    //增加
    @Insert("INSERT INTO homework(Img, Title, Name, Des,Classify, IsDownload, Empower) value(#{Img},#{Title},#{Name}" +
            ",#{Des},#{Classify},#{IsDownload},#{Empower})")
    void add(String Img,String Title,String Name,String Des,String Classify,Integer IsDownload,String Empower);

    //删除
    @Delete("DELETE FROM homework WHERE Id = #{Id} ")
    void del(long id);

    //查找一个
    @Select("SELECT * FROM homework where Id = #{Id} ")
    User get(long id);

    //查找多个
    @Select("SELECT * FROM homework")
    List<User> lists();

    //修改
    @Update("UPDATE homework set Img=#{Img},Title=#{Title},Name=#{Name},Des=#{Des},Classify=#{Classify},IsDownload=#{" +
            "IsDownload},Empower=#{Empower} where Id=#{Id}")
    void up(User user);
}
