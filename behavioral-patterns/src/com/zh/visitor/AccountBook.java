package com.zh.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 账本类，它是当前访问者模式例子中的对象结构
 *
 * <p>ObjectStructure：定义当中所说的对象结构，对象结构是一个抽象表述，它内部管理了元素集合，
 * 并且可以迭代这些元素供访问者访问。
 *
 * @author Zhaohui
 * @date 2020/4/14
 */
public class AccountBook {
    //单子列表
    private List<Bill> billList = new ArrayList<Bill>();
    //添加单子
    public void addBill(Bill bill){
        billList.add(bill);
    }
    //供账本的查看者查看账本
    public void show(AccountBookViewer viewer){
        for (Bill bill : billList) {
            bill.accept(viewer);
        }
    }
}
