package com.springboot.hotel.demo.controller;

import com.springboot.hotel.demo.entity.User;
import com.springboot.hotel.demo.service.UserService;
import com.springboot.hotel.demo.utils.Result;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/api/listUsers")
    @ResponseBody
    public Object listUsers(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize){
        return Result.success(userService.listUsers(pageNo,pageSize), "分页进行用户的查询");
    }

    //目前还是测试
    @RequestMapping("/api/deleteById")
    @ResponseBody
    public void deleteByNames(User user){
        List<String> list = new ArrayList<>();
        list.add("passor");
        list.add("用户名0");
        userService.deleteByNames(list);
        
    }

    @PostMapping("/api/register")
    @ResponseBody
    public Object insertOneByRegister(@RequestBody User user){
        //传过来的数据应该包含username，password和email

        try {
            user.setIdentity("1");  //先暂时设定一个默认身份
            user.setLastlogintime(new Date());
            user.setRegisterdate(new Date());

            //我在添加之前需要先去数据库中检测内容
            //用户传来三个数据，除了密码不需要检验重复，账户名和邮箱均需要检测重复
            if(userService.isExistByUsername(user.getUsername())){
                return Result.fail(user,"该用户名已经被使用，请更换用户名后重新尝试");
            }else if(userService.isExistByEmail(user.getEmail())){
                return Result.fail(user,"该邮箱已经被使用，请更换用户名吼重新尝试");
            }

            userService.addUser(user);
            return Result.success(user,"用户信息注册成功，以添加进数据库中");
        }catch(Exception e){
            e.printStackTrace();
            return Result.fail("注册失败");
        }

    }

    @PostMapping("/api/login")
    @ResponseBody
    public Object getOneByLogin(@RequestBody User user, HttpSession session){
        String tempName = user.getUsername();
        System.out.println(user);
        tempName = HtmlUtils.htmlEscape(tempName);
        try{
            List<User> users = userService.getAllByUsername(tempName);
            System.out.println(users.size());
            if(users.size()>=1){
                for (User user1 : users) {
                    if(user1.getPassword().equals(user.getPassword())){
                        //密码正确，修改该用户的登陆时间
                        user1.setLastlogintime(new Date());
                        if(userService.updateLastLoginTime(user1)>=1){
                            session.setAttribute("user",user1);  //将用户加入session
                            return Result.success(user1,"用户登录成功");
                        }else{
                            return Result.fail("用户登录时间更新失败");
                        }
                    }else{
                        return Result.success(user,"用户名密码不对，请重新登录");
                    }
                }
            }else{
                //数据库未查询到信息，登录失败
                return Result.fail(tempName,"用户名不存在，登录失败");
            }
        }catch (Exception e){
            System.out.println("登录失败");
            return Result.fail("纯粹登录失败登录失败");
        }
        return Result.error();
    }

    @RequestMapping(value = "api/logout",method = RequestMethod.GET)
    @ResponseBody
    public Object logout(HttpSession session){
        try {
            Enumeration<String> names = session.getAttributeNames();
            System.out.println(names.toString());
            session.removeAttribute("user");
            names = session.getAttributeNames();
            System.out.println(names.toString());

            System.out.println("用户存在，以将其退出缓存");
            //这里面可以想想，返回一个注册失败的页面
            return Result.success("user已经注销");
        }catch (Exception e){
            System.out.println("用户没登陆过");
            e.printStackTrace();
            return Result.fail("注销失败");
        }
        //return "redirect:/";  //这里应该让他返回登录页面，因为这里它取消登录了
    }
}
