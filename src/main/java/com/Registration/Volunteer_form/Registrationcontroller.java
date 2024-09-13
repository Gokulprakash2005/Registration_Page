package com.Registration.Volunteer_form;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Registrationcontroller {
	
	@Autowired
	Dao obi;
	
@RequestMapping("/")
 public String register()
 {
	return "reg";
 }	

@RequestMapping("store")
public String storeing(@ModelAttribute("prakashjr") Apply application)
{
	obi.save(application);
	return "reg";
}

}
