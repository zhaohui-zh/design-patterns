package com.zh.mediator;

/**
 * 部门（对应Colleague）
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public interface Department {
    void selfAction();//做本部门的事情
    void outAction();//向总经理发出请求
}
