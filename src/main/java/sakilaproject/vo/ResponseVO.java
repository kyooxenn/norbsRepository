package sakilaproject.vo;

import java.util.Collections;

public class ResponseVO<T> {
    private int code;
    private String msg;
    private T data;

    public ResponseVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseVO(ServiceStatusCode serviceStatusCode) {
        this.code =serviceStatusCode.getCode();
        this.msg = serviceStatusCode.getMsg();
        this.data = (T) Collections.emptyList();
    }

    public ResponseVO(ServiceStatusCode serviceStatusCode, T data) {
        this.code =serviceStatusCode.getCode();
        this.msg = serviceStatusCode.getMsg();
        this.data =data;
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
}
