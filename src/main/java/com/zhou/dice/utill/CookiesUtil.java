package com.zhou.dice.utill;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookiesUtil {

     public static String getCookies(HttpServletRequest request,String key){
        Cookie[] cookies =  request.getCookies();
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals(key)){
                    return cookie.getValue();
                }
            }
        }

        return  null;
    }



}
