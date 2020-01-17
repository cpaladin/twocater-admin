package com.twocater.admin.business.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
public class BusinessConfig {
    @Value("${from}")
    private String from;

    public String getFrom() {
        return from;
    }
}
