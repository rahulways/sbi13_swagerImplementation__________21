package com.banking.sbi.repository;

import org.springframework.data.repository.CrudRepository;

import com.banking.sbi.model.SbiUser;
public interface UserRepository extends CrudRepository<SbiUser, Long> {
	
	SbiUser existsByuserEmail(String emailId);




//------------------------------------------------------------------------------------------------------------ start


 	SbiUser findByUserEmail(String emailId);

	
}
//------------------------------------------------------------------------------------------------------------ end












