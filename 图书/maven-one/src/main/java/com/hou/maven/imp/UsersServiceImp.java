package com.hou.maven.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hou.maven.dto.Users;
import com.hou.maven.mapper.UsersMapper;
import com.hou.maven.service.UsersService;

@Service
public class UsersServiceImp implements UsersService{
  @Resource
  private UsersMapper usersMapper;

@Override
public Users login(Users users) {
	// TODO Auto-generated method stub
	return this.usersMapper.login(users);
}
}
