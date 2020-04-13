package com.zh.memento;

/**
 * 管理者类-管理备忘录
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        System.out.println("Got memento");
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
