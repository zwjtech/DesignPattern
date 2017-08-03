package demo2;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class Client {
    public static void main(String[] args) {
        Manager m1=new ProjectManager(null,"总经理",2000);
        Manager m2=new ProjectManager(m1,"部门经理",1000);
        Manager m3=new ProjectManager(m2,"项目经理",500);
        m3.HandleRequest(3000);
    }
}
