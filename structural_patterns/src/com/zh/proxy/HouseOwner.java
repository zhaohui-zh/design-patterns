package com.zh.proxy;

/**
 * 房主-真实主题角色(RealSubject)
 *
 * @author Zhaohui
 * @date 2020/4/7
 */
public class HouseOwner implements House {
    @Override
    public void rent() {
        System.out.println("租了一间房子");
    }
}
