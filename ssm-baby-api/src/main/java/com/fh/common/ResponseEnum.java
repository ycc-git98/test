package com.fh.common;

public enum ResponseEnum {
    OK(200,"操作成功"),
    ERROR(500,"操作失败"),
    USER_PASSWORD_IS_ERROR(1004,"用户名或密码错误"),
    PASSWORD_IS_ERROR(1003,"密码错误"),
    USER_IS_NOT_EXIST(1002,"用户不存在"),
    USER_PASSWORD_IS_NULL(1001,"用户名或密码不能为空");

    private int code;

    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
