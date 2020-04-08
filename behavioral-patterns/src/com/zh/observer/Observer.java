package com.zh.observer;

/**
 * 观察者(Observer)
 *
 * <p>提供通知后的更新事件
 *
 * @author Zhaohui
 * @date 2020/4/8
 */
public interface Observer {
    void update(int state);
}
