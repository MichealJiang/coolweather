package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 79986 on 2017/6/22.
 * Forecast实体类，用于解析返回的天气数据信息
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }

}
