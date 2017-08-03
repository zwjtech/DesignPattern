package com.observerpattern.dataupdate;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class ObseverA implements Observer {
    public ObseverA(ServerManager sm) {
        sm.addObserver(this);//注册加入观察者
    }

    public void update(Observable o, Object arg) {
        System.out.println("Aobserver receive:Data has changed to: "+((ServerManager)o).getData());
    }
}
