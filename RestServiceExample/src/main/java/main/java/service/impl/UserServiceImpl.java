package main.java.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.UserRepository;
import main.java.io.entity.UserEntity;
import main.java.service.UserService;
import main.java.share.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto user) {

		if(userRepository.findUserByEmail(user.getEmail())!=null) throw new RuntimeException("Email already exist");
		
		UserEntity userEntity = new UserEntity();

		BeanUtils.copyProperties(user, userEntity);

		userEntity.setEncryptedPassword("Encrypted password XXXXX");
		
		userEntity.setUserId("UID101");
		
		UserEntity storedUserDetail = userRepository.save(userEntity);

		UserDto returnDto = new UserDto();

		BeanUtils.copyProperties(storedUserDetail, returnDto);
		
h

		return returnDto;
	}

}
