package com.pjl.crm.settings.bean;

/**
 * @ProjectName: crm
 * @Package: com.pjl.crm.settings.bean
 * @Description: java类作用描述
 * @Author: 彭靖栗
 * @CreateDate: 2020/12/16 11:12
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Person {
    private String name;
    private String password;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
