package com.springboot.hotel.demo.service;

import com.github.pagehelper.PageHelper;
import com.springboot.hotel.demo.dao.UserMapper;
import com.springboot.hotel.demo.entity.User;
import com.springboot.hotel.demo.entity.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageInfo;

import java.util.List;

@Service
public class UserService {
    //实现用户类的各种功能

    //1首先是完成用户的登陆和注册功能
    @Autowired
    UserMapper userMapper;

    public PageInfo<User> listUsers(int pageNo, int pageSize){
        PageHelper.startPage(pageNo,pageSize);
        List<User> users = userMapper.selectByExample(null);
        return new PageInfo<>(users);
    }

    //配合注册用户时的数据库插入实际操作
    public Object addUser(User user){
        userMapper.insert(user);
        return null;
    }


    public List<User> getAllByUsername(String username){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        return userMapper.selectByExample(userExample);
    }

    public boolean isExistByUsername(String username)
    {
        UserExample userExample =new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        for (User user : users) {
            System.out.println("找到了");
            System.out.println(user);
        }
        //只要能找到就是存在
        return users.size()>=1;
    }
    public boolean isExistByEmail(String email)
    {
        UserExample userExample =new UserExample();
        userExample.createCriteria().andEmailEqualTo(email);
        List<User> users = userMapper.selectByExample(userExample);

        //只要能找到就是存在
        return users.size()>=1;
    }


    public void deleteByNames(List<String> list) {
        userMapper.deleteByNames(list);
    }

    public int updateLastLoginTime(User user) {
        //update/delete，返回值是：更新或删除的行数；无需指明resultClass；但如果有约束异常而删除失败，只能去捕捉异常。
        return userMapper.updateLastLoginTime(user);
    }
}
