package com.yinyu.controller;

import com.yinyu.entity.User;
import com.yinyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

  @Autowired
  private UserService userService;

  @GetMapping(value = "save")
  public boolean save() {
    User user = new User();
    user.setId(9);
    user.setUsername("caocao");
    user.setOrgCode(1009);

    com.zaxxer.hikari.HikariDataSource dataSource;

    return userService.save(user);
  }

  @GetMapping(value = "list")
  public List<User> findList() {
     return userService.findList();
  }
}
