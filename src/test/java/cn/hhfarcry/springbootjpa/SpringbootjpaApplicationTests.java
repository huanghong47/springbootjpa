package cn.hhfarcry.springbootjpa;

import cn.hhfarcry.springbootjpa.dao.UserDao;
import cn.hhfarcry.springbootjpa.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootjpaApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void test1(){
        UserEntity user = new UserEntity();
        user.setName("黄洪hh");
        userDao.saveAndFlush(user);
        List<UserEntity>users = userDao.findAll();
        System.out.println(users.size());
    }


}

