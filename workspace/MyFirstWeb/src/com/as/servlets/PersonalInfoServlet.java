package com.as.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.as.bo.PersonProfileBean;
import com.as.bo.PersonalInfoBO;
import com.as.validation.AddingInfoValidationException;

public class PersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		String errors = "";
		// Step 1 : Capture input and populate the Bean/ VO ...
		PersonProfileBean personProfileBean = new PersonProfileBean();

		// Get the details and set it ...

		personProfileBean.setFirstName(request.getParameter("firstName"));
		personProfileBean.setLastName(request.getParameter("middleName"));
		personProfileBean.setMiddleName(request.getParameter("lastName"));
		personProfileBean.setGender(request.getParameter("gender"));

		// ----- Validations -----

		// Step 2 : Do Processing / Business Logic ...

		// Step 3 : Response Back
		PersonalInfoBO personalInfoBO = new PersonalInfoBO();
		
		try{
		 	personalInfoBO.addPersonalInfo(personProfileBean);
		 }catch (AddingInfoValidationException emve){
			 errors = emve.getErrorMessage();
		 }
		 catch (Exception e){
		 e.printStackTrace();
		 }
		
		//step3: Response Back
		if (errors.equals("")) {
			request.getSession().setAttribute("personalInfo", personProfileBean);
			response.sendRedirect("html/ContactInfo.html");
		} else {
			request.getSession().setAttribute("Errors", errors);
			RequestDispatcher rd = request.getRequestDispatcher("jsp/PersonalInfo.jsp");
			rd.forward(request, response);

		}

		// response.sendRedirect("html/ContactInfo.html");
		// response.sendRedirect("jsp/personalInfo.jsp");
	}

}
