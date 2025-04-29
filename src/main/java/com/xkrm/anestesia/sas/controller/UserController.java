package com.xkrm.anestesia.sas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xkrm.anestesia.sas.domain.Users;
import com.xkrm.anestesia.sas.dto.UserDTO;
import com.xkrm.anestesia.sas.mapper.UserMapper;
import com.xkrm.anestesia.sas.service.UsersService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("api/v1/user")
public class UserController {
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	UsersService usersService;
	
	@PostMapping
	public UserDTO save(@Valid @RequestBody UserDTO userDTO) throws Exception {
		Users user = userMapper.userDTOtoUser(userDTO);
		user = usersService.save(user);
		userDTO = userMapper.userstoUserDTO(user);
		return userDTO;
	}
	

}
