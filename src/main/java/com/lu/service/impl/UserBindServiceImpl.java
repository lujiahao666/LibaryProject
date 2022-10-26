package com.lu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lu.entity.UserBind;
import com.lu.mapper.UserBindMapper;
import com.lu.service.UserBindService;
import org.springframework.stereotype.Service;

@Service
public class UserBindServiceImpl extends ServiceImpl<UserBindMapper, UserBind> implements UserBindService {
}
