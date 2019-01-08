package cn.hhfarcry.springbootjpa.service.impl;

import cn.hhfarcry.springbootjpa.dao.UserDao;
import cn.hhfarcry.springbootjpa.entity.UserEntity;
import cn.hhfarcry.springbootjpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: springbootjpa
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-07 17:35
 */
@Service
public class Userservice implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public UserEntity add(UserEntity param) {
        UserEntity newUser = userDao.saveAndFlush(param);
        return newUser;
    }

    @Override
    public List<UserEntity> getList() {
        return userDao.findAll();
    }
}
