package com.zh.chain;

/**
 * 具体处理类B
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class ConcreteHandlerB extends Handler{
    public ConcreteHandlerB(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public Response handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println("ConcreteHandlerB is handling");
            return new Response("ConcreteHandlerB handled");
        }
        if (nextHandler != null)
            return nextHandler.handleRequest(request);
        return null;
    }

}
