package com.chian.of.responsibility.simple;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class Client {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        //handle1放过请求给handle2处理
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
    }
}
