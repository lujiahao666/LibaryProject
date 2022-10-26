package com.lu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lu.entity.User;
import com.lu.service.UserBindService;
import com.lu.service.UserService;
import com.lu.vo.UserInfoVo;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


@RestController
public class LibaryController {
    @Autowired
    UserService userService;
    @Autowired
    UserBindService userBindService;
    @GetMapping("/userinfo")
    public void getMessageById(String sid, HttpServletResponse httpServletResponse) throws IOException {
        User user = userService.getUser(sid);
        String s = JSON.toJSONString(user);
        httpServletResponse.setContentType("text/html");

        JSONObject obj=new JSONObject();
        obj.put("status","200");
        obj.put("data",JSON.parse(s));
        httpServletResponse.getOutputStream().print(obj.toJSONString());
    }

    @PostMapping("/userinfo")
    public void updateMessageByUserInfo(HttpServletRequest req,HttpServletResponse httpServletResponse) throws IOException {
        ServletInputStream inputStream = req.getInputStream();
        int contentLength = req.getContentLength();

        byte buffer[]=new byte[contentLength];
        inputStream.read(buffer,0,contentLength);

        JSONObject obj= (JSONObject) JSON.parse(buffer);
        obj=(JSONObject) obj.get("userinfo");
        //UserInfoVo userInfoVo =new UserInfoVo(obj.get("sid"),obj.get("roomid"),obj.get());

        System.out.println(obj.toJSONString());

        httpServletResponse.setContentType("text/html");

        JSONObject obj1=new JSONObject();
        obj1.put("status","200");
        obj1.put("data","2--");
        httpServletResponse.getOutputStream().print(obj1.toJSONString());

    }



}
