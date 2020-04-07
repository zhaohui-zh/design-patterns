package com.zh.proxy;

/**
 * 房产中介-代理主题角色(Proxy)
 *
 * @author Zhaohui
 * @date 2020/4/7
 */
public class HouseProxy implements House {
    private HouseOwner houseOwner;

    public HouseProxy(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void rent() {
        System.out.println("Before rent");
        houseOwner.rent();
        System.out.println("After rent");
    }
}
