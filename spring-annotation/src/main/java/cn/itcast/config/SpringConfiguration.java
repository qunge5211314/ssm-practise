package cn.itcast.config;

import cn.itcast.driver.Driver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

// 标志该类是Spring的核心配置类
@Configuration
// <context:component-scan base-package="cn.itcast"/>
@ComponentScan("cn.itcast")
// <import resource=""/>
@Import({DataConfiguration.class})
public class SpringConfiguration {


}
