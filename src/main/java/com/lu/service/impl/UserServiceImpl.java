package com.lu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lu.entity.User;
import com.lu.entity.UserBind;
import com.lu.mapper.UserMapper;
import com.lu.service.UserBindService;
import com.lu.service.UserService;
import com.lu.vo.UserInfoVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserBindService userBindService;
    @Transactional
    @Override
    public void updateByUserInfo(UserInfoVo userInfoVo) {
        UserBind userBind = new UserBind();
        BeanUtils.copyProperties(userInfoVo,userBind);
        userBindService.save(userBind);
        int selectlimit = userInfoVo.getSelectlimit();
        String sid = userInfoVo.getSid();
        System.out.println(userInfoVo);
        baseMapper.updateByInfo(sid,selectlimit);
    }

    @Override
    public User getUser(String sid) {
        //存在则取，不存在则新建
        User user = this.getOne(
                new QueryWrapper<User>().eq("sid",sid)
        );
        if(!ObjectUtils.isEmpty(user)){
            return user;
        }
        this.createUser(sid);
        return this.getUser(sid);
    }

    @Override
    public void createUser(String sid) {
        User user = new User();
        user.setSid(sid);
        this.save(user);
    }

    @Override
    public void insertSid(User user) {
        baseMapper.insert(user);
    }
}
