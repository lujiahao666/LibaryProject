package com.lu.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class UserInfoVo {
    //{sid: "878545", roomid: 2, seatid: "22", flowid: 0, flow: {}, is_exist: false, selectlimit: 1}
    private String sid;
    private int roomid;
    private int seatid;
    private int flowid;
    private int selectlimit;
    private int roomseatid;
}
