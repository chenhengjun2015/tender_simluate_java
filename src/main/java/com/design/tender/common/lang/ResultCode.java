package com.design.tender.common.lang;

public enum ResultCode {
    SUCCESS(0,"成功"),
    ERROR(500,"系统错误");
    private Integer code;
    private String msg;
    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer code(){
        return this.code;
    }
    public String msg(){
        return this.msg;
    }
}
