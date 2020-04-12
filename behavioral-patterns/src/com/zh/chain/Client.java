package com.zh.chain;

/**
 * 客户类
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class Client {
    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandlerA(null);
        Handler handler2 = new ConcreteHandlerB(handler1);

        Request request1 = new Request(RequestType.TYPE1, "request1");
        Response response1 =  handler2.handleRequest(request1);
        if (response1 != null)
            System.out.println(response1.getMessage());

        Request request2 = new Request(RequestType.TYPE2, "request2");
        Response response2 = handler2.handleRequest(request2);
        if (response2 != null)
            System.out.println(response2.getMessage());
    }
}
