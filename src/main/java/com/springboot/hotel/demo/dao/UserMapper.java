package com.springboot.hotel.demo.dao;

import com.springboot.hotel.demo.entity.User;
import com.springboot.hotel.demo.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    //自定义生成函数
    List<User> selectByUsername(String username);
    List<User> selectByEmail(String username);
    List<User> selectByUsernameAndEmail(String username, String email);

}