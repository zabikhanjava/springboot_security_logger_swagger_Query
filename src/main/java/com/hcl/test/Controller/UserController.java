package com.hcl.test.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.test.dto.UserLoginDto;
import com.hcl.test.dto.UserRegistrationDto;
import com.hcl.test.responsemodel.UserResponse;
import com.hcl.test.service.UserService;

@RestController
@RequestMapping("/user/")
public class UserController {

	@Autowired UserService userService;
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	/*
	 * @GetMapping(value = "/hello1") public String exeTest() {
	 * logger.debug("Entering into exeTest ==========>> "); String str = null;
	 * logger.debug("Entering into exeTest ==========>> " + str);
	 * logger.info("hello"); int length = str.length();
	 * 
	 * return "Success"; }
	 * 
	 * @GetMapping(value = "/hello2") public String nullTest() { String str = null;
	 * int length = str.length(); return "Success"; }
	 */
	@PostMapping(value = "/login")
	public UserResponse login(@RequestBody UserLoginDto userLoginDto) {
		
		UserResponse userResponse=userService.login(userLoginDto);
		return userResponse;
		
	}
	@PostMapping(value = "/register")
	public UserResponse register(@RequestBody UserRegistrationDto userRegistrationDto) {
		
		UserResponse userResponse=userService.register(userRegistrationDto);
		return userResponse;
		
	}

}
