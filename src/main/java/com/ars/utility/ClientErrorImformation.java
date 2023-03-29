package com.ars.utility;

public class ClientErrorImformation {

	int errorCode;
	String errorMsg;

	public ClientErrorImformation(int value, String defaultMessage) {
		// TODO Auto-generated constructor stub
	}

	public void setErrorCode(int value) {
		errorCode = value;

	}

	public void setMessage(String msg) {
		errorMsg = msg;

	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void ClientErrorInformation(int badRequest, String errorMsg) {
		
		this.errorCode = badRequest;
		this.errorMsg = errorMsg;
	}

	public void ClientErrorInformation() {
		
	}
}
