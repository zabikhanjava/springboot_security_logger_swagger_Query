package com.hcl.test.service;

import org.springframework.stereotype.Service;

import com.hcl.test.dto.UserLoginDto;
import com.hcl.test.dto.UserRegistrationDto;
import com.hcl.test.responsemodel.UserResponse;

public interface UserService {

	UserResponse login(UserLoginDto userLoginDto);

	UserResponse register(UserRegistrationDto userRegistrationDto);

}
