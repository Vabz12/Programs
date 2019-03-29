package com.as.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.as.sample.vo.PersonVO;

@Controller
@SessionAttributes("personVO")
public class ContactController {

	@RequestMapping(value= "/insertContact.do")
	public String insertContact(@ModelAttribute("personVO") PersonVO personVO)
	{
		return "bankInfo";
	}

}
