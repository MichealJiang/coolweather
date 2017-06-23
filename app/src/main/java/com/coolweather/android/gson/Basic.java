package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 79986 on 2017/6/22.
 * GSON实体类之basic，city:城市名，id:城市对应的天气id， loc:天气的更新时间
 * 使用@SerializedName注解的方式让JSON字段和Java字段之间建立映射关系
 * 用于解析返回的天气数据信息
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
