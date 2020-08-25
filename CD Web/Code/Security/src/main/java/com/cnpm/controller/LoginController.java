package com.cnpm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("admin-panel")
public class LoginController {
	
	@RequestMapping(value= {"","index"},method= RequestMethod.GET)
	public String index() {
		return "redirect:/admin-panel/login";
	}
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login( @RequestParam(value="error",required = false) String error,
			@RequestParam(value="logout",required = false) String logout,ModelMap model
			) {
		if (error !=null) {
			model.put("msg","Invalid username or password");
		}
		if (logout != null) {
			model.put("msg","Logout successfully");
		}
		return "admin.login";
	}
	@RequestMapping(value= "logout",method= RequestMethod.GET)
	public String logout() {
		return "redirect:/admin-panel/login?logout";
	}
}
