package com.design.tender.common.lang;

public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result(T t){
        this.data = t;
    }

    public Result(){
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setResultCode(ResultCode resultCode){
        this.code = resultCode.code();
        this.msg = resultCode.msg();
    }
    public static Result succ(){
        Result r = new Result();
        r.setResultCode(ResultCode.SUCCESS);
        return r;
    }

    public static Result succ(Object data){
        Result r= new Result();
        r.setData(data);
        r.setResultCode(ResultCode.SUCCESS);
        return r;
    }

    public static Result fail(Integer code,String msg){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        return r;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
