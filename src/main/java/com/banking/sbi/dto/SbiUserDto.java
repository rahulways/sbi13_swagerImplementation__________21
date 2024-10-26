package com.banking.sbi.dto;

public class SbiUserDto {

	String userEmail;
	long id;
	Long mobileNo;
	String firstName;
	String lastName;
	
	
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "SbiUserDto [userEmail=" + userEmail + ", id=" + id + ", mobileNo=" + mobileNo + ", firstName="
				+ firstName + ", lastName=" + lastName + "]";
	}
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
 
	
}
