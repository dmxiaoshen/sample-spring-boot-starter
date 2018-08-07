package com.dmxiaoshen;

import com.dmxiaoshen.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hzhsg on 2018/8/7.
 */
@Configuration
@ConditionalOnClass(SampleService.class)
@EnableConfigurationProperties(SampleProperties.class)
public class SampleAutoConfigure {

    @Autowired
    private SampleProperties sampleProperties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "sample.conf",value = "enabled",havingValue = "true")
    public SampleService sampleService(){
        return new SampleService(sampleProperties.getAppId(),sampleProperties.getAppKey());
    }
}
