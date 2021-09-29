package cn.itcast.service.impl;

import cn.itcast.service.TargetService;
import org.springframework.stereotype.Service;

@Service
public class TargetServiceImpl implements TargetService {
    @Override
    public void save() {
        System.out.println("save running...........");
    }
}
