package com.xkrm.anestesia.sas.mapper;

import java.util.List;

import com.xkrm.anestesia.sas.domain.Users;
import com.xkrm.anestesia.sas.dto.UserDTO;

public interface UserMapper {
	
	public UserDTO userstoUserDTO(Users users);
	
	public Users userDTOtoUser(UserDTO userDTO);
	
	public List<UserDTO> usersListTouserDTOList(List<Users> users);
	
	public List<Users> userDTOListToUserList(List<UserDTO> userDTOs);

}
