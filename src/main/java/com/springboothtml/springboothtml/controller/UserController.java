package com.springboothtml.springboothtml.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboothtml.springboothtml.entity.UserDetails;
import com.springboothtml.springboothtml.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute UserDetails ud) {
		repo.save(ud);
		System.out.println(ud);
		return "success";
	}
}
