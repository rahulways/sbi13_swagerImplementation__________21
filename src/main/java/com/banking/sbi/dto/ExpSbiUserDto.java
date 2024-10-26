package com.banking.sbi.dto;

public class ExpSbiUserDto {

	String expUserEmail;
	long id;
	Long expMobileNo;

	public String getExpUserEmail() {
		return expUserEmail;
	}

	public void setExpUserEmail(String expUserEmail) {
		this.expUserEmail = expUserEmail;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getExpMobileNo() {
		return expMobileNo;
	}

	public void setExpMobileNo(Long expMobileNo) {
		this.expMobileNo = expMobileNo;
	}

	@Override
	public String toString() {
		return "SbiUserDto2 [expUserEmail=" + expUserEmail + ", id=" + id + ", expMobileNo=" + expMobileNo + "]";
	}

}
