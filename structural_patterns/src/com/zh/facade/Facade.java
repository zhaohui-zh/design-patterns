package com.zh.facade;

/**
 * 外观角色
 *
 * <p>为子系统的接口提供一致的界面
 *
 * @author Zhaohui
 * @date 2020/4/4
 */
public class Facade {
    private SubSystem subSystem = new SubSystem();

    public void wacthMovie() {
        subSystem.turnOnTV();
        subSystem.setCD();
        subSystem.startWatching();
    }
}
