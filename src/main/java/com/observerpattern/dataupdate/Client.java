package com.observerpattern.dataupdate;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class Client {
    public static void main(String[] args) {
       ServerManager sm = new ServerManager();
       ObseverA obseverA = new ObseverA(sm);
       ObseverB obseverB = new ObseverB(sm);
       sm.setData(10);
       sm.deleteObserver(obseverA);//注销观察者，以后被观察者有数据变化就不再通知这个已注销的观察者
       sm.setData(200);
    }
}
