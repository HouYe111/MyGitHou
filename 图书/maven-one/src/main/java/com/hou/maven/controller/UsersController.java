package com.hou.maven.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hou.maven.dto.Users;
import com.hou.maven.service.UsersService;

@Controller
@RequestMapping("/admin/users")
public class UsersController {
  @Resource
  private UsersService usersService;
  
  @RequestMapping(value="loginUI",method=RequestMethod.GET)
  public String loginUI() {
	  return "loginUI";
  }
  @RequestMapping(value="login",method=RequestMethod.POST)
  @ResponseBody
  public String login(Users users,HttpServletRequest request) {
	   Users user=this.usersService.login(users);
	   if(null!=user) {
		   HttpSession session=request.getSession();
		   session.setAttribute("user", user);
		   return "1";
	   }else {
		   return "0";
	   }
  }
}
