package com.zh.observer;

import java.util.ArrayList;

/**
 * 具体被观察者(ConcreteSubject)
 *
 * 被观察者具体的实例，存储观察者感兴趣的状态。
 *
 * @author Zhaohui
 * @date 2020/4/8
 */
public class ConcreteSubject implements Subject {

    private ArrayList<Observer> observers;
    private int subjectState;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(int state) {
        for(Observer o: observers) {
            o.update(state);
        }
    }

    public int getState() {
        return subjectState;
    }

    public void setState(int newState) {
        subjectState = newState;
        System.out.println("subject' state change to " + newState);
        this.notifyObserver(subjectState);
    }
}
