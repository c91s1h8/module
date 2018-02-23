package com.csh.test.config;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(DruidConfig.class)
@Slf4j
@EnableTransactionManagement // 开启事物
@MapperScan("com.csh.test.mapper") // Mybatis mapper扫描2
public class DataSourceConfig {
    @Resource
    DruidConfig druidConfig;

    @Bean
    public DataSource dataSource() {
        log.info("==============================创建数据源==============================");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(druidConfig.getDirverClassName());
        dataSource.setUrl(druidConfig.getUrl());
        dataSource.setUsername(druidConfig.getUsername());
        dataSource.setPassword(druidConfig.getPassword());
        dataSource.setInitialSize(druidConfig.getInitialSize());
        dataSource.setMinIdle(druidConfig.getMinIdle());
        dataSource.setMaxActive(druidConfig.getMaxActive());
        dataSource.setTestOnBorrow(druidConfig.isTestOnBorrow());
        return dataSource;
    }
}
