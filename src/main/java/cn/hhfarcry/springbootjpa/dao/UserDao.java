package cn.hhfarcry.springbootjpa.dao;

import cn.hhfarcry.springbootjpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: springbootjpa
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-07 17:33
 */
public interface UserDao extends JpaRepository<UserEntity,Long> {
}
