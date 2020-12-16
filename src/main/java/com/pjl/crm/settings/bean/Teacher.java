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
public class Teacher {
    private String no;
    private String classname;

    @Override
    public String toString() {
        return "Teacher{" +
                "no='" + no + '\'' +
                ", classname='" + classname + '\'' +
                '}';
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
