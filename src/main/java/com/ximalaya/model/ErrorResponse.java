package com.ximalaya.model;

/**
 * Created by zjuskm
 * 2019-09-23
 */
public class ErrorResponse<T> extends Response<T> {
    public ErrorResponse() {
        super(-1, "error", null);
    }

    public ErrorResponse(T data) {
        super(-1,"error",data);
    }

}
