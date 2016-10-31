package com.todo.items.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginManager {
	
	@Autowired
	LoginService authenticate;
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public String loginUser(){
		return "login";
	}
	
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.POST)
	public String loginRedirect(@RequestParam String name, String password, ModelMap model){
	
		if(!authenticate.validateUser(name, password)){
			return "login";
		}
		
		model.put("name", name);
		return "welcome";
	}
	
}
