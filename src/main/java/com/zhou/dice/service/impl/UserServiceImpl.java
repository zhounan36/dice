package com.zhou.dice.service.impl;

import com.zhou.dice.entity.User;
import com.zhou.dice.mapper.UserMapper;
import com.zhou.dice.service.IUserService;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhounan
 * @since 2020-10-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
