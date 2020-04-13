package com.zh.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理（对应Concrete Mediator）
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public class President implements Mediator {
    private Map<String, Department> map = new HashMap<>();

    @Override
    public void register(String dname, Department depy) {
        map.put(dname, depy);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
