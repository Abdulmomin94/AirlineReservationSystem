package com.ars.exception;

public class ARSystServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	private String errorCode;

	public ARSystServiceException(String code, String message) {
		super(message);
		this.errorCode = code;
	}

	public ARSystServiceException(String message) {
		super(message);

	}

}
