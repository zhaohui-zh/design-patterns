package com.zh.chain;

/**
 * 请求类
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class Request {
    private RequestType type;
    private String name;

    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }

    public RequestType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

}
