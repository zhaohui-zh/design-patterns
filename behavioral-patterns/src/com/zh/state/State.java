package com.zh.state;

/**
 * State（抽象状态类）
 *
 * <p>它用于定义一个接口以封装与环境类的一个特定状态相关的行为，在抽象状态类中声明了各种不同状态对应的方法，
 * 而在其子类中实现类这些方法，由于不同状态下对象的行为可能不同，因此在不同子类中方法的实现可能存在不同，
 * 相同的方法可以写在抽象状态类中
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public interface State {
    void handle(Context context);
}
