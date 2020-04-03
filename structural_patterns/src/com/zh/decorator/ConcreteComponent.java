package com.zh.decorator;

/**
 * 具体组件
 *
 * @author Zhaohui
 * @date 2020/4/3
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent say");
    }
}
