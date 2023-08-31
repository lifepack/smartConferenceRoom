package com.kerry.smartconferenceroom.util;

public class ResponseUtil {
    private int code;
    private String message;
    private Object data;


    public static ResponseUtil ok(Object data) {
        return new ResponseUtil(200, "操作成功", data);
    }

    public ResponseUtil() {
    }

    public ResponseUtil(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
