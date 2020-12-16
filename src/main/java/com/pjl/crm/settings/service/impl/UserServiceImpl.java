package com.pjl.crm.settings.service.impl;

import com.pjl.crm.settings.bean.User;
import com.pjl.crm.settings.mapper.UserMapper;
import com.pjl.crm.settings.service.UserService;
import com.pjl.crm.base.util.DateTimeUtil;
import com.pjl.crm.base.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.pjl.crm.settings.service.impl
 * @Description: java类作用描述
 * @Author: 彭靖栗
 * @CreateDate: 2020/12/14 21:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserMapper userMapper;
    @Override
    public List<User> queryUsers() {
        return userMapper.selectAll();
    }

    @Override
    public User login(User user) {
        //将用户输入的密码进行MD5加密
        String md5 = MD5Util.getMD5(user.getLoginPwd());
        user.setLoginPwd(md5);
        //获取当前用户登陆的ip地址
        String ip = user.getAllowIps();
        user = userMapper.selectOne(user);
        //用户名或者密码错误的时候
        if(user==null){

        }else{
            //检验账户是否失效
            String expireTime = user.getExpireTime();
            String sysTime = DateTimeUtil.getSysTime();
            //失效了
            if(sysTime.compareTo(expireTime) > 0){

            }
            //用户账户是否被禁用.0禁用 1可用
            if("0".equals(user.getLockState())){
                 //用户账户被禁用了
            }
            //允许登录的ip地址
            if(!user.getAllowIps().contains(ip)){
                //不允许登陆的ip地址
            }
        }
        return null;
    }
}
