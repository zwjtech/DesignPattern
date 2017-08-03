package com.adpter.clazz;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class Adapter extends Adaptee implements Target {
    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    public void sampleOperation2() {
        //写相关的代码
    }

}