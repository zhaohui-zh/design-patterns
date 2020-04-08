package com.zh.observer;

/**
 * 被观察者(Subject)
 *
 * <p>知道它的通知对象，事件发生后会通知所有它知道的对象，提供添加删除观察者的接口。
 *
 * @author Zhaohui
 * @date 2020/4/8
 */
public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObserver(int state) ;
}
