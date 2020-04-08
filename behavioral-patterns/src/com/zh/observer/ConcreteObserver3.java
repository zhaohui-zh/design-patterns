package com.zh.observer;

/**
 * 具体观察者(ConcreteObserver)
 *
 * <p>观察者的具体实现
 * @author Zhaohui
 * @date 2020/4/8
 */
public class ConcreteObserver3 implements Observer {
    @Override
    public void update(int state) {
        System.out.println("ConcreteObserver3 know state had changed to " + state);
        doSomething();
    }

    private void doSomething() {
        System.out.println("ConcreteObserver3 do something!!!");
    }
}
