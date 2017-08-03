/**
 * Created by zhangWeiJie on 2017/8/3.
 */
//环境角色类
public class Context {

    //持有一个具体策略的对象
    private Stratege stratege;
    //构造函数，传入一个具体策略对象
    public Context(Stratege stratege) {
        this.stratege = stratege;
    }
    //策略方法
    public void contextInterface(){
        stratege.strategeInterface();
    }
}
