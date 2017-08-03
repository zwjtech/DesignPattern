package com.observerpattern.dataupdate;

import java.util.Observable;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class ServerManager extends Observable {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }
}
