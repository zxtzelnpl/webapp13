package com.zxt.common;

public class SuccessJson<T> {
    private T data;
    private String STATE="SUCCESS";


    public T getData() {
        return data;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setData(T data) {
        this.data = data;
    }
}
