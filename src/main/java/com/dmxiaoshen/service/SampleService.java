package com.dmxiaoshen.service;

/**
 * Created by hzhsg on 2018/8/7.
 */
public class SampleService {
    private String appId;
    private String appKey;

    public SampleService(String appId, String appKey) {
        this.appId = appId;
        this.appKey = appKey;
    }

    public String show(){
        return "SampleService{" +
                "appId='" + appId + '\'' +
                ", appKey='" + appKey + '\'' +
                '}';
    }

}
