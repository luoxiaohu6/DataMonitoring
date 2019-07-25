package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.UserLogin;
import com.shiyanshi.dashuju.Pojo.User;
import com.shiyanshi.dashuju.Seriver.UserLoginSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginImp implements UserLoginSeriver {

    @Autowired
    private UserLogin userLogin;

    @Override
    public User findUser(User user) {

        return this.userLogin.findUser(user);
    }
}
