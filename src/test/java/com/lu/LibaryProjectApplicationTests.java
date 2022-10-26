package com.lu;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lu.entity.User;
import com.lu.mapper.UserMapper;
import com.lu.service.UserService;
import com.lu.vo.UserInfoVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibaryProjectApplicationTests {
    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        UserInfoVo userInfoVo = new UserInfoVo();
        userInfoVo.setSid("2");
        userInfoVo.setRoomid(1);
        userInfoVo.setRoomseatid(2);
        userInfoVo.setSeatid(1);
        userInfoVo.setFlowid(1);
        userInfoVo.setSelectlimit(666);
        userService.updateByUserInfo(userInfoVo);
    }
    @Test
    void testUser(){
        User byId = userService.getById("123");
        System.out.println(byId);
    }
    @Test
    void test1(){

        User sid = userService.getOne(
                new QueryWrapper<User>().eq("sid", "123")
        );
        System.out.println(sid);
    }
    @Test
    void test4(){
        User user = userService.getUser("12345");
        System.out.println(user);
    }
}
