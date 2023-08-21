package com.day1a.day1a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController_Ex_1 {
	@GetMapping("welcome")
	public String Welcome() {
		return "Welcome Spring Boot!";
	}
}
