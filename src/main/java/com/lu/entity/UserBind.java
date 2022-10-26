package com.lu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UserBind {
    private String sid;
    private int roomid;
    private int roomseatid;
    private int seatid;
    private int flowid;
}
