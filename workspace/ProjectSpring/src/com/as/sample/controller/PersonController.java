package com.as.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.as.sample.vo.PersonVO;

@Controller
@SessionAttributes("personVO")
public class PersonController {
	// The Mapped Request will be entered in the URL to open the index page.
	@RequestMapping(value = "/personEntry.do")
	public String displayName(Model model) {
		PersonVO personVo = new PersonVO();
		model.addAttribute("personVO",personVo);
		//Same Page ...
		return "personalInfo";
	}
	//The Mapped Request will be same as that passed in jsp page in the action method to open ...
	@RequestMapping(value = "/insertPerson.do" )
	public String insertName(@ModelAttribute("personVO") PersonVO personVO) {
//      This Return will pass to next page ... 
		return "contactInfo";
	}
}
