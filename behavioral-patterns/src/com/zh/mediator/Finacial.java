package com.zh.mediator;

/**
 * 财务部（对应Concrete Colleague）
 *
 * @author Zhaohui
 * @date 2020/4/13
 */
public class Finacial implements Department {
    private Mediator mediator;//持有中介者的引用

    public Finacial(Mediator mediator) {
        super();
        this.mediator = mediator;
        mediator.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("运营资金");
    }

    @Override
    public void outAction() {
        System.out.println("技术落后，请研发新科技");
        mediator.command("development");
    }
}
