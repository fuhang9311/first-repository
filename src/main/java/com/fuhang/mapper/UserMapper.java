package com.fuhang.mapper;

import com.fuhang.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户基本信息表 Mapper 接口
 * </p>
 *
 * @author yuan
 * @since 2019-09-30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    public User getUserById(long id);
}
