package com.coolweather.android.gson;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Weather {

    // 引用其他类
    public String status;   // status数据，成功返回ok
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
