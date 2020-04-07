package com.zh.proxy;

/**
 * 客户类
 *
 * @author Zhaohui
 * @date 2020/4/7
 */
public class Client {
    public static void main(String[] args) {
        HouseOwner houseOwner = new HouseOwner();
        HouseProxy houseProxy = new HouseProxy(houseOwner);
        houseProxy.rent();
    }
}
