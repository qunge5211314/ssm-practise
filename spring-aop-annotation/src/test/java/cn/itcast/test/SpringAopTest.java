package cn.itcast.test;

import cn.itcast.service.TargetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAopTest {
    private TargetService targetService;

    @Test
    public void test1() {
        targetService.save("测试，哈哈");
    }
}
