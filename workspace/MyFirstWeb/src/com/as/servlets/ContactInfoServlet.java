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

public class ContactInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String errors = "";
		
		PersonProfileBean personProfileBean = (PersonProfileBean)request.getSession().getAttribute("personalInfo");
		
		personProfileBean.setAddress(request.getParameter("address"));
		personProfileBean.setCity(request.getParameter("city"));
		personProfileBean.setState(request.getParameter("state"));
		personProfileBean.setCountry(request.getParameter("country"));
		personProfileBean.setPhone(request.getParameter("phone"));

		response.setContentType("text/html");

		PersonalInfoBO personalInfoBO = new PersonalInfoBO();
		
		try{
		 	personalInfoBO.addContactInfo(personProfileBean);
		 }catch (AddingInfoValidationException emve){
			 errors = emve.getErrorMessage();
		 }
		 catch (Exception e){
		 e.printStackTrace();
		 }
		
		
		if (errors.equals("")) {
			request.getSession().setAttribute("personalInfo", personProfileBean);
			response.sendRedirect("html/BankInfo.html");
		} else {
			request.getSession().setAttribute("Errors", errors);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/ContactInfo.jsp");
			rd.forward(request, response);
		}

		// response.sendRedirect("html/BankInfo.html");
	}
}
