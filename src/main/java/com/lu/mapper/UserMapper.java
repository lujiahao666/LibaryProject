package com.lu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lu.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

    void updateByInfo(@Param("sid") String sid,@Param("selectlimit") int selectlimit);


}
