package com.yinyu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yinyu.entity.User;
import com.yinyu.mapper.UserMapper;
import com.yinyu.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

  @Override
  public List<User> findList() {
    return new User().selectAll();
  }

  @Override
  public boolean save(User entity) {
    return super.save(entity);
  }
}
