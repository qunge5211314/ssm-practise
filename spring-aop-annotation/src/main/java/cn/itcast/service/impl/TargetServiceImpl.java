package cn.itcast.service.impl;

import cn.itcast.anno.MyAnno;
import cn.itcast.enumeration.Permission;
import cn.itcast.service.TargetService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;



@Service
public class TargetServiceImpl implements TargetService, ApplicationContextAware {
    private ApplicationContext app;

    @Override
    @MyAnno(permission = Permission.WRITE)
    public String save(String s) {
//        System.out.println(s);
        System.out.println("save running...........");
        TargetService targetService = (TargetService) app.getBean("targetService");
        targetService.test();
        return s;
    }

    public void test(){
        System.out.println("test");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.app = applicationContext;
    }
}
