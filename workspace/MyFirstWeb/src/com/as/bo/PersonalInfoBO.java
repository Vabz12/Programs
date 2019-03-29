package com.as.bo;

import com.as.dao.AddInformationInDatabaseDBAccess;
import com.as.servlets.BankInfoServlet;
import com.as.validation.AddingInfoValidationException;
import com.as.validation.Validations;

public class PersonalInfoBO {

	public PersonalInfoBO() {
		super();
	}
	
	public static void addPersonalInfo(PersonProfileBean personalDetail) throws AddingInfoValidationException, Exception {
		StringBuffer errorMessage = new StringBuffer();

		// 2a : Validation ....
		Validations personalValidation = new Validations();
		String errorFirstname = personalValidation.validateFirstName(personalDetail.getFirstName());
		String errorMiddlename = personalValidation.validateMiddleName(personalDetail.getMiddleName());
		String errorLastname = personalValidation.validateLastName(personalDetail.getLastName());
		String errorGender = personalValidation.validateGender(personalDetail.getGender());

		errorMessage.append(errorFirstname);
		errorMessage.append(errorMiddlename);
		errorMessage.append(errorLastname);
		errorMessage.append(errorGender);

		// 2b : No error from validations, call db component
		if (errorMessage.length() == 0) {
			// AddInformationInDatabaseDBAccess dbCon = new
			// AddInformationInDatabaseDBAccess();
			// dbCon.insertInfoInDatabase(personalDetail);

		} else {
			AddingInfoValidationException addingValidInfoException = new AddingInfoValidationException(
					errorMessage.toString());
			throw addingValidInfoException;
		}
		return;
	}

	public void addContactInfo(PersonProfileBean contactDetail) throws AddingInfoValidationException, Exception {
		StringBuffer errorMessage = new StringBuffer();

		// 2a : Validation ....
		Validations personalValidation = new Validations();

		String errorAddress = personalValidation.validateAddress(contactDetail.getAddress());
		String errorState = personalValidation.validateState(contactDetail.getState());
		String errorCity = personalValidation.validateCity(contactDetail.getCity());
		String errorCountry = personalValidation.validateCountry(contactDetail.getCountry());
		String errorPhone = personalValidation.validatePhone(contactDetail.getPhone());

		errorMessage.append(errorAddress);
		errorMessage.append(errorState);
		errorMessage.append(errorCity);
		errorMessage.append(errorCountry);
		errorMessage.append(errorPhone);

		// 2b : No error from validations, call db component
		if (errorMessage.length() == 0) {
			// AddInformationInDatabaseDBAccess dbCon = new
			// AddInformationInDatabaseDBAccess();
			// dbCon.insertInfoInDatabase(contactDetail);
		} else {
			AddingInfoValidationException addingValidInfoException = new AddingInfoValidationException(
					errorMessage.toString());
			throw addingValidInfoException;
		}
		return;
	}

	public void addBankInfo(PersonProfileBean bankDetail) throws AddingInfoValidationException, Exception {
		StringBuffer errorMessage = new StringBuffer();

		// 2a : Validation ....
		Validations personalValidation = new Validations();

		String errorBank = personalValidation.validateBank(bankDetail.getBank());
		String errorActNo = personalValidation.validateActNo(bankDetail.getActNo());
		String errorSsn = personalValidation.validateSSN(bankDetail.getSsn());

		errorMessage.append(errorBank);
		errorMessage.append(errorActNo);
		errorMessage.append(errorSsn);

		if (errorMessage.length() == 0) {
			// AddInformationInDatabaseDBAccess dbCon = new
			// AddInformationInDatabaseDBAccess();
			// dbCon.insertInfoInDatabase(bankDetail);
		} else {
			AddingInfoValidationException addingValidInfoException = new AddingInfoValidationException(
					errorMessage.toString());
			throw addingValidInfoException;
		}
		return;
	}

	public void addPersonDeatils(PersonProfileBean personProfileBean) {

		AddInformationInDatabaseDBAccess dbCon = new AddInformationInDatabaseDBAccess();
		dbCon.insertInfoInDatabase(personProfileBean);
	}

}
