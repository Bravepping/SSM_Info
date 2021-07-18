package com.handler;

import com.pojo.Admin;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession();
        Admin admin=(Admin) session.getAttribute("admin");
        if (admin==null){
            response.sendRedirect(request.getContextPath()+"/login.jsp");
            return false;
        }
        return true;

    }
}
