package com.kototo.mvc.ex.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * projectName: com.atguigu.interceptor
 *
 * description: 登录保护拦截器
 */
public class LoginProtectInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object user = request.getSession().getAttribute("user");

        if (user == null){
            response.setContentType("text/html;charset=utf-8");
            //没有登录
            response.getWriter().print("请先登录,再访问! <a href='/public/resource/login'>点击此处登录</a>");
            //拦截,不到达目标地址
            return false;
        }
        return true;
    }
}