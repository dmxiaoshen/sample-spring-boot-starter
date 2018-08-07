package com.dmxiaoshen;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by hzhsg on 2018/8/7.
 */
@ConfigurationProperties("sample.conf")
public class SampleProperties {

    private String appId;
    private String appKey;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
}
