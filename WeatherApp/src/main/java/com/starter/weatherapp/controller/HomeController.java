package com.starter.weatherapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home(String userNm, String pwd) {
		return "Hello World";
	}
	
	@GetMapping("/user")
	public String user(String userNm, String pwd) {
		return "Hello user";
	}
	
	@GetMapping("/admin")
	public String admin(String userNm, String pwd) {
		return "Hello admin";
	}
	
	@PostMapping("/login")
	public void login() {
		
	}
}
