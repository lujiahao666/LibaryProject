package com.lu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lu.entity.UserBind;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserBindMapper extends BaseMapper<UserBind> {
}
