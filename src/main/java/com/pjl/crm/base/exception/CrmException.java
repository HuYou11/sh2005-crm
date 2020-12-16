package com.pjl.crm.base.exception;

import com.pjl.crm.base.constants.CrmExceptionEnum;

/**
 * @ProjectName: crm
 * @Package: com.pjl.crm.base.exception
 * @Description: java类作用描述
 * @Author: 彭靖栗
 * @CreateDate: 2020/12/15 21:37
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class CrmException extends Exception {
    private CrmExceptionEnum exceptionEnum;

    public CrmException(String message, CrmExceptionEnum exceptionEnum) {
        super(message);
        this.exceptionEnum = exceptionEnum;
    }

    public CrmExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(CrmExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }
}
