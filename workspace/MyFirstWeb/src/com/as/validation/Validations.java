package com.as.validation;

public class Validations {

	public String validateFirstName(String firstname){
		
		if(isDataFieldBlank(firstname)){
			return ErrorPage.USER_FIRST_NAME;
		}
		return "";
	}
	public String validateMiddleName(String middlename){
		if(isDataFieldBlank(middlename)){
			return ErrorPage.USER_MIDDLE_NAME;
		}
		return "";
	}
	public String validateLastName(String lastname){
		if(isDataFieldBlank(lastname)){
			return ErrorPage.USER_LAST_NAME;
		}
		return "";
	}
	public String validateGender(String gender){
		if(isDataFieldBlank(gender)){
			return ErrorPage.USER_GENDER;
		}
		return "";
	}
	
	
	public String validateAddress(String address){
		if(isDataFieldBlank(address)){
			return ErrorPage.USER_ADDRESS;
		}
		return "";
	}
	public String validateCity(String city){
		if(isDataFieldBlank(city)){
			return ErrorPage.USER_CITY;
		}
		return "";
	}
	public String validateCountry(String country){
		if(isDataFieldBlank(country)){
			return ErrorPage.USER_COUNTRY;
		}
		return "";
	}
	public String validateState(String state){
		if(isDataFieldBlank(state)){
			return ErrorPage.USER_STATE;
		}
		return "";
	}
	public String validatePhone(String phone){
		if(isDataFieldBlank(phone)){
			return ErrorPage.USER_PHONE;
		}
		return "";
	}
	
	
	public String validateBank(String bank){
		if(isDataFieldBlank(bank)){
			return ErrorPage.USER_BANK_NAME;
		}
		return "";
	}
	public String validateActNo(String act_no){
		if(isDataFieldBlank(act_no)){
			return ErrorPage.USER_ACCOUNT_NO;
		}
		return "";
	}
	
	public String validateSSN(String ssn){
		if(isDataFieldBlank(ssn)){
			return ErrorPage.USER_SSN;
		}
		return "";
	}
	

 private boolean isDataFieldBlank(String data) {
		if(data == null || data.trim().equals("")){
			return true;
		}
		return false;
	}

	public boolean isDataLength(String data) {
		if (data.length() < 15)
			return false;
		else
			return true;
	}

}
