package com.chz.controller;

import com.chz.mapper.UserMapper;
import com.chz.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author snicker
 * @date 2021/10/16 19:14
 * @Describe
 */
@Controller
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session, HttpServletRequest request){
        List<User>users=userMapper.UserList();
        for(User user:users){
            String username1=user.getUsername();
            String password1=user.getPassword();
            if(username1.equals(username) && password1.equals(password) && CodeUtil.checkVerifyCode(request)){
                session.setAttribute("loginUser",username);
                return "redirect:/main.html";
            }else if(!CodeUtil.checkVerifyCode(request)){
                model.addAttribute("msg","验证码错误");
            } else{
                model.addAttribute("msg","用户名或者密码错误");
                continue;
            }
        }
        return "index";
    }

}




























