package com.zh.visitor;

/**
 * Boss
 *
 * <p>ConcreteVisitor：具体的访问类，它需要给出对每一个元素类访问时所产生的具体行为。
 *
 * @author Zhaohui
 * @date 2020/4/14
 */
public class Boss implements AccountBookViewer {

    private double totalIncome;

    private double totalConsume;

    @Override
    public void view(ConsumeBill bill) {
        totalConsume += bill.getAmount();
    }

    @Override
    public void view(IncomeBill bill) {
        totalIncome += bill.getAmount();
    }

    public double getTotalIncome() {
        System.out.println("老板查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("老板查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }


}
