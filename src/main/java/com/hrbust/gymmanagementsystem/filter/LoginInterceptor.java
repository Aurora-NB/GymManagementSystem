package com.hrbust.gymmanagementsystem.filter;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("loginUser") == null){
            request.getRequestDispatcher("/login").forward(request,response);
            return false;
        }
        return true;
    }
}
