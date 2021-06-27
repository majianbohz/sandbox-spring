package com.yinyu.service;

import com.yinyu.entity.User;

import java.util.List;

public interface UserService {

  public List<User> findList();
  public boolean save(User user);
}
