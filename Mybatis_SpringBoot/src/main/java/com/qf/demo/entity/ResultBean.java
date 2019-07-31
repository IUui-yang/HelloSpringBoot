package com.qf.demo.entity;

/**
 * 全局异常返回实体类
 * @Author py
 * @Date 2019/7/30
 */
public class ResultBean<T> {
    private String respCode;
    private T data;

    public ResultBean() {
    }

    public ResultBean(String respCode, T data) {
        this.respCode = respCode;
        this.data = data;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
