package cn.itcast.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
public class MyAspect {
    // 配置前置通知
    @Before("execution(* cn.itcast.service.impl.*.*(..))")
    public void before(){
        System.out.println("前置增强........");
    }


}
