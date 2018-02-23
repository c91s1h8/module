package com.csh.test.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "druid")
@Data
public class DruidConfig {
    private String url;
    private String username;
    private String password;
    private int maxActive;
    private int minIdle;
    private int initialSize;
    private boolean testOnBorrow;
    private String dirverClassName;
}
