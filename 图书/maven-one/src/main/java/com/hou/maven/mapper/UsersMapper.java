package com.hou.maven.mapper;

import org.apache.ibatis.annotations.Mapper;


import com.hou.maven.dto.Users;

@Mapper
public interface UsersMapper {
   
	Users login(Users users);

}
