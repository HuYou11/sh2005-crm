package com.pjl.crm.settings.service;

import com.pjl.crm.settings.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.pjl.crm.settings.service
 * @Description: java类作用描述
 * @Author: 彭靖栗
 * @CreateDate: 2020/12/14 21:05
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */

public interface UserService {

    List<User> queryUsers();

    User login(User user);
}
