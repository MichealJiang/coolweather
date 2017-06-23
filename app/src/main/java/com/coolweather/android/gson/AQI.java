package com.coolweather.android.gson;

/**
 * Created by 79986 on 2017/6/22.
 * AQI实体类，用于解析返回的天气数据信息
 */

public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
