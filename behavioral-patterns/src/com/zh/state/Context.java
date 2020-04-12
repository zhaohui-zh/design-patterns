package com.zh.state;

/**
 * Context（环境类）
 *
 * <p>环境类又称为上下文类，它是拥有多种状态的对象。由于环境类的状态存在多样性且在不同状态下对象的行为有所不同，
 * 因此将状态独立出去形成单独的状态类。在环境类中维护一个抽象状态类State的实例，这个实例定义当前状态，在具体实现时，它是一个State子类的对象。
 *
 * @author Zhaohui
 * @date 2020/4/12
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleRequest() {
        state.handle(this);
    }
}
