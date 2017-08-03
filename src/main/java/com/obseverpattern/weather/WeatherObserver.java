package com.obseverpattern.weather;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class WeatherObserver implements Observer {
    private String name;
    private String action;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void update(Observable o, Object arg) {
        content = ((WeatherSubject)o).getWeatherContent();
        System.out.println(name+":接收到消息："+content+",执行个性化动作:"+action);
    }
}
