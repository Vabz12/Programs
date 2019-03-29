package com.as.sample.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.as.sample.dao.PersonDAOImpl;
import com.as.sample.vo.PersonVO;

@Service
@SessionAttributes("personVO")
public class PersonServiceImpl {
	public static void addPerson(@ModelAttribute("personVO")PersonVO personVO) {
		try {
			PersonDAOImpl personDAOImpl = new PersonDAOImpl();
			personDAOImpl.insertInfoInDatabase(personVO);
		} catch (Exception e) {
			System.out.println("Please Enter Valid Values .");
		}
	}

}
