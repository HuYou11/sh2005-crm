package com.pjl.crm.settings.controller;

import com.pjl.crm.settings.bean.User;
import com.pjl.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.pjl.crm.settings.controller
 * @Description: java类作用描述
 * @Author: 彭靖栗
 * @CreateDate: 2020/12/14 20:55
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/queryUsers")
    @ResponseBody
    public List<User> queryUsers(){
        return userService.queryUsers();
    }
    @PostMapping("crm/settings/user/login")
    public String login(User user, Model model, HttpSession session, HttpServletRequest request){
        //获取用户登陆的ip
        String ip = request.getRemoteAddr();
        user.setAllowIps(ip);
        user=userService.login(user);
        return null;
    }
}
