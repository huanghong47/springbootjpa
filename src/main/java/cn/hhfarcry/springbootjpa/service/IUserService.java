package cn.hhfarcry.springbootjpa.service;

import cn.hhfarcry.springbootjpa.entity.UserEntity;

import java.util.List;

/**
 * @program: springbootjpa
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-07 17:35
 */
public interface IUserService {

    public UserEntity add(UserEntity param);
    public List<UserEntity>getList();
}
