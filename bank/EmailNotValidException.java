package com.assignments.bank;

public class EmailNotValidException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2221606139685021677L;
	private String errorMessage;
	public EmailNotValidException(String errorMessage) {
		super(errorMessage);
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
