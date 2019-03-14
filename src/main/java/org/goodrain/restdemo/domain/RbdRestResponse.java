package org.goodrain.restdemo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RbdRestResponse<T> {
    @JsonProperty("code")
    private String code;

    @JsonProperty("msg")
    private String msg;

    @JsonProperty("msg_show")
    private String msgShow;

    @JsonProperty("data")
    private T data;

    public RbdRestResponse() {
    }

    public RbdRestResponse(String code, String msg, String msgShow, T data) {
        this.code = code;
        this.msg = msg;
        this.msgShow = msgShow;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgShow() {
        return msgShow;
    }

    public void setMsgShow(String msgShow) {
        this.msgShow = msgShow;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
