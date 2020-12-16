package com.pjl.crm.base.constants;

/**
 * @ProjectName: crm
 * @Package: com.pjl.crm.base.constants
 * @Description: 定义异常类的类型
 * @Author: 彭靖栗
 * @CreateDate: 2020/12/15 21:46
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public enum  CrmExceptionEnum {
    LOGIN_ACCOUNT_ERROR("001","用户名或密码错误"),
    LOGIN_ACCOUNT_EXPIRE("001","账户已失效"),
    LOGIN_ACCOUNT_FORBID("001","账户被禁用"),
    LOGIN_ACCOUNT_IP("001","不允许的IP");

    private String code;//业务状态码  001:代表用户登陆 002:交易模块

    private String  mesges;

    CrmExceptionEnum(String code, String mesges) {
        this.code = code;
        this.mesges = mesges;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMesges() {
        return mesges;
    }

    public void setMesges(String mesges) {
        this.mesges = mesges;
    }
}
