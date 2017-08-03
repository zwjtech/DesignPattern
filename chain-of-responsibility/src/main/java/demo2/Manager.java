package demo2;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public abstract class Manager {
    protected Manager successor;
    protected String name;
    protected double amount;


    public Manager getSuccessor() {
        return successor;
    }

    public void setSuccessor(Manager successor) {
        this.successor = successor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void HandleRequest(double moeny);
}
