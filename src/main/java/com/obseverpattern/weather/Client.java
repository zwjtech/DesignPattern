package com.obseverpattern.weather;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class Client {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();

        WeatherObserver observerA = new WeatherObserver();
        observerA.setName("订阅者A");
        observerA.setAction("去打球");
        //订阅天气
        weatherSubject.addObserver(observerA);
        WeatherObserver observerB = new WeatherObserver();
        observerB.setName("订阅者B");
        observerB.setAction("去商场购物");
        //订阅天气
        weatherSubject.addObserver(observerB);
        //天气变化
        weatherSubject.setWeatherContent("今天天气晴朗，适合户外运动和购物");
        weatherSubject.deleteObserver(observerA);//删除订阅者A,后续收不到消息
        weatherSubject.setWeatherContent("今天下午有雷阵雨，出门记得带伞哦！");
    }
}
