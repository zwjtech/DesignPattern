package com.pattern.state.simple;

/**
 * Created by zhangWeiJie on 2017/8/4.
 */
public class ConcreteStateA implements State {

    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }

}
