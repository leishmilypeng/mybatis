package com.lp.common.dao;

/**
 * Created by CPR161 on 2016-12-06.
 * 消息输出
 */
public class Result {
    private String message;
    private String code;
    private boolean success;

    public Result() {    }

    public Result(String message,boolean success) {
        this.message = message;
        this.code = code;
        this.success = success;
    }

    public Result(String message, String code, boolean success) {
        this.message = message;
        this.code = code;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
