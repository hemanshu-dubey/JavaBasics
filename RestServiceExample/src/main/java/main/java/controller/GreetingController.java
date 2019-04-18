package main.java.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.model.request.UserDetailsRequestModel;
import main.java.model.response.UserRest;
import main.java.service.UserService;
import main.java.share.dto.UserDto;

@RestController
@RequestMapping("users")
public class GreetingController {

	@Autowired
	UserService userService;
	
	@GetMapping
	public String getUser() {
		return "Get Method";
	}

	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
		
		UserDto userDto = new UserDto();
		
		BeanUtils.copyProperties(userDetails, userDto);
		UserDto createdUser= userService.createUser(userDto);
		
		UserRest userRest=new UserRest();
		BeanUtils.copyProperties(createdUser, userRest);
		
		return userRest;
	}

	@PutMapping
	public String updateUser() {
		return "Put Method";
	}

	@DeleteMapping
	public String deleteUser() {
		return "Delete Method";
	}

}
