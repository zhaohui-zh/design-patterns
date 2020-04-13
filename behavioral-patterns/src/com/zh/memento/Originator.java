package com.zh.memento;

/**
 * 原始对象
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public class Originator {
    //需要保存的属性
    private String state;

    //创建备忘录，将当前需要保存的信息导入并实例化出一个Memento对象
    public Memento createMemento() {
        System.out.println("Created Memento!");
        return new Memento(state);
    }

    //恢复备忘录，将Memento导入并将相关数据恢复
    public void setMemento(Memento memento) {
        System.out.println("Backup from memento");
        this.state = memento.getState();
    }

    //显示数据
    public void show() {
        System.out.println("state = " + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
