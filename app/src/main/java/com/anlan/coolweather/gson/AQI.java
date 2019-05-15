package com.anlan.coolweather.gson;

/**
 * Created by Administrator on 2019/5/15 0015.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
