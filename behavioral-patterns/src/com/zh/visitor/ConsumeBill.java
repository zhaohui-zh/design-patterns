package com.zh.visitor;

/**
 * Consume Bill
 *
 * <p>ConcreteElement：具体的元素类，它提供接受访问方法的具体实现，而这个具体的实现，
 * 通常情况下是使用访问者提供的访问该元素类的方法。
 *
 * @author Zhaohui
 * @date 2020/4/14
 */
public class ConsumeBill implements Bill {

    private double amount;
    private String item;

    public ConsumeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    @Override
    public void accept(AccountBookViewer v) {
        v.view(this);
    }

    public void OperationA(){
        System.out.println("AAAAAAAAAAAAAAA");
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }
}
