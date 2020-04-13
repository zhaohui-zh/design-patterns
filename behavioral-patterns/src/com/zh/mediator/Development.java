package com.zh.mediator;

/**
 * 开发部（对应Concrete Colleague）
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public class Development implements Department {
    private Mediator mediator;//持有中介者的引用

    public Development(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("研发科技");
    }

    @Override
    public void outAction() {
        System.out.println("没钱了，请求拨钱");
        mediator.command("finacial");
    }
}
