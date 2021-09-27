package cn.itcast.test;

import cn.itcast.config.SpringConfiguration;
import cn.itcast.service.UserService;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationTest {
    ClassPathXmlApplicationContext xmlApp = new ClassPathXmlApplicationContext("applicationContext.xml");
    //    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
    AnnotationConfigApplicationContext annoApp = new AnnotationConfigApplicationContext(SpringConfiguration.class);

    @Test
    public void springAnnotationTest01(){
        UserService userService = xmlApp.getBean(UserService.class);
        userService.saveUser();
    }

    @Test
    public void springAnnotationTest02(){
        UserService userService = annoApp.getBean(UserService.class);
        userService.saveUser();
    }

    @After
    public void after(){
        xmlApp.close();
        annoApp.close();
    }
}
