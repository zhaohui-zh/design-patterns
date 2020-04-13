package com.zh.memento;

/**
 * 备忘录，存储原始对象的的状态。
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public class Memento {
    private String state;

    //构造方法，将相关数据导入
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
