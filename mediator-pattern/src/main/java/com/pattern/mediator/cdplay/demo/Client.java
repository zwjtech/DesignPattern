package com.pattern.mediator.cdplay.demo;

/**
 * Created by zhangWeiJie on 2017/8/4.
 */
public class Client {
    public static void main(String[] args) {
        //创建调停者——主板
        MainBoard mediator = new MainBoard();
        //创建同事类
        CDDriver cdDriver = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        SoundCard soundCard = new SoundCard(mediator);
        VideoCard videoCard = new VideoCard(mediator);
        //让调停者知道所有同事
        mediator.setCdDriver(cdDriver);
        mediator.setCpu(cpu);
        mediator.setVideoCard(videoCard);
        mediator.setSoundCard(soundCard);
        cdDriver.readCD();
    }
}
