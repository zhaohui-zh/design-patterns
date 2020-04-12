package com.zh.chain;

/**
 * 具体处理类A
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class ConcreteHandlerA extends Handler {

    public ConcreteHandlerA(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public Response handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println("ConcreteHandlerA is handling");
            return new Response("ConcreteHandlerA handled");
        }
        if (nextHandler != null)
            return nextHandler.handleRequest(request);
        return null;
    }
}
