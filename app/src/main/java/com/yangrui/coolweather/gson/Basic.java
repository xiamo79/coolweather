package com.yangrui.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 杨瑞 on 2016/12/14.
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

