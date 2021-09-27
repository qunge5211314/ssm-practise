package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component("userDao") // <bean id="userDao" class="cn.itcast.dao.impl.UserDaoImpl"></bean>
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("保存用户");
    }
}
