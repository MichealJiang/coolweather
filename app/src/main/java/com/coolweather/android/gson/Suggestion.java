package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 79986 on 2017/6/22.
 * 实体类Suggestion，用于解析返回的天气数据信息
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;
    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
