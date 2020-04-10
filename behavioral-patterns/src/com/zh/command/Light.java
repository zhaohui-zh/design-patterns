package com.zh.command;

/**
 * Receiver：命令接收者，也就是命令真正的执行者
 *
 * @author Zhaohui
 * @date 2020/4/10
 */
public class Light {
    public void on() {
        System.out.println("The light is on!");
    }

    public void off() {
        System.out.println("The light is off!");
    }
}
