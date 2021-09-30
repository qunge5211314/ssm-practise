package cn.itcast.aspect;

import cn.itcast.anno.MyAnno;
import cn.itcast.enumeration.Permission;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class MyAspect {

    @Pointcut("@annotation(cn.itcast.anno.MyAnno)")
    public void permisionCheck(){}
    // 配置前置通知
    @Before(value = "permisionCheck() && @annotation(myAnno)")
    public void before(MyAnno myAnno){
        System.out.println("前置增强........");
        System.out.println(myAnno.permission().getName());
        System.out.println(myAnno.permission().getId());
    }


}
