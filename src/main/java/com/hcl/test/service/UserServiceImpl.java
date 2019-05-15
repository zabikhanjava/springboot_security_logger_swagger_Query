package com.hcl.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.test.Controller.repository.UserRepository;
import com.hcl.test.dto.UserLoginDto;
import com.hcl.test.dto.UserRegistrationDto;
import com.hcl.test.model.User;
import com.hcl.test.responsemodel.UserResponse;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserResponse login(UserLoginDto userLoginDto) {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByName(userLoginDto.getUserName());
		UserResponse userResponse = new UserResponse();
		if (user != null) {

			if (userLoginDto.getPassword().equals(userLoginDto.getConfirmPassword())) {
				if (user.getName().equals(userLoginDto.getUserName())
						&& user.getPassword().equals(userLoginDto.getPassword())) {
					userResponse.setStatisMessage("you logged in successfully");

				} else {
					userResponse.setStatisMessage("username or password is wrong");

				}

			} else {

				userResponse.setStatisMessage("password and confirm password do not match");
			}
		} else {
			userResponse.setStatisMessage("user not found");
		}
		List<User> userList=userRepository.findByCity("bangalore");
		for(User user1 : userList)
		System.out.println(user1.toString());
		return userResponse;
	}

	@Override
	public UserResponse register(UserRegistrationDto userRegistrationDto) {
		// TODO Auto-generated method stub
		UserResponse userResponse = new UserResponse();

		if (userRegistrationDto.getPassword().equals(userRegistrationDto.getConfirmPassword())) {

			User user = new User();
			user.setName(userRegistrationDto.getUserName());
			user.setEmail(userRegistrationDto.getEmail());
			user.setCity(userRegistrationDto.getCity());
			user.setPassword(userRegistrationDto.getPassword());
			User userSAved = userRepository.save(user);
			userResponse.setStatisMessage("Registration Successfull");
			userResponse.setUser(userSAved);
		} else {
			userResponse.setStatisMessage("password does not match");

		}

		return userResponse;
	}

}
