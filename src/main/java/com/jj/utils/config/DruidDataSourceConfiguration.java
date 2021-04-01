package com.jj.utils.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.beans.ConstructorProperties;

/**
 * @ClassName DruidDataSourceConfiguration
 * @Description TODO
 * @Author tianshuo
 * @Date 2021/3/16 16:36
 * @Version 1.0
 **/
public class DruidDataSourceConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }
}
