package com.zh.chain;

/**
 * Handler
 *
 * <p>抽象处理类: 主要包含一个指向下一处理类的成员变量 nextHandler
 * 和一个处理请求的方法 handRequest，handRequest 方法的主要思想是，
 * 如果满足处理的条件，则有本处理类来进行处理，否则由 nextHandler 来处理。
 * @author Zhaohui
 * @date 2020/4/12
 */
public abstract class Handler {
    protected Handler nextHandler;

    public Handler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract Response handleRequest(Request request);
}
