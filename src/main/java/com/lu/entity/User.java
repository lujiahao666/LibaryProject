package com.lu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data


public class User implements Serializable {
    //`openid``sendlimit``immsendlimit``class``iphone``selectlimit`
    private String sid;
    private String openid;
    private int sendlimit;
    private int immsendlimit;
    private String class1;
    private String iphone;
    private int selectlimit;
}
