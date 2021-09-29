package cn.itcast.service.impl;

import cn.itcast.service.TargetService;
import org.springframework.stereotype.Service;

@Service
public class TargetServiceImpl implements TargetService {
    @Override
    public String save(String s) {
        System.out.println(s);
        System.out.println("save running...........");
        return s;
    }
}
