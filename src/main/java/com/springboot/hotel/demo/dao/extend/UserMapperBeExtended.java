package com.springboot.hotel.demo.dao.extend;

import com.springboot.hotel.demo.entity.Orders;
import com.springboot.hotel.demo.entity.User;
import com.springboot.hotel.demo.entity.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapperBeExtended {
    //自定义生成函数

    //删除
    //这是一个列表参数，实际上还是多参数形式，所以要加上Param
    void deleteByNames(@Param("list")List<String> list);

    //修改
    int updateLastLoginTime(@Param("record")User record);

    //查询
    List<User> selectByUsername(String username);
    List<User> selectByEmail(String username);
    List<User> selectByUsernameAndEmail(String username, String email);

}
