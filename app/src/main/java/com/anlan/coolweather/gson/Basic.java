package com.anlan.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/5/15 0015.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
