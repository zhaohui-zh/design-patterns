package com.zh.command;

/**
 * ConcreteCommand: 具体命令类
 *
 * @author Zhaohui
 * @date 2020/4/10
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
