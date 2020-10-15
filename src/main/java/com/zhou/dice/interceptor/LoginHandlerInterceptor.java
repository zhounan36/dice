package com.zhou.dice.interceptor;


import com.zhou.dice.utill.CookiesUtil;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginHandlerInterceptor implements HandlerInterceptor {

    //在目标方法执行之前运行此方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token= CookiesUtil.getCookies(request,"Utoken");
        if(StringUtils.isEmpty(token)){
            //说明用户未登陆
            request.setAttribute("msg","请先登陆");
            request.getRequestDispatcher("login").forward(request,response);
            return false;
        }
        return true;
    }
}