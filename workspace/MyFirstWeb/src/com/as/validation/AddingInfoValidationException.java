package com.as.validation;

public class AddingInfoValidationException  extends Exception{

	private String errorMessage;
	
	public AddingInfoValidationException(String inErrorMessage){
		errorMessage = inErrorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
