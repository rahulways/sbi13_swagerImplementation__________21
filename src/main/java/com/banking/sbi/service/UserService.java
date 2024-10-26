package com.banking.sbi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.sbi.dto.HttpResponse;
import com.banking.sbi.dto.SbiUserDto;
import com.banking.sbi.model.SbiUser;
import com.banking.sbi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	
	public HttpResponse userLoginConfermation(SbiUserDto sbiUserDto) {
	
 //			SbiUser  sbiUserEmail = userRepository.existsByEmailId(sbiUserDto.getUserEmail());     // why this is wrong
		
		SbiUser  sbiUserEmail = userRepository.findByUserEmail(sbiUserDto.getUserEmail());
		 
			if (sbiUserEmail==null) {
				
				return new HttpResponse("200", "you are new user please regester to login");
			}else {
				
				return new HttpResponse("200", "Welcome you are existing user , your user id id :->  "+sbiUserEmail);
			}
	 
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
//------------------------------------------------------------------------------------------------------------ start
	public HttpResponse newUser(SbiUserDto sbiUserDto) {
		SbiUser  sbiUserEmail =userRepository.findByUserEmail(sbiUserDto.getUserEmail());
		
		if (sbiUserEmail==null) {
			SbiUser sbiUser =new SbiUser();
			sbiUser.setUserEmail(sbiUserDto.getUserEmail());
			sbiUser.setMobileNo(sbiUserDto.getMobileNo());
			sbiUser.setFirstName(sbiUserDto.getFirstName());
			sbiUser.setLastName(sbiUserDto.getLastName());
			
			userRepository.save(sbiUser);
			return new HttpResponse("200", "UserCreated sucessfully");
			
		}else {
			return new HttpResponse("200", "User already Exist ");
		}
		
//------------------------------------------------------------------------------------------------------------ end		
	 

		 

	}

	 

}
