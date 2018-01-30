package com.hou.maven.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hou.maven.dto.Users;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		
        //获取Session  
        HttpSession session = request.getSession();  
        Users users = (Users)session.getAttribute("users");  
          
        if( null==users ){  
        	request.getRequestDispatcher("/WEB-INF/jsp/loginUI.jsp").forward(request, response);  
       return false;
        }  
        //不符合条件的，跳转到登录界面  
         
          
        return true;  
	}

}
