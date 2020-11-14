package com.fh.common;

public class ServerResponse<T> {

    private int code;

    private String message;

    private T data;

    public static ServerResponse error(ResponseEnum responseEnum){
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static ServerResponse error(){
        ResponseEnum responseEnum = ResponseEnum.ERROR;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static ServerResponse success(){
        ResponseEnum responseEnum = ResponseEnum.OK;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),null);
    }

    public static ServerResponse success(Object data){
        ResponseEnum responseEnum = ResponseEnum.OK;
        return new ServerResponse(responseEnum.getCode(),responseEnum.getMessage(),data);
    }

    public ServerResponse(int code, String message,T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
