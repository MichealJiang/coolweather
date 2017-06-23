package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 79986 on 2017/6/22.
 * Now实体类，用于解析返回的天气数据信息
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
