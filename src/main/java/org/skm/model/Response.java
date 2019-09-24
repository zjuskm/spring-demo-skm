package org.skm.model;

/**
 * Created by zjuskm
 * 2019-09-23
 */
public class Response<T> {
    private int code;
    private String msg;
    private T data;

    public Response() {

    }

    public Response(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Response(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    public static <T> Response<T> wrap(T data) {
        return new Response(data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
