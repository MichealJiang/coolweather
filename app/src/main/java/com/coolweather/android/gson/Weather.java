package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 79986 on 2017/6/22.
 * Weather实例类用来引用gson包中各个实体类（用于解析天气数据的实体类）
 */

public class Weather {

    public String status; //天气数据获取成功返回OK，失败返回具体原因

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
    //daily_forecast包含的是一个数组，数组中每一项都代表未来一天的天气信息，
    // 因为在定义实体类的时候定义的是单日的天气，所以这里我们使用集合类来对Forecast实体类进行引用

}
