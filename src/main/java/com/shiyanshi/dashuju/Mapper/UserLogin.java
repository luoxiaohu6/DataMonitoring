package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLogin {

    User findUser(User user);

}
