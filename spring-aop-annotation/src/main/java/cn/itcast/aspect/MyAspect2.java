package cn.itcast.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class MyAspect2 {
    // 配置环绕通知
    @Around("execution(* cn.itcast.service..*.*(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = null;
        Object[] args = joinPoint.getArgs();
        if (args.length > 0) {
            String s = (String) args[0];
            System.out.println(s);
        }
        obj = joinPoint.proceed();
        return obj;
    }
}
