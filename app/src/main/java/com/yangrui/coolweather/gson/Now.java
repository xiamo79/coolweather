package com.yangrui.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 杨瑞 on 2016/12/14.
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
