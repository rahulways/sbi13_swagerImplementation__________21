package com.banking.sbi.dto;

public class HttpResponse {

	String status;
	String statusMessage;

	public HttpResponse(String status, String statusMessage) {
		super();
		this.status = status;
		this.statusMessage = statusMessage;
	}

	public HttpResponse() {
		super();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

}
