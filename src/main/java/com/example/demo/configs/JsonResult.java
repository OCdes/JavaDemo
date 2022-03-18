package com.example.demo.configs;


import lombok.Data;

import java.io.Serializable;
@Data
public class JsonResult<T> implements Serializable {
    private T data;
    private  String code;
    private String msg;

    public JsonResult() {
        this.code = "0";
        this.msg = "操作成功";
    }

    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(T data) {
        this.data = data;
        this.code = "0";
        this.msg = "操作成功";
    }

    public JsonResult(String code, String msg, T data) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

}
