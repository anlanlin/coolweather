package com.anlan.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2019/5/15 0015.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
