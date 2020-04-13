package com.zh.mediator;

/**
 * Mediator：中介者接口
 *
 * <p>定义一个接口用于与各同事（Colleague）对象通信。
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public interface Mediator {
    void register(String dname, Department depy);

    void command(String dname);
}
