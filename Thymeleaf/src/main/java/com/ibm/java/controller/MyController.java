package com.ibm.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.java.model.Login;

@Controller
public class MyController {

	@RequestMapping("/demo")
	public String demo(@ModelAttribute Login login, Model model) {
		model.addAttribute("login", login);
		return "home";
	}
	
	@RequestMapping("/go/{name}")
	public String demo1(Login login,@PathVariable("name") String name, Model model) {
		model.addAttribute("login", login); 
		return "home2";
	}
}
