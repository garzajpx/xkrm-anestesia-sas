package com.xkrm.anestesia.sas.service.impl;

import org.springframework.stereotype.Service;

import com.xkrm.anestesia.sas.domain.Users;
import com.xkrm.anestesia.sas.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Override
	public Users save(Users users) throws Exception {
		Users user = new Users();
		user.setUserEmail("jupagaru@gamil.com");
		user.setName("Juan");
		user.setLastName("Garcia");
		user.setEnable("S");
		return user;
	}
	
	

}
