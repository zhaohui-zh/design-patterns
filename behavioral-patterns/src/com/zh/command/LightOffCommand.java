package com.zh.command;

/**
 * ConcreteCommand: 具体命令类
 *
 * @author Zhaohui
 * @date 2020/4/10
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
