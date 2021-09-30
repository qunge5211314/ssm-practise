package cn.itcast.test;

import cn.itcast.service.TargetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAopTest {
    @Autowired
    private TargetService targetService;

    @Test
    public void test1() {
        Map<String, String> map = new HashMap() {{
            put("asd", "asd");
            put("vs", "vs");
        }};
        System.out.println(map);
        targetService.save("测试，哈哈");
    }
}
