package com.shiyanshi.dashuju.Controller;


import com.shiyanshi.dashuju.Pojo.User;
import com.shiyanshi.dashuju.Seriver.UserLoginSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserLoginController {

    @Autowired
    private UserLoginSeriver userLoginSeriver;


    @PostMapping(value = "/Login")
    public String login(@RequestParam("Username")String Username,
                        @RequestParam("PassWord")String Password,
                        Map<String,Object> map, HttpSession session) {
        User user1 = new User(Username, Password);

        if (userLoginSeriver.findUser(user1) != null) {
            System.out.println("ok");
            session.setAttribute("LoginUser", Username);
            return "redirect:main";
        } else {
            map.put("msg", "账号或密码错误");
            return "Login";
        }
    }
}
