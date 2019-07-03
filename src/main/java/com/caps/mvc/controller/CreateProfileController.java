package com.caps.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caps.mvc.dto.Person;
import com.caps.mvc.service.PersonServiceImpl;

@Controller
public class CreateProfileController {

	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String getRegistrationPage()
	{
		return "Registration";
	}
	
	@ResponseBody
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public String registration(Person person)
	{
	    PersonServiceImpl impl = new PersonServiceImpl();
	    boolean result = impl.createPerson(person);
	    if(result)
	    {
	    	return "Profile Created";
	    }
	    else
	    {
	    	return "Somethimng went Wrong";
	    }
	}
		
		
		
	
}
