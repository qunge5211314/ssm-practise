package cn.itcast.config;

import cn.itcast.driver.Driver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

// <context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
public class DataConfiguration {
    @Value("${jdbc.driver}")
    private String driver;

    @Bean
    public Driver dirver() {
        return new Driver(driver);
    }
}
