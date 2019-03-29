package com.as.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.as.sample.service.PersonServiceImpl;
import com.as.sample.vo.PersonVO;

@Controller
@SessionAttributes("personVO")
public class BankController {

	@RequestMapping(value = "/insertBank.do")
	public String insertBank(@ModelAttribute("personVO") PersonVO personVO) {
		PersonServiceImpl.addPerson(personVO);
		return "personConfirmation";
	}
}