package com.baomidou.samples.druid.service;


import com.baomidou.samples.druid.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectMasterUsers();

    List<User> selectSlaveUsers();

    void addUser(User user);

    void deleteUserById(Long id);
}
