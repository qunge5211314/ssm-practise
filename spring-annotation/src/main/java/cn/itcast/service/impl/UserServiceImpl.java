package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.driver.Driver;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


// @Component("userService") // <bean id="userService" class="cn.itcast.service.impl.UserService"></bean>
@Service("userService")
//@Scope("prototype")
//@Scope("singleton")
public class UserServiceImpl implements UserService {
    // <property name="userDao", ref="userDao"></property>
    @Autowired  // 按照数据类型，从Spring容器中进行匹配的
    // @Qualifier("userDao") // 按照id值从容器中进行匹配的，但是注意此处@Qualifier结合@Autowired一起使用
    // @Resource(name = "userDao") // @Resource相当于@Qualifier+@Autowired
    private UserDao userDao;

    @Value("${jdbc.driver}")
    private String driverString;

    @Autowired
    private Driver driver;

    @Override
    public void saveUser() {
        System.out.println("driverString:"+driverString);
        System.out.println("driver:"+driver);
        System.out.println("保存用户服务方法启动中.....");
        userDao.save();
    }

    @PostConstruct
    public void init() {
        System.out.println("userService的初始化方法，用于加载资源");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("userService的销毁方法，用于释放资源");
    }
}
