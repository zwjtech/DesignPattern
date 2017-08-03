package demo2;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class ProjectManager extends Manager {
    ProjectManager(Manager m,String name,double amount){
        this.successor=m;
        this.name=name;
        this.amount=amount;
    }

    @Override
    public void HandleRequest(double money) {
        if(money<=this.amount){
            System.out.println(this.name+"通过了审批，同意拨款！"+money);
        }
        else{
            if(this.successor!=null){
                System.out.println(money+"数额太大,"+this.name+"无权批复,"+"已经交由"+this.successor.name+"处理");
                this.successor.HandleRequest(money);
            }
            else{
                System.out.println(money+"数额太大，"+this.name+"不同意拨款！");
            }
        }
    }
}
