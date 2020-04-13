package com.zh.memento;

/**
 * 客户类-备忘录模式
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Memento memento = originator.createMemento();
        originator.setMemento(memento);
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
        Memento memento2 = caretaker.getMemento();
    }
}
