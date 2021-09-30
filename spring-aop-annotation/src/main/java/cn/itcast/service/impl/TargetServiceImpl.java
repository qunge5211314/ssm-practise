package cn.itcast.service.impl;

import cn.itcast.anno.MyAnno;
import cn.itcast.enumeration.Permission;
import cn.itcast.service.TargetService;
import org.springframework.stereotype.Service;

@Service
public class TargetServiceImpl implements TargetService {
    @Override
    @MyAnno(permission = Permission.WRITE)
    public String save(String s) {
//        System.out.println(s);
        System.out.println("save running...........");
        return s;
    }
}
