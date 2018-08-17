package com.example.springbootintegration.interceptor;


import com.example.springbootintegration.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("method == "+request.getMethod());

//        PrintWriter out = response.getWriter();
//
//        User user = new User();
//        user.setName("meihao");
//        user.setAge(23);
//
//        response.setContentType("application/json; charset=utf-8");
//        out.print(user);
//        out.flush();
//        out.close();

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
