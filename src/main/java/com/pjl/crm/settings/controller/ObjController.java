package com.pjl.crm.settings.controller;

import com.alibaba.fastjson.JSONObject;
import com.pjl.crm.settings.bean.User;
import com.pjl.crm.settings.mapper.UserMapper;
import com.pjl.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.pjl.crm.settings.controller
 * @Description: java类作用描述
 * @Author: 彭靖栗
 * @CreateDate: 2020/12/16 11:12
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class ObjController {
    @Autowired
    private UserService userService;

    @RequestMapping("/objTest01")
    public void objectTest01(HttpServletResponse response) throws IOException {
        List<User> users = userService.queryUsers();

        String citiesJson = JSONObject.toJSONString(users);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(citiesJson);
    }


    @RequestMapping("/objTest02")
    public @ResponseBody List<User> objectTest02(HttpServletResponse response) throws IOException {
        List<User> users = userService.queryUsers();
        return users;

    }



}
