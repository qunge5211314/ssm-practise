package cn.itcast.anno;

import cn.itcast.enumeration.Permission;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    Permission permission() default Permission.READ;
}
