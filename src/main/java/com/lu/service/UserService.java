package com.lu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lu.entity.User;
import com.lu.vo.UserInfoVo;
import org.springframework.stereotype.Service;


public interface UserService extends IService<User> {

    void updateByUserInfo(UserInfoVo userInfoVo);

    User getUser(String sid);

    void createUser(String sid);
    void insertSid(User user);
}
