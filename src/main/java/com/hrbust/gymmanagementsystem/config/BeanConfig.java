package com.hrbust.gymmanagementsystem.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class BeanConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    DataSource druidDataSource(){
        return new DruidDataSource();
    }

}
