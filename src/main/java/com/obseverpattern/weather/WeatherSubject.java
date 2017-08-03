package com.obseverpattern.weather;

import java.util.Observable;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class WeatherSubject extends Observable {
    private  String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String newWeatherContent) {
        this.weatherContent = newWeatherContent;
        this.setChanged();
        this.notifyObservers();
    }
}
