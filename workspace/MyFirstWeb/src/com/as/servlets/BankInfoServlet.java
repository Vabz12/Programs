package com.as.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.as.bo.PersonProfileBean;
import com.as.bo.PersonalInfoBO;
import com.as.validation.AddingInfoValidationException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class BankInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

        String errors = "";
		
		PersonProfileBean personProfileBean = (PersonProfileBean)request.getSession().getAttribute("personalInfo");
		
		personProfileBean.setBank(request.getParameter("bankName"));
		personProfileBean.setActNo(request.getParameter("actNo"));
		personProfileBean.setSsn(request.getParameter("ssn"));

		response.setContentType("text/html");

		PersonalInfoBO personalInfoBO = new PersonalInfoBO();
		
		try{
		 	personalInfoBO.addBankInfo(personProfileBean);
		 }catch (AddingInfoValidationException emve){
			 errors = emve.getErrorMessage();
		 }
		 catch (Exception e){
		 e.printStackTrace();
		 }
	
		if (errors.equals("")) {
			request.getSession().setAttribute("personalInfo", personProfileBean);
			personalInfoBO.addPersonDeatils(personProfileBean);
			response.sendRedirect("jsp/welcome4.jsp");
			
		}
		else {
			request.getSession().setAttribute("Errors", errors);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/BankInfo.jsp");
			rd.forward(request, response);
		}
	}
	
	public String performValidations(PersonProfileBean personProfileBean) {
		StringBuffer errorMsg = new StringBuffer();
		if (isDataEmpty(personProfileBean.getBank())) {
			errorMsg.append("-Bank is Blank <br>");
		}
		if (isDataEmpty(personProfileBean.getActNo())) {
			errorMsg.append("-Account is Blank <br>");
		}
		if (isDataEmpty(personProfileBean.getSsn())) {
			errorMsg.append("-SSN is Blank <br>");
		}
		return errorMsg.toString();
	}

	// check if the data is empty or not
	private boolean isDataEmpty(String data) {
		return data == null || data.trim().length() == 0;
	}
}
