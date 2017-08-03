package com.adapter.object;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();
}
