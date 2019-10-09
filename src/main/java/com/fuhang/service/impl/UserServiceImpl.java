package com.fuhang.service.impl;

import com.fuhang.entity.User;
import com.fuhang.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fuhang.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息表 服务实现类
 * </p>
 *
 * @author yuan
 * @since 2019-09-30
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    public User getUserById(long id) {
        log.info("根据id获取用户，id: " + id);
        return baseMapper.getUserById(id);
    }

}
