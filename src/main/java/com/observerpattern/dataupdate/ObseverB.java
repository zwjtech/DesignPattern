package com.observerpattern.dataupdate;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class ObseverB implements Observer {
    public ObseverB(ServerManager sm) {
        sm.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        System.out.println("Bobserver receive:Data has changed to: "+((ServerManager)o).getData());
    }
}
