package com.shiyanshi.dashuju.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 登陆检查
 */
public class LoginHandler implements HandlerInterceptor {
    //目标方法执行之前进行登陆检查
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginUser = request.getSession().getAttribute("LoginUser");         //从session中取得Loginuser的数据
        if(loginUser !=null ){              //已登陆
            return true;
        }else{                              //未登陆
            request.setAttribute("msg","请登录");
            request.getRequestDispatcher("/Login.html").forward(request,response);
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
