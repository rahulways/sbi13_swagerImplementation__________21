package com.banking.sbi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.banking.sbi.dto.ExpSbiUserDto;
import com.banking.sbi.dto.HttpResponse;
import com.banking.sbi.dto.SbiUserDto;
import com.banking.sbi.service.UserService;

//mark class as Controller
@RestController
public class UserRegistrationController {

	@Autowired
	UserService userService;
	
	
	@PostMapping("/userLogin")
	private HttpResponse userLogin(@RequestBody SbiUserDto sbiUserDto) {
		return userService.userLoginConfermation(sbiUserDto);
	}


	@DeleteMapping("/deleteUserLogin")
	private HttpResponse deleteUserLoginok(@RequestBody SbiUserDto sbiUserDto) {
		return userService.userLoginConfermation(sbiUserDto);
	}
	
	@PutMapping("/updateUserLogin")
	private HttpResponse updateUserLoginok(@RequestBody ExpSbiUserDto expSbiUserDto) {
		return null;
	}
	
	 
	
	
	
	
	
	
	
	
	
//------------------------------------------------------------------------------------------------------------ start
	@PostMapping("/createUser")
	private HttpResponse newUser(@RequestBody SbiUserDto sbiUserDto) {
		return userService.newUser(sbiUserDto);
	}
//------------------------------------------------------------------------------------------------------------ end
	
}
