package com.awsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.awsproject.repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userrepo;
	
	//handler for custom login
	@GetMapping("/login")
	public String customLogin(Model model)
	{
		model.addAttribute("title" , "Login-PAGE");
		return "login";
	}
	
	@GetMapping("/about")
	public String customAbout(Model model)
	{
		model.addAttribute("title" , "About-PAGE");
		return "about";
	}
}
